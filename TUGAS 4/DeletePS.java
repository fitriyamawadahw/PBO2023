/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconnectiondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fitriyah
 */
public class DeletePS {

    static final String DB_URL = "jdbc:postgresql://localhost:5433/TugasPBO";
    static final String USER = "postgres";
    static final String PASS = "pipit1702";
    static final String QUERY = "DELETE FROM program_studi WHERE kode_prodi = 'H2'";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); Statement stmt = conn.createStatement()) {

            // Eksekusi pernyataan SQL
            int rowsAffected = stmt.executeUpdate(QUERY);
            if (rowsAffected > 0) {
                System.out.println("Data berhasil dihapus!");
            } else {
                System.out.println("Gagal menghapus data.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
