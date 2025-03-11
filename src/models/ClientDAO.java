package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.Client;
import models.User;
import models.ConnexionDAO;

public class ClientDAO {
	public ClientDAO() {
		try {
			// Connection à MySQL
			String url = "jdbc:mysql://localhost:3306/aichi";
			String username = "UserAichi";
			String password = "aichiAppProject";
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection(url,
			username, password);
			
		 } catch (SQLException e) { e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	/*public void ajouterClient( Client client) throws SQLException {
		String query = "INSERT INTO `article`(`nom`,`description`,`prix`,`quantite`) VALUES (?,?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(query);
		stmt.setString(1, article.getNom());
		stmt.setString(2, article.getDescription());
		stmt.setDouble(3, article.getPrix());
		stmt.setInt(4, (int)article.getQuantite());
		try {
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
	}*/
	public void modifierArticle() {
		
	}
	public void supprimerArticle() throws SQLException {
		String query = "DELETE FROM 'artcile' WHERE article_id = ?";
		PreparedStatement stmt = connection.prepareStatement(query);

		try {
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
