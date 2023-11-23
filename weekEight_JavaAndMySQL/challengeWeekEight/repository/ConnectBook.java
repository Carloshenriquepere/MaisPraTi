package weekEight_JavaAndMySQL.challengeWeekEight.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectBook {

    private static final String URL = "jdbc:mysql://localhost:3307/bookstore"; //Connection URL

    private static final String USER = "root"; //Database user

    private static final String PASSWORD = ""; //Database password

    public static Connection getConnectsBook(){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static void closeConnectsBook(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
