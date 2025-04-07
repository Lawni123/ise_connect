package com.iseConnect.login;

import java.sql.*;

public class LoginDAO {

    public boolean check(String uname, String pass) {
        String query = "SELECT * FROM users WHERE email = ? AND pasword = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            if (connection != null) {
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, uname);
                preparedStatement.setString(2, pass);

                resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return true;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error executing query.");
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources.");
                e.printStackTrace();
            }
        }

        return false;
    }

    public Connection getConnection() {
    	String url = "jdbc:postgresql://dpg-cvq4cv3e5dus73f1bg7g-a.oregon-postgres.render.com:5432/iseconnect";
        String username = "iseconnect_user";
        String password = "14rKyqn55ZrJaohX4lTzQawAZoaXW7lW"; // Replace with your PostgreSQL password

        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error connecting to the database.");
            e.printStackTrace();
        }

        return null;
    }
}
