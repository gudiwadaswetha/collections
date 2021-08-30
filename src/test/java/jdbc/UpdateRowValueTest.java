package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class UpdateRowValueTest {

	public static void main(String[] args) throws Throwable {
		Connection connection = null;
		try {
//			Register the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
//			Establish the connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			
//			create statement
			Statement statement = connection.createStatement();
//			execute query
			int result = statement.executeUpdate("update student_info set firstname='raj' where firstname ='ram'");
			if (result == 1) {
				System.out.println("Data has been updated");
			} else
				System.out.println("Data has not been updated");
			
		} catch (Exception e) {
			
		} finally {
//			close the connection
			connection.close();
		}

		
	}

}
