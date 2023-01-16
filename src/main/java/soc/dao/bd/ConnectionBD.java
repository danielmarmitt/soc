package soc.dao.bd;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionBD {
	
	private static Connection con = null;
    String url = "jdbc:mysql://127.0.0.1:3321/avaliacao";
    String user = "root";
    String pass = "Socdm2023@";

	
	
/*	public Connection() {
		super();
		
		//try {
		//	Class.forName("com.mysql.jdbc.Driver");
		//	return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3321/avaliacao", "root", "Socdm2023@");		
			
		//} catch (Exception e) {
			// TODO: handle exception
		//}
		
	}*/
	
	
    private ConnectionBD() {
        url = "jdbc:mysql://127.0.0.1:3321/avaliacao";
        user = "root";
        pass = "Socdm2023@";
        
        if (con==null) {
	    	try {
		            Class.forName("com.mysql.jdbc.Driver");
		            con = DriverManager.getConnection(url, user, pass);
		    }
	        catch (ClassNotFoundException | SQLException e) {
	            throw new IllegalArgumentException(e.getMessage());
	        }
	    }
        
    }
	
    public static Connection getConnection()
    {
    	new ConnectionBD();
    	return con;
    }	
	
	

}
