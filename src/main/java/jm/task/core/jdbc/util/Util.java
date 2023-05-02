package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/kata";
    private static final String USER = "root";
    private static final String PASSWORD = "gtqju7VrdU";

    public static Connection getConnection()  {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL(URL);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

