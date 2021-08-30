package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DeleteRowTest {

	public static void main(String[] args) throws Throwable {
//		Register the driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
//		establish the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
//		create statement
		Statement statement = connection.createStatement();
		
//		execute query
		int result = statement.executeUpdate("delete from student_info where firstname='Adarsh'");
		if (result == 1) {
			System.out.println("Data has been deleted");
		} else
			System.out.println("Data has not been deleted");
		
//		close the connection
		connection.close();
	}

}
