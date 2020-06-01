package 机票预订系统;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLbean {
	 private final static String URL = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=数据库名称"; 
	 private static final String USER="sa"; 
	 private static final String PASSWORD="123"; 
	 private static Connection conn=null; 
	 private Statement stmt;
	 private ResultSet rs ;
	     static{ 
	        try { 
	             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
	            conn=(Connection)DriverManager.getConnection(URL,USER,PASSWORD); 
         } 
	        catch (ClassNotFoundException e) {
	        	   e.printStackTrace(); 
	        	         } catch (SQLException e) {
	        	             e.printStackTrace(); 
	                }
	            }
	     public static Connection getConnection(){
	         return conn; 
	     }
	    //搜索机票
	     public Object[][] Ticket(Ticket ticket) {
	    		Object[][] ob = new Object[20][8];
	    		int n = 0;
	    		try {
	    	       
	    			String sql = "select * FROM Airline AND Flight WHERE DNumber LIKE'%D%' AND ENumber LIKE'%E%' ";
	    			PreparedStatement ps = conn.prepareStatement(sql);
	    			rs = ps.executeQuery();
	    			while (rs.next()) {
	    				ob[n][0] = rs.getString("AirlineCode");
	    				ob[n][1] = rs.getString("AirlineName");
	    				ob[n][2] = rs.getString("DNumber");
	    				ob[n][3] = rs.getString("ENumber");
	    				ob[n][4] = rs.getString("Distance");
	    				ob[n][5] = rs.getString("Fare");
	    				ob[n][6] = rs.getFloat("DepatureTime");
	    				ob[n][7] = rs.getFloat("ArrivalTime");
	    				ob[n][8] = rs.getFloat("Discount");
	    				n++;
	    			}
	    		} catch (Exception e) {
	    			System.out.println(e);
	    		}
	    		return ob;
	    	}
	     //查询机票
	     public Object[][] Select(Ticket ticket) {
	    		Object[][] ob = new Object[20][8];
	    		int n = 0;
	    		try {
	    	       
	    			String sql = "select * FROM Airline AND Flight WHERE DNumber LIKE'%D%' AND ENumber LIKE'%E%' ";
	    			PreparedStatement ps = conn.prepareStatement(sql);
	    			rs = ps.executeQuery();
	    			while (rs.next()) {
	    				ob[n][0] = rs.getString("PassengerName");
	    				ob[n][1] = rs.getString("AirlineCode");
	    				ob[n][2] = rs.getString("DNumber");
	    				ob[n][3] = rs.getString("ENumber");
	    				ob[n][4] = rs.getString("Fare");
	    				ob[n][5] = rs.getFloat("DepatureTime");
	    				ob[n][6] = rs.getFloat("ArrivalTime");
	    				n++;
	    			}
	    		} catch (Exception e) {
	    			System.out.println(e);
	    		}
	    		return ob;
	    	}
	     //购买机票
	     public Object[][]  Inset(Ticket ticket) {
	    		Object[][] ob = new Object[20][5];
	    		int n = 0;
	    		try {
	    			String sql = "INSERT INTO passenger VALUES ('PassengerName','AirlineCode',DNumber,ENumber,Fare,'DepatureTime','ArrivalTime')";
	    			PreparedStatement ps = conn.prepareStatement(sql);
	    			rs = ps.executeQuery();
	    			while (rs.next()) {
	    				ob[n][0] = rs.getString("PassengerName");
	    				ob[n][1] = rs.getString("AirlineCode");
	    				ob[n][2] = rs.getString("DNumber");
	    				ob[n][3] = rs.getString("ENumber");
	    				ob[n][4] = rs.getString("Fare");
	    				ob[n][5] = rs.getFloat("DepatureTime");
	    				ob[n][6] = rs.getFloat("ArrivalTime");
	    				n++;
	    			}
	    		} catch (Exception e) {
	    			System.out.println(e);
	    		}
	    		return ob;
	    	}
  //退票
    public Object[][] Delete(Ticket ticket) {
		Object[][] ob = new Object[20][5];
		int n = 0;
		try {
			String sql = "DELETE FROM passenger VALUES ('PassengerName','AirlineCode',DNumber,ENumber,Fare,'DepatureTime','ArrivalTime')";
			PreparedStatement ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				ob[n][0] = rs.getString("PassengerName");
				ob[n][1] = rs.getString("AirlineCode");
				ob[n][2] = rs.getString("DNumber");
				ob[n][3] = rs.getString("ENumber");
				ob[n][4] = rs.getString("Fare");
				ob[n][5] = rs.getFloat("DepatureTime");
				ob[n][6] = rs.getFloat("ArrivalTime");
				n++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return ob;
    }
}
