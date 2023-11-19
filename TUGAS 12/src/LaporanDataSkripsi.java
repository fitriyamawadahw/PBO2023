/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectuas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author Fitriyah
 */
public class LaporanDataSkripsi extends javax.swing.JFrame {

    /**
     * Creates new form LaporanDataSkripsi
     */
    private Timer refreshTimer;

    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    ArrayList<DataSkripsiPOJO> dataSkripsi;

    private void updateTable(EntityManager em) {
        dataSkripsi.clear();

        // ... (kode untuk mendapatkan data dari database)
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.addColumn("Nomor Indeks");
        newModel.addColumn("Judul Skripsi");
        newModel.addColumn("Penulis");
        newModel.addColumn("Program Studi");
        newModel.addColumn("Tahun Terbit");
        newModel.addColumn("Jumlah Halaman");
        newModel.addColumn("Tanggal Penyelesaian");

        for (DataSkripsiPOJO data : dataSkripsi) {
            Object[] rowData = {
                data.getNomorIndeks(),
                data.getJudulSkripsi(),
                data.getPenulis(),
                data.getProgramStudi(),
                data.getTahunTerbitS(),
                data.getJumlahHalamanS(),
                data.getTanggalPenyelesaian()
            };
            newModel.addRow(rowData);
        }

        jTable1.setModel(newModel);
    }

