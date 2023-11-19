/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectuas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author Fitriyah
 */
public class PeminjamanGUI extends javax.swing.JFrame {

    private Timer refreshTimer;

    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    ArrayList<PeminjamanPOJO> dataPeminjaman;

    private void updateTable(EntityManager em) {
        dataPeminjaman.clear();

        // ... (kode untuk mendapatkan data dari database)
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.addColumn("ID Peminjam");
        newModel.addColumn("Nama");
        newModel.addColumn("Program Studi");
        newModel.addColumn("Semester");
        newModel.addColumn("Fakultas");
        newModel.addColumn("Tanggal Peminjaman");
        newModel.addColumn("Tanggal Pengembalian");

        for (PeminjamanPOJO data : dataPeminjaman) {
            Object[] rowData = {
                data.getIDPeminjam(),
                data.getNama(),
                data.getProdi(),
                data.getSemester(),
                data.getFakultas(),
                data.getJumlahBuku(),
                data.getTanggalPeminjaman(),
                data.getTanggalPengembalian()
            };
            newModel.addRow(rowData);
        }

        jTable1.setModel(newModel);
    }

    private void tampil(Connection conn) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<Peminjaman> querySelectAll = entityManager.createNamedQuery("Peminjaman.findAll", Peminjaman.class);
        List<Peminjaman> results = querySelectAll.getResultList();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Peminjaman data : results) {
            Object[] baris = new Object[8];
            baris[0] = data.getIdpeminjam();
            baris[1] = data.getNama();
            baris[2] = data.getProdi();
            baris[3] = data.getSemester();
            baris[4] = data.getFakultas();
            baris[5] = data.getJumlahbuku();
            baris[6] = data.getTanggalpeminjaman();
            baris[7] = data.getTanggalpengembalian();
            model.addRow(baris);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public PeminjamanGUI() {
        try {
            dataPeminjaman = new ArrayList<>();
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

    private void kosongkan_form() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("PEMINJAMAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 340, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("ID Peminjam");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 110, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 90, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Program Studi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 110, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Semester");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 120, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Fakultas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 110, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Jumlah Buku");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 130, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 260, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 260, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 260, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 260, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 260, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 260, -1));

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
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 200, 50));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel14.setText("DATA SKRIPSI                            >");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 200, 50));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel15.setText("LAPORAN DATA BUKU              >");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 200, 50));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel16.setText("LAPORAN DATA SKRIPSI          >");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 200, 50));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel17.setText("PEMINJAMAN                             >");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 200, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/setting 1.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PERPUSTAKAAN SISTEM INFORMASI");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Search :");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, -1, -1));

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, 120, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Peminjam", "Nama", "Program Studi", "Semester", "Fakultas", "Jumlah Buku", "Tanggal Peminjaman", "Tanggal Pengembalian"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 380, 200));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Tanggal Peminjaman");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 150, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 260, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 260, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Tanggal Pengembalian");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 170, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Short by :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 320, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Peminjam", "Nama", "Prodi", "Semester", "Fakultas", "Jumlah Buku", "Tanggal Peminjaman", "Tanggal Pengembalian" }));
        jComboBox2.setBorder(null);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 320, 80, -1));

        jButton1.setBackground(new java.awt.Color(13, 67, 170));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 560, -1, -1));

        jButton2.setBackground(new java.awt.Color(13, 67, 170));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, -1, -1));

        jButton3.setBackground(new java.awt.Color(13, 67, 170));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 560, -1, -1));

        jButton4.setBackground(new java.awt.Color(13, 67, 170));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CETAK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 560, -1, -1));

        jButton5.setBackground(new java.awt.Color(13, 67, 170));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("UPLOAD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 560, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Rekomendasi 2 (3).png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        new LaporanDataSkripsi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        new AddDataBuku().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String idPeminjam = jTextField1.getText().trim();
        String nama = jTextField2.getText();
        String programStudi = jTextField3.getText();
        String semester = jTextField4.getText();
        String fakultas = jTextField5.getText();
        String jumlahBuku = jTextField6.getText();
        String tanggalPeminjaman = jTextField7.getText();
        String tanggalPengembalian = jTextField8.getText();

        try {

            EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            entityManager.getTransaction().begin();
            Peminjaman d = new Peminjaman();
            d.setIdpeminjam(idPeminjam);
            d.setNama(nama);
            d.setProdi(programStudi);
            d.setSemester(semester);
            d.setFakultas(fakultas);
            d.setJumlahbuku(jumlahBuku);
            d.setTanggalpeminjaman(tanggalPeminjaman);
            d.setTanggalpengembalian(tanggalPengembalian);

            entityManager.persist(d);
            entityManager.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        kosongkan_form();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String idPeminjam = jTextField1.getText().trim();
        String nama = jTextField2.getText();
        String programStudi = jTextField3.getText();
        String semester = jTextField4.getText();
        String fakultas = jTextField5.getText();
        String jumlahBuku = jTextField6.getText();
        String tanggalPeminjaman = jTextField7.getText();
        String tanggalPengembalian = jTextField8.getText();

        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();
            Peminjaman d = new Peminjaman();
            d.setIdpeminjam(idPeminjam);
            d.setNama(nama);
            d.setProdi(programStudi);
            d.setSemester(semester);
            d.setFakultas(fakultas);
            d.setJumlahbuku(jumlahBuku);
            d.setTanggalpeminjaman(tanggalPeminjaman);
            d.setTanggalpengembalian(tanggalPengembalian);

            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil diupdate.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Gagal mengupdate data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        kosongkan_form();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String idpeminjam = jTextField1.getText().trim();
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            // Find the entity by ID before removing
            Peminjaman detachedEntity = new Peminjaman();
            detachedEntity.setIdpeminjam(idpeminjam);

            Peminjaman attachedEntity = em.merge(detachedEntity);

            if (attachedEntity != null) {
                em.remove(attachedEntity);
                em.getTransaction().commit();

                JOptionPane.showMessageDialog(null, "Data berhasil dihapus.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Handle case where the entity with the given ID is not found
                JOptionPane.showMessageDialog(null, "Data dengan ID " + idpeminjam + " tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        jTextField1.setText("");
        kosongkan_form();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
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

                    Peminjaman d = new Peminjaman();
                    d.setIdpeminjam(csvRecord.get(0));
                    d.setNama(csvRecord.get(1));
                    d.setProdi(csvRecord.get(2));
                    d.setSemester(csvRecord.get(3));
                    d.setFakultas(csvRecord.get(4));
                    d.setJumlahbuku(csvRecord.get(5));
                    d.setTanggalpeminjaman(csvRecord.get(6));
                    d.setTanggalpengembalian(csvRecord.get(7));

                    entityManager.persist(d);

                }

            } catch (Exception ex) {
                System.out.println("Error in Parsing CSV File");
            }

            entityManager.getTransaction().commit();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        try {
            String selection = ((String) jComboBox2.getSelectedItem()).toLowerCase();
            String searchTerm = txtsearch.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT p FROM Peminjaman p WHERE ";

            switch (selection) {
                case "id peminjam":
                    queryString += "LOWER(p.idpeminjam) LIKE LOWER(:searchTerm)";
                    break;
                case "nama":
                    queryString += "LOWER(p.nama) LIKE LOWER(:searchTerm)";
                    break;
                case "prodi":
                    queryString += "LOWER(p.prodi) LIKE LOWER(:searchTerm)";
                    break;
                case "semester":
                    queryString += "LOWER(p.semester) LIKE LOWER(:searchTerm)";
                    break;
                case "fakultas":
                    queryString += "LOWER(dp.fakultas) LIKE LOWER(:searchTerm)";
                    break;
                case "jumlah buku":
                    queryString += "LOWER(p.jumlahbuku) LIKE LOWER(:searchTerm)";
                    break;
                case "tanggal peminjaman":
                    queryString += "LOWER(p.tanggalpeminjaman) LIKE LOWER(:searchTerm)";
                    break;
                case "tanggal pengembalian":
                    queryString += "LOWER(p.tanggalpengembalian) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected. Selected Criteria: " + selection);
            }

            // Create and execute the JPA query
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            System.out.println("Query: " + queryString);
            System.out.println("Search Term: " + searchTerm);

            TypedQuery<Peminjaman> query = em.createQuery(queryString, Peminjaman.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Peminjaman> results = query.getResultList();

            DefaultTableModel dataModel = new DefaultTableModel();

            // Add columns to the model
            dataModel.addColumn("ID Peminjam");
            dataModel.addColumn("Nama");
            dataModel.addColumn("Prodi");
            dataModel.addColumn("Semester");
            dataModel.addColumn("Fakultas");
            dataModel.addColumn("Jumlah Buku");
            dataModel.addColumn("Tanggal Peminjaman");
            dataModel.addColumn("Tanggal Pengembalian");
            // ... add other columns as needed

            // Add rows to the model
            for (Peminjaman result : results) {
                Object[] rowData = {
                    result.getIdpeminjam(),
                    result.getNama(),
                    result.getProdi(),
                    result.getSemester(),
                    result.getFakultas(),
                    result.getJumlahbuku(),
                    result.getTanggalpeminjaman(),
                    result.getTanggalpengembalian()
                // ... add other data fields as needed
                };
                dataModel.addRow(rowData);
            }

            // Set jTable1 with the created model
            jTable1.setModel(dataModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_txtsearchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String IdPeminjam = jTable1.getValueAt(baris, 0).toString();
        jTextField1.setText(IdPeminjam);

        String nama = jTable1.getValueAt(baris, 1).toString();
        jTextField2.setText(nama);

        String Prodi = jTable1.getValueAt(baris, 2).toString();
        jTextField3.setText(Prodi);

        String semester = jTable1.getValueAt(baris, 3).toString();
        jTextField4.setText(semester);

        String fakultas = jTable1.getValueAt(baris, 4).toString();
        jTextField5.setText(fakultas);

        String JumlahBuku = jTable1.getValueAt(baris, 5).toString();
        jTextField6.setText(JumlahBuku);

        String TanggalPeminjaman = jTable1.getValueAt(baris, 6).toString();
        jTextField7.setText(TanggalPeminjaman);

        String TanggalPengembalian = jTable1.getValueAt(baris, 7).toString();
        jTextField8.setText(TanggalPengembalian);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
  try {
            String selection = ((String) jComboBox2.getSelectedItem()).toLowerCase();
            String searchTerm = txtsearch.getText().trim();

            String queryString = "SELECT p FROM Peminjaman p WHERE ";
            
            switch (selection) {
                case "id peminjam":
                    queryString += "LOWER(p.idpeminjam) LIKE LOWER(:searchTerm)";
                    break;
                case "nama":
                    queryString += "LOWER(p.nama) LIKE LOWER(:searchTerm)";
                    break;
                case "prodi":
                    queryString += "LOWER(p.prodi) LIKE LOWER(:searchTerm)";
                    break;
                case "semester":
                    queryString += "LOWER(p.semester) LIKE LOWER(:searchTerm)";
                    break;
                case "fakultas":
                    queryString += "LOWER(dp.fakultas) LIKE LOWER(:searchTerm)";
                    break;
                case "jumlah buku":
                    queryString += "LOWER(p.jumlahbuku) LIKE LOWER(:searchTerm)";
                    break;
                case "tanggal peminjaman":
                    queryString += "LOWER(p.tanggalpeminjaman) LIKE LOWER(:searchTerm)";
                    break;
                case "tanggal pengembalian":
                    queryString += "LOWER(p.tanggalpengembalian) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected. Selected Criteria: " + selection);
            }

            // ... (switch statement to build the query based on selection)

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();

            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            TypedQuery<Peminjaman> query = em.createQuery(queryString, Peminjaman.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Peminjaman> results = query.getResultList();

            if (results.isEmpty()) {
                System.out.println("No results found for the given search criteria.");
                return;
            }

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

            // Load the JasperReports design file
            InputStream inputStream = Peminjaman.class.getResourceAsStream("reportPeminjaman.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(inputStream);

            // Compile the JasperReports design
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            // Fill the report with data
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);

            if (jasperPrint.getPages().isEmpty()) {
                System.out.println("No data to print!");
                return;
            }

                        JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setTitle("Report Peminjaman");
            viewer.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Error printing report: " + ex.getMessage());
            ex.printStackTrace();
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }
    



    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(PeminjamanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeminjamanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeminjamanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeminjamanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeminjamanGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
