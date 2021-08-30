package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class GetTableDataFromDatabase {

	public static void main(String[] args) throws Throwable {
//		Register the driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
//		Establish the connection to database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
//		Issue the statement
		Statement statement = connection.createStatement();
		
//		Execute the query
		ResultSet resultSet = statement.executeQuery("select * from student_info");
		
//		print the result
		while (resultSet.next()) {
			if (resultSet.getString(2).equalsIgnoreCase("shwetha")) {
				System.out.println("PASS");
			}
			System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getString(4));
		}

		connection.close();
	}

}
