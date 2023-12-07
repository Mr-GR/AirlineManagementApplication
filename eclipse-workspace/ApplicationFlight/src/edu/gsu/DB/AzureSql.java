package edu.gsu.DB;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class AzureSql {
	public static void main(String[] args) {
		
		//Lets get started 
		System.out.println("perfroming setup..");
		Mycreds myCredentials = Mycreds.getDefaultInstance();
		String userName = myCredentials.getUsername();
		String userPassword = myCredentials.getPassword();
		String cnnString = 
				"jdbc:sqlserver://applicationprogramming.database.windows.net:1433;" 
				+ "database=applicationdb;"
				+ "user=" + userName + ";"
				+ "password=" + userPassword + ";"
				+ "encrypt=true;"
				+ "trustSerCertificate=false;"
				+ "loginTimeout=30;";
		
		AzureSql azure = new AzureSql();
		System.out.println("Connecting..");
		// FIND A TABLE FROM AZURE 
		String sql = "Select UserId, FirstName, LastName, Address, ZipCode, State, UserName, Password, Email, SSN, SecurityQuestion, SecurityAnswer From dbo.Users; ";
		azure.SelectAzureSql(userName, userPassword, sql, cnnString);
		// USE A TABLE FROM AZURE 
		sql = "SET IDENTITY_INSERT SalesLT.Customer ON; " +
			  "Insert Into SalesLT.Customer (CustomerID, FirstName, LastName, MiddleName, PasswordHash, PasswordSalt)" 
			   + " Values (52315145, 'Ricardio','Ortega', 'Hey', 'L/Rlwxzp4w7RWmEgXX+/A7cXaePEPcp+KwQhl2fJL7w=', 'asdfasd6'); " +
		      "SET IDENTITY_INSERT SalesLT.Customer OFF;";

		azure.ExecuteAzureSQL(userName, userPassword, sql, cnnString);
		
		
//		int customerIdToDelete = 52315145;
 //       String deleteSql = "DELETE FROM SalesLT.Customer WHERE CustomerID = ?;";

//        azure.DeleteAzureSQL(userName, userPassword, deleteSql, cnnString, customerIdToDelete);
		
	}
	
	private void SelectAzureSql(String userName, String userPassword, String sql, String cnnStr ) {
		// Get a result set from Azure and display it 
		System.out.println("selecting data..");
		ResultSet resultSet = null; 
		try (Connection cnn = DriverManager.getConnection(cnnStr);
				Statement statement = cnn.createStatement();) {
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1) + ", " + resultSet.getString(2) + ", " +resultSet.getString(3) + ", " + resultSet.getString(4) + ", " + resultSet.getString(5) +", " + resultSet.getString(6));
				
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
				
	}
	
	private void ExecuteAzureSQL(String userName, String userPassword, String sql, String cnnStr ) {
		System.out.println("executing SQL statement...");
		try (Connection cnn = DriverManager.getConnection(cnnStr);
				PreparedStatement statement = cnn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
			ResultSet resultSet = null;
			statement.execute();
			resultSet = statement.getGeneratedKeys();
			while (resultSet.next()) {
				System.out.println("key(s): " + resultSet.getString(1));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	 private void DeleteAzureSQL(String userName, String userPassword, String sql, String cnnStr, int customerId) {
	        System.out.println("deleting data...");

	        try (Connection cnn = DriverManager.getConnection(cnnStr);
	             PreparedStatement statement = cnn.prepareStatement(sql)) {

	            statement.setInt(1, customerId);
	            int rowsAffected = statement.executeUpdate();

	            System.out.println(rowsAffected + " row(s) deleted.");

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
 
}
}
