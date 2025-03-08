package pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertDataIntoDataBase {

	public static void main(String[] args) throws Throwable {

		// step1: register driver
				Driver driverRef = new Driver();
				DriverManager.registerDriver(driverRef);

				// step2:- get connection to database
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employedata", "root", "root");

				// step3:-create SQL Statement
				Statement state = conn.createStatement();
				String query = "insert into employee(regno,firstname,lastname,address)values('4','Nithin','reddy','bglore'),('5','Shobha','reddy','bglore')";
				
				int result = state.executeUpdate(query);

				if(result!=1)
				{
					System.out.println("user is created");
				}
				else
				{
					System.out.println("user is not created");
				}
				conn.close();
	}

}
