import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// driver setup
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception ex) {
			// handle the error
			System.out.println("Exception Driver: " + ex.getMessage());
		}

		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/table2?serverTimezone=UTC", "root", "");
			// "jdbc:mysql://localhost:3308/table2?serverTimezone=UTC","root", "");
			// here table2 is database name, root is username and password empty
			// serverTimezone=UTC might been needed

			Statement myState = conn.createStatement();
			ResultSet rs = myState.executeQuery("SELECT * FROM merchants WHERE Merchants_ID=1");

			// ResultSet return
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			}

			conn.close();
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());

		}
	}
}
