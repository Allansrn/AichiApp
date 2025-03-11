package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDAO {

    //DATA
    private String servername;
    private String username;
    private String password;
    private String dbname;
    private Connection connection;

    //CONSTRUCTEUR
    public ConnexionDAO(String servername, String username, String password, String dbname) {
        this.servername = servername;
        this.username = username;
        this.password = password;
        this.dbname = dbname;
    }
    
    public String getServername() {
    	return this.servername;
    }
    
    public String getUsername() {
    	return this.username;
    }
    
    public String getPassword() {
    	return this.password;
    }
    
    public String getDbname() {
    	return this.dbname;
    }
    
    /*
		nom db : aichi
		username : UserAichi
		password : aichiAppProject 
    */

    public void connexion() {
        try {
            // Connexion à MySQL 
            String url = "jdbc:mysql://" + this.servername + ":3306/" + this.dbname;
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, this.username, this.password);
            

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    
    public boolean testConnection() {
        connexion();  
        try {
            if (connection != null && connection.isValid(2)) { // Vérifiez si la connexion est valide avec un timeout de 2 secondes
                System.out.println("La connexion à la base de données est réussie.");
                return true;
            } else {
                System.out.println("La connexion à la base de données a échoué.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }



    public void closeConnexion() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
