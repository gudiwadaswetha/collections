package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertValuesIntoRowTest {

	public static void main(String[] args) throws Throwable {
//		register the driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
//		establish the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
//		create statement
		Statement statement = connection.createStatement();
//		execute the query
		int result = statement.executeUpdate("insert into student_info values('8','Adarsh','','s')");
		
		if (result == 1) {
			System.out.println("Data has been inserted");
		} else
			System.out.println("Data has not been inserted");
		
//		close the connection
		connection.close();
	}

}
