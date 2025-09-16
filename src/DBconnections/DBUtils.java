package DBconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		
		String url = "jdbc:sqlserver://DESKTOP-NPA13JS\\SQLEXPRESS;databaseName=OnlineBookstor;encrypt=true;trustServerCertificate=true";
		Connection con = DriverManager.getConnection(url);
		Statement s= con.createStatement();
		ResultSet rs= s.executeQuery("select username,pswd from usercred where usercode='123'");
		
		while(rs.next()){		
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("pswd"));
		System.out.println(rs.getString("pswd1"));
		}
	
	}

}