    private void tampil(Connection conn) {
        dataSkripsi.clear();
        try {
            // Ganti query dengan query yang sesuai
            String sql = "SELECT * FROM data_skripsi";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                DataSkripsiPOJO dataPOJO = new DataSkripsiPOJO();

                dataPOJO.setNomorIndeks(String.valueOf(rs.getObject(1)));
                dataPOJO.setJudulSkripsi(String.valueOf(rs.getObject(2)));
                dataPOJO.setPenulis(String.valueOf(rs.getObject(3)));
                dataPOJO.setProgramStudi(String.valueOf(rs.getObject(4)));
                dataPOJO.setTahunTerbitS(String.valueOf(rs.getObject(5)));
                dataPOJO.setJumlahHalamanS(String.valueOf(rs.getObject(6)));
                dataPOJO.setTanggalPenyelesaian(String.valueOf(rs.getObject(7)));
                dataSkripsi.add(dataPOJO);
            }
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            for (DataSkripsiPOJO data : dataSkripsi) {

                Object[] baris = new Object[7];
                baris[0] = data.getNomorIndeks();
                baris[1] = data.getJudulSkripsi();
                baris[2] = data.getPenulis();
                baris[3] = data.getProgramStudi();
                baris[4] = data.getTahunTerbitS();
                baris[5] = data.getJumlahHalamanS();
                baris[6] = data.getTanggalPenyelesaian();
                model.addRow(baris);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AddDataBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LaporanDataSkripsi() {
        try {
            dataSkripsi = new ArrayList<>();
            initComponents();
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/UASPBOFitriya", "postgres", "pipit1702");
            tampil(conn);
                        refreshTimer = new Timer(5000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tampil(conn);
                }
            });
            refreshTimer.start();

        } catch (SQLException ex) {
            Logger.getLogger(AddDataBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor Indeks", "Judul Skripsi", "Penulis", "Program Studi", "Tahun Terbit", "Jumlah Halaman", "Tanggal Penyelesaian"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 830, 190));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("LAPORAN DATA SKRIPSI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 420, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setText("DASHBOARD");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 151, -1, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel13.setText("DATA BUKU                                >");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 200, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel14.setText("DATA SKRIPSI                            >");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 200, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel15.setText("LAPORAN DATA BUKU              >");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 200, 40));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel16.setText("LAPORAN DATA SKRIPSI          >");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 200, 40));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel17.setText("PEMINJAMAN                             >");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 200, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/setting 1.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PERPUSTAKAAN SISTEM INFORMASI");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel2.setText("SEARCH :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, 20));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 140, -1));

        jLabel3.setText("SHORT BY :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, -1, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nomor Indeks", "Judul Skripsi", "Penulis", "Program Studi", "Tahun Terbit", "Jumlah Halaman", "Tanggal Penyelesaian" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 300, 160, -1));

        jButton1.setBackground(new java.awt.Color(13, 67, 170));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CETAK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        jButton2.setBackground(new java.awt.Color(13, 67, 170));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("UPLOAD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Rekomendasi 2 (3).png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        new AddDataBuku().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        new AddDataSkripsi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        new LaporanDataBuku().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        new PeminjamanGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();

        int i = filechooser.showOpenDialog(null);
        if (i == JFileChooser.APPROVE_OPTION) {

            EntityManager entityManager = Persistence.createEntityManagerFactory("UASPBOFitriyaPU").createEntityManager();
            entityManager.getTransaction().begin();

            File f = filechooser.getSelectedFile();
            String filepath = f.getPath();
            String fi = f.getName();
            //Parsing CSV Data
            System.out.print(filepath);
            DefaultTableModel csv_data = new DefaultTableModel();

            try {

                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath));
                org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(inputStreamReader);
                for (CSVRecord csvRecord : csvParser) {

                    DataSkripsi d = new DataSkripsi();

                    d.setNomorindeks(csvRecord.get(0));
                    d.setJudulskripsi(csvRecord.get(1));
                    d.setPenulis(csvRecord.get(2));
                    d.setProgramstudi(csvRecord.get(3));
                    d.setTahunterbits(csvRecord.get(4));
                    d.setJumlahhalamans(csvRecord.get(5));
                    d.setTanggalpenyelesaian(csvRecord.get(6));

                    entityManager.persist(d);

                }

            } catch (Exception ex) {
                System.out.println("Error in Parsing CSV File");
            }

            entityManager.getTransaction().commit();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
            try {
            String selection = (String) jComboBox1.getSelectedItem();
            String searchTerm = jTextField1.getText().trim().toLowerCase();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT d FROM DataSkripsi d WHERE ";

            switch (selection.toLowerCase()) {
                case "nomor indeks":
                    queryString += "LOWER(d.nomorindeks) LIKE LOWER(:searchTerm)";
                    break;
                case "judul skripsi":
                    queryString += "LOWER(d.judulskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case "penulis":
                    queryString += "LOWER(d.penulis) LIKE LOWER(:searchTerm)";
                    break;
                case "program studi":
                    queryString += "LOWER(d.programstudi) LIKE LOWER(:searchTerm)";
                    break;
                case "tahun terbit":
                    queryString += "LOWER(d.tahunterbits) LIKE LOWER(:searchTerm)";
                    break;
                case "jumlah halaman":
                    queryString += "LOWER(d.jumlahhalamans) LIKE LOWER(:searchTerm)";
                    break;
                case "tanggal penyelesaian":
                    queryString += "LOWER(d.tanggalpenyelesaian) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected.");
            }

            // Create and execute the JPA query
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();

            TypedQuery<DataSkripsi> query = em.createQuery(queryString, DataSkripsi.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<DataSkripsi> results = query.getResultList();

            DefaultTableModel dataModel = new DefaultTableModel();

            // Add columns to the model
            dataModel.addColumn("Nomor Indeks");
            dataModel.addColumn("Judul Skripsi");
            dataModel.addColumn("Penulis");
            dataModel.addColumn("Program Studi");
            dataModel.addColumn("Tahun Terbit");
            dataModel.addColumn("Jumlah Halaman");
            dataModel.addColumn("Tanggal Penyelesaian");

            // Add rows to the model
            for (DataSkripsi result : results) {
                Object[] rowData = {
                    result.getNomorindeks(),
                    result.getJudulskripsi(),
                    result.getPenulis(),
                    result.getProgramstudi(),
                    result.getTahunterbits(),
                    result.getJumlahhalamans(),
                    result.getTanggalpenyelesaian()
                };
                dataModel.addRow(rowData);
            }

            // Set jTable1 with the created model
            jTable1.setModel(dataModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
            String reportPath = "src/projectuas/report2.jrxml";
            String selection = ((String) jComboBox1.getSelectedItem()).toLowerCase();
            String searchTerm = jTextField1.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT d FROM DataSkripsi d WHERE ";

            switch (selection.toLowerCase()) {
                case "nomor indeks":
                    queryString += "LOWER(d.nomorindeks) LIKE LOWER(:searchTerm)";
                    break;
                case "judul skripsi":
                    queryString += "LOWER(d.judulskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case "penulis":
                    queryString += "LOWER(d.penulis) LIKE LOWER(:searchTerm)";
                    break;
                case "program studi":
                    queryString += "LOWER(d.programstudi) LIKE LOWER(:searchTerm)";
                    break;
                case "tahun terbit":
                    queryString += "LOWER(d.tahunterbits) LIKE LOWER(:searchTerm)";
                    break;
                case "jumlah halaman":
                    queryString += "LOWER(d.jumlahhalamans) LIKE LOWER(:searchTerm)";
                    break;
                case "tanggal penyelesaian":
                    queryString += "LOWER(d.tanggalpenyelesaian) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected.");
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<DataSkripsi> cq = cb.createQuery(DataSkripsi.class);
            Root<DataSkripsi> bok = cq.from(DataSkripsi.class);
            cq.select(bok);

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            TypedQuery<DataSkripsi> q = em.createQuery(cq);
            List<DataSkripsi> list = q.getResultList();
            Query query = em.createQuery(queryString);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<DataSkripsi> results = query.getResultList();
            
            // Menyiapkan data untuk laporan
            List<Object[]> data = new ArrayList<>();
            for (DataSkripsi result : results) {
                    Object[] rowData = {
                   result.getNomorindeks(),
                    result.getJudulskripsi(),
                    result.getPenulis(),
                    result.getProgramstudi(),
                    result.getTahunterbits(),
                    result.getJumlahhalamans(),
                    result.getTanggalpenyelesaian(),
                        };
                    data.add(rowData);
                }
             em.getTransaction().commit();
           em.close();
            emf.close();

            // Membuat sumber data untuk JasperReports dari data hasil pencarian
   
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);
            
            // Memuat file desain laporan (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
                JasperPrint print = JasperFillManager.fillReport(jasperReport, null, dataSource);
                JasperViewer viewer = new JasperViewer(print, false);
                viewer.setVisible(true);

        } catch (JRException ex) {
                Logger.getLogger(LaporanDataSkripsi.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LaporanDataSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaporanDataSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaporanDataSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaporanDataSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaporanDataSkripsi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
