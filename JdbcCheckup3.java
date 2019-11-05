/*
 * Try this program and make it working first.
 *
 * This sample can be used to check the JDBC installation.
*/

// You need to import the java.sql package to use JDBC
import java.sql.*;

// We import java.io to be able to read from the command line
import java.io.*;

//import oracle.jdbc.OracleDriver;

class JdbcCheckup3
{
  public static void main (String args [])
       throws SQLException, IOException
  {
    // Load the Oracle JDBC driver
    try {
       Driver myDriver = new oracle.jdbc.driver.OracleDriver();
       DriverManager.registerDriver( myDriver );
    } catch (Exception e) {
    	
    }
       
    String serverName = "csor12c.dhcp.bsu.edu";
    String portNumber = "1521";
    String sid = "or12cdb";
    String url ="jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;

    Connection conn =
    	      DriverManager.getConnection (url,
    	           "BSU901167475", "901167475");



    //System.out.println ("connected.");

    // Create a statement
    Statement stmt = conn.createStatement ();

    // Do the SQL
    ResultSet rset = stmt.executeQuery ("select * from employee order by last_name");

    System.out.println("Employee table:");
    System.out.println("---------------------------------------------------------------------------");
    while (rset.next ()){
      System.out.println (rset.getString (1) + " " + rset.getString(2)
    		  + " " + rset.getString(3)
    		  + " " + rset.getString(4)
    		  + " " + rset.getString(5)
    		  + " " + rset.getString(6));
    }

    //System.out.println ("Your JDBC installation is correct.");

    // close the resultSet
    rset.close();

    // Close the statement
    stmt.close();

    // Close the connection
    conn.close();
  }

}
