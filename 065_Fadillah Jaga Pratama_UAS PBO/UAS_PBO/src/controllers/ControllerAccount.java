package controllers;

import java.sql.SQLException;
import database.Database;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ControllerAccount extends Database {
    public ControllerAccount() throws ClassNotFoundException, SQLException {
        super();
    }

    public boolean authentication(String username, String password) throws SQLException {
        String sql = String.format("SELECT * FROM user WHERE username = '%s' AND password = '%s'", username, password);
        this.setQuery(sql);
        this.fetch();
        
        while(this.value.next()) {
            if(this.value.getString("username") != null) {
                return true;
            }
        }        
        return false;
    }
}
