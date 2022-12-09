package controllers;

import java.sql.SQLException;

import database.Database;

public class ControllerDVD extends Database {
    // Constructor untuk Connect ke Database
    public ControllerDVD() throws ClassNotFoundException, SQLException {
        super();
    }

    // Create
    public void insert(String nama, String kategori, int harga) throws SQLException {
        String reset = String.format("ALTER TABLE dvd AUTO_INCREMENT = %d", 0);
        String sql = String.format("INSERT INTO dvd (nama_dvd, kategori, harga) VALUE ('%s', '%s', %d)", nama, kategori,
                harga);
        this.setQuery(reset);
        this.execute();
        this.setQuery(sql);        
        this.execute();
    }

    // Read
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM dvd";
        this.setQuery(sql);
        this.fetch();
    }
    
    public String[] getById(int id) throws SQLException {
        String sql = String.format("SELECT * FROM dvd WHERE id_dvd = %d", id);
        this.setQuery(sql);
        this.fetch();
        
        String[] data = new String[4];
        while (this.value.next()) {
            data[0] =  Integer.toString(this.value.getInt("id_dvd"));
            data[1] = this.value.getString("nama_dvd");
            data[2] = this.value.getString("kategori");
            data[3] = Integer.toString(this.value.getInt("harga"));
        }
        return data;
    }
    
    // Update
    public void update(int id, String nama, String kategori, int harga) throws SQLException {
        String sql = String.format("UPDATE dvd SET nama_dvd = '%s', kategori = '%s', harga = %d WHERE id_dvd = %d",
                nama, kategori, harga, id);
        this.setQuery(sql);
        this.execute();
    }

    // Delete
    public void delete(int id) throws SQLException {
        String reset = String.format("ALTER TABLE dvd AUTO_INCREMENT = %d", 0);
        String sql = String.format("DELETE FROM dvd WHERE id_dvd = %d", id);
        this.setQuery(reset);
        this.setQuery(sql);
        this.execute();
        this.execute();
    }

    // Validation untuk mencegah redudansi data
    public boolean check(String nama) throws SQLException {
        getAll();
        while (this.value.next()) {
            if (this.value.getString("dvd").equals(nama)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean check(int id) throws SQLException {
        getAll();
        while (this.value.next()) {
            if (Integer.parseInt(value.getString("id_dvd")) == id) {
                return true;
            }
        }
        return false;
    }

    // Print dvd
    public String[][] show() throws SQLException {
        String[][] data = new String[this.len()][4];
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            data[i][0] =  Integer.toString(this.value.getInt("id_dvd"));
            data[i][1] = this.value.getString("nama_dvd");
            data[i][2] = this.value.getString("kategori");
            data[i][3] = Integer.toString(this.value.getInt("harga"));
            i++;
        }
        return data;
    }
    
    public int len() throws SQLException {
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            i++;
        }
        return i;
    }
}
