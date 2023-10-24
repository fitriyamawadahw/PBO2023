/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasconnectiondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fitriyah
 */
public class SelectPS {

    static final String DB_URL = "jdbc:postgresql://localhost:5433/TugasPBO";
    static final String USER = "postgres";
    static final String PASS = "pipit1702";
    static final String QUERY = "SELECT * FROM program_studi";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(QUERY);) {
            while (rs.next()) {
                //Display values
                System.out.println("Kode Prodi: " + rs.getString("kode_prodi"));
                System.out.println("Nama Prodi: " + rs.getString("nama_prodi"));
                System.out.println("Jenjang: " + rs.getString("jenjang"));
                System.out.println("Nama Kaprodi: " + rs.getString("nama_kaprodi"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
