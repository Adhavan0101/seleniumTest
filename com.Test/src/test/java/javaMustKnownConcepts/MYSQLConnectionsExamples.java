package javaMustKnownConcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class MYSQLConnectionsExamples {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/selenium");
			java.sql.Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM `friends_number`");

			while (result.next()) {
				System.out.println("Name : " + result.getString(1) + " / Pincode : " + result.getInt(2));
				//connection.close();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
