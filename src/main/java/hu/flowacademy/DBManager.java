package hu.flowacademy;

import java.sql.*;

public class DBManager {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://remotemysql.com:3306/sM0u1J3Mby";
    static final String USER = "sM0u1J3Mby";
    static final String PASS = "Yu5fWRjE7h";
    private Connection conn = null;
    private Statement stmt = null;
    private static DBManager instance;

    private DBManager() throws ClassNotFoundException {
        Class.forName(JDBC_DRIVER);
    }

    public void connect() throws SQLException {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    private void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    public static DBManager getInstance() throws ClassNotFoundException {
        if (instance == null) {
            instance = new DBManager();
        }
        return instance;
    }

    public String executeSQL(String sql) {
        try {
            connect();
            stmt = conn.createStatement();
            stmt.execute(sql);

            stmt.close();
            close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return sql;
    }

    public void createSLQ() throws SQLException {
        PreparedStatement statement = conn.prepareStatement("ads");

    }

}
