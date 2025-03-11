package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.ConnexionDAO;
import models.User;
import models.UserDAO;

public class testAddUser {

    private static Connection connection;

    User user = new User('userName','passWord','roLe');

}