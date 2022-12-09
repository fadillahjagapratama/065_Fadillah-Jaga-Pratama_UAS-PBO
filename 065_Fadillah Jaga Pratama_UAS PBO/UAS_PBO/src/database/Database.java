package database;

import java.sql.*;
import specs.DatabaseSpecs;

public abstract class Database implements DatabaseSpecs {
    private final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String DB_URL = "jdbc:mysql://localhost/toko_dvd";
    private final static String USER = "root";
    private final static String PASS = "";

    private Connection conn;
    private Statement stmt;
    protected ResultSet value;
    private String query;

    public Database() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
    }

    @Override
    public void setQuery(String sql) {
        this.query = sql;
    }

    @Override
    public String getQuery() {
        return this.query;
    }

    public void setClose() throws SQLException {
        this.stmt.close();
        conn.close();
    }

    public void execute() throws SQLException {
        stmt.execute(this.query);
    }

    public void fetch() throws SQLException {
        this.value = stmt.executeQuery(this.query);
    }
}