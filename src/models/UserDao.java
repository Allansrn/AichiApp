package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.ConnexionDAO;
import models.User;

public class UserDao {
	private static Connection connection;
	public UserDao() {
	try {
		// Connection à MySQL
		String url = "jdbc:mysql://localhost:3306/aichi";
		String username = "root";
		String password = "";
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url,
		username, password);
		
	 } catch (SQLException e) { e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	
	//Probleme de la fonction resultSet.net renvoie tout le temps false
	public static boolean verifyUser(User user) throws SQLException {
		boolean isValid = false ;

	    if (connection == null || connection.isClosed()) {
	        return isValid;
	    }

	    String query = "SELECT * FROM users WHERE username = ? AND password = ?";
	    try (PreparedStatement statement = connection.prepareStatement(query)) {
	        statement.setString(1, user.getUsername());
	        statement.setString(2, user.getPassword());
	        try (ResultSet resultSet = statement.executeQuery()) {
	        	isValid = resultSet.next();
				System.out.println(isValid);
	            return isValid ; // Retourne true si un utilisateur est trouvé
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return isValid;
	    }
	}


	
	public void ajouterUser(User user) throws SQLException {
		String query = "INSERT INTO `users`(`username`,`password`,`role`) VALUES (?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(query);
		stmt.setString(1, user.getUsername());
		stmt.setString(2,user.getPassword());
		stmt.setString(3, user.getRole());
		try {
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}
	
	
	public String afficherUser() {
		//String query = "SELECT * FROM user ";
		//PreparedStatement stmt = connection.prepareStatement(query);
		
		return "" ;
	}

	public String test(){
		return "dans user dao";
	}
}
