package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import routes.Routes;
import routes.Types;

public class DBConnection {
	
	private final String url = "jdbc:sqlite:rutas.db";
	
	/*
	 *  Connect to the rutas.db database
	 *  
	 *  @return the Connection object
	 */
	private Connection connect() {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(this.url);
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
			
		return conn;
	}
	
	/*
	 * Get the number of rows in type table
	 * 
	 * @param table
	 * @return number of rows
	 */
	private int getTableSize(String table) {
		
		String query = "SELECT COUNT(*) FROM " + table;
		int size = 0;
		
		try (Connection conn = this.connect();
				Statement stmt = conn.createStatement()) {
			
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				
				size = rs.getInt(1);
			}
						
		} catch (SQLException e) {
			
			System.err.println(e.getMessage());
		}
		
		return size;
	}

	/*
	 * Insert a new row into the type table.
	 * 
	 * @param description
	 * @param transport
	 * @param cost_km
	 */
	public void insert(String description, String transport, double cost_km)
	{
		String query = "INSERT INTO tipo(descripcion, transporte, costo_km) VALUES (?,?,?)";
		
		try (Connection conn = this.connect();
				PreparedStatement pstmt = conn.prepareStatement(query)) {
			
			pstmt.setString(1, description);
			pstmt.setString(2, transport);
			pstmt.setDouble(3, cost_km);
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			
			System.err.println(e.getMessage());
		}
	}
	
	/*
	 * Insert a new row into the route table.
	 * 
	 * @param init_city
	 * @param dest_city
	 * @param init_date
	 * @param end_date
	 * @param distance
	 * @param travel_dur
	 */
	public void insert(String init_city, String dest_city, String init_date, String end_date, double distance, int travel_dur) {
		
		String query = "INSERT INTO ruta(ciudad_ini, ciudad_dest, fecha_ini, fecha_fin, distancia, horas_viaje)"
				+ " VALUES (?,?,?,?,?,?)";
		
		try (Connection conn = this.connect();
				PreparedStatement pstmt = conn.prepareStatement(query)) {
			
			pstmt.setString(1, init_city);
			pstmt.setString(2, dest_city);
			pstmt.setString(3, init_date);
			pstmt.setString(4, end_date);
			pstmt.setDouble(5, distance);
			pstmt.setInt(6, travel_dur);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			System.err.println(e.getMessage());
		}
	}
	
	// TODO: Finish method.
	public void update() {
		Connection c = null;
		Statement stmt = null;
		
		try {
			c = this.connect();
			c.setAutoCommit(false);
			stmt = c.createStatement();
			
			String sqlQuery = "UPDATE company SET SALARY=25000.00 WHERE id=1;";
			stmt.executeUpdate(sqlQuery);
			c.commit();
			
			stmt.close();
			c.close();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
	}
	
	/*
	 * Get all rows in the route table
	 * 
	 * @return an array of Route objects
	 */
	public Routes[] fetchFromRoutes() {
		
		int size = this.getTableSize("ruta");
		String query = "SELECT * FROM ruta";
		Routes[] result = new Routes[size];
		
		try (Connection conn = this.connect();
				Statement  stmt = conn.createStatement()) {
			
			ResultSet rs = stmt.executeQuery(query);
			int i = 0;
			
			while (rs.next()) {
				
				Routes r = new Routes(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), 
						rs.getFloat(6), rs.getInt(7));
				
				result[i] = r;
				
				i++;
			}
			
		} catch (SQLException e) {
			
			System.err.println(e.getMessage());
		}
		
		return result;
	}
	
	/*
	 * Get all rows in the type table
	 * 
	 * @return an array of Types objects
	 */
	public Types[] fetchFromTypes() {
		
		int size = this.getTableSize("tipo");
		String query = "SELECT * FROM tipo";
		Types result[] = new Types[size];
		
		try (Connection conn = this.connect();
				Statement stmt = conn.createStatement()) {
			
			ResultSet rs = stmt.executeQuery(query);
			int i = 0;
			
			while (rs.next()) {
				
				Types t = new Types(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
				
				result[i] = t;
				i++;
			}
			
		} catch (SQLException e) {
			
			System.err.println(e.getMessage());
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		DBConnection db_conn = new DBConnection();
		
		Types [] arr = db_conn.fetchFromTypes();
		
		for (var r: arr) {
			
			System.out.println(r.toString());
		}
	}

}