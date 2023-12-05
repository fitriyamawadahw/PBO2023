/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectuas;

import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
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
public class PeminjamanSkripsiGUI extends javax.swing.JFrame {

    /**
     * Creates new form PeminjamanSkripsiGUI
     */
 public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }

    private void tampil() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<Peminjamanskripsi> querySelectAll = entityManager.createNamedQuery("Peminjamanskripsi.findAll", Peminjamanskripsi.class);
        List<Peminjamanskripsi> results = querySelectAll.getResultList();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        int nomor = 1;
        for (Peminjamanskripsi data : results) {
            Object[] baris = new Object[9];
            baris[0] = nomor;
            baris[1] = data.getIdpeminjams();

            // Periksa apakah data.getIsbn() tidak null sebelum memanggil getJudul()
            if (data.getNomorindeks()!= null) {
                baris[2] = data.getNomorindeks().getNomorindeks();
            } else {
                baris[2] = ""; // Atau nilai default yang sesuai jika data.getIsbn() null
            }

            baris[3] = data.getNama();
            baris[4] = data.getAngkatan();
            baris[5] = data.getProdi();
            baris[6] = data.getStatus();
            baris[7] = data.getTanggalpinjam();
            baris[8] = data.getTanggalkembali();
            model.addRow(baris);
            nomor++;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    private void tampilskripsi() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<DataSkripsi> querySelectAll = entityManager.createNamedQuery("DataSkripsi.findAll", DataSkripsi.class);
        List<DataSkripsi> results = querySelectAll.getResultList();

        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);

        int nomor = 1; // Inisialisasi nomor awal

        for (DataSkripsi data : results) {
            Object[] baris = new Object[10];

            // Menambahkan nomor secara otomatis pada kolom pertama (indeks 0)
            baris[0] = nomor;
            baris[1] = data.getNomorindeks();
            baris[2] = data.getJudulskripsi();
            baris[3] = data.getPenulis();
            baris[4] = data.getKategori();
            baris[5] = data.getProgramstudi();
            baris[6] = data.getAngkatan();
            baris[7] = data.getTahunterbits();
            baris[8] = data.getJumlahhalamans();
            baris[9] = data.getTanggalpenyelesaian();

            model.addRow(baris);
            nomor++; // Menambah 1 untuk nomor berikutnya
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public PeminjamanSkripsiGUI() {
            initComponents();
            tampil();


    }

    private void kosongkan_form() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        j4.setText("");
        jTextField5.setText("");
        jComboBox1.setSelectedItem("");
        j4.setText("");
        j5.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextsearch = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
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
        jLabel9 = new javax.swing.JLabel();
        j4 = new javax.swing.JTextField();
        j5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        jDialog1.setPreferredSize(new java.awt.Dimension(920, 650));
        jDialog1.setSize(new java.awt.Dimension(900, 500));
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Nomor Indeks", "Judul Skripsi", "Penulis", "Kategori", "Program Studi", "Angkatan", "Tahun Terbit", "Jumlah Halaman", "Tanggal Penyelesaian"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        jDialog1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 830, 310));

        jTextsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextsearchKeyReleased(evt);
            }
        });
        jDialog1.getContentPane().add(jTextsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 210, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Search :");
        jDialog1.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Short by :");
        jDialog1.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 70, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nomor Indeks", "Judul Skripsi", "Penulis", "Kategori", "Program Studi", "Angkatan", "Tahun Terbit", "Jumlah Halaman", "Tanggal Penyelesaian" }));
        jComboBox3.setBorder(null);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 160, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Rekomendasi 2 (9).png"))); // NOI18N
        jDialog1.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("PEMINJAMAN SKRIPSI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 340, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("ID Peminjam");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 110, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nomor Indeks");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, 110, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Nama");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 110, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Angkatan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, 120, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Program Studi");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 110, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 220, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 220, -1));

        jTextField5.setText("Sistem Informasi");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 220, -1));

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
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 200, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel14.setText("DATA SKRIPSI                            >");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 200, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel15.setText("LAPORAN DATA BUKU              >");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 200, 40));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel16.setText("LAPORAN DATA SKRIPSI          >");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 200, 40));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel17.setText("PEMINJAMAN  SKRIPSI            >");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 200, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/setting 1.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PERPUSTAKAAN SISTEM INFORMASI");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Search :");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, -1, -1));

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 120, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ID Peminjam", "Nomor Indeks", "Nama", "Angkatan", "Program Studi", "Status", "Tanggal Peminjaman", "Tanggal Pengembalian"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 830, 120));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Tanggal Peminjaman");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 150, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Tanggal Pengembalian");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 170, -1));

        j4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j4MouseClicked(evt);
            }
        });
        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 220, -1));

        j5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j5MouseClicked(evt);
            }
        });
        getContentPane().add(j5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 370, 240, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dipinjam", "Sudah Kembali" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 340, -1, -1));

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, 240, -1));

        jButton1.setBackground(new java.awt.Color(13, 67, 170));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, -1, -1));

        jButton2.setBackground(new java.awt.Color(13, 67, 170));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, -1, -1));

        jButton3.setBackground(new java.awt.Color(13, 67, 170));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 560, -1, -1));

        jButton4.setBackground(new java.awt.Color(13, 67, 170));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CETAK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, -1, -1));

        jButton5.setBackground(new java.awt.Color(13, 67, 170));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("UPLOAD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 560, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Sort by :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 240, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Peminjam", "Nama", "Angkatan", "Prodi", "Status", "Tanggal Peminjaman", "Tanggal Pengembalian" }));
        jComboBox2.setBorder(null);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 240, 80, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel22.setText("PEMINJAMAN BUKU                   >");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 200, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Status");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 150, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 310, 240, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Rekomendasi 2 (3).png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        new LaporanDataSkripsi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        try {
            String selection = ((String) jComboBox2.getSelectedItem()).toLowerCase();
            String searchTerm = txtsearch.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT p FROM Peminjamanskripsi p WHERE ";

            switch (jComboBox2.getSelectedIndex()) {
                case 0:
                queryString += "LOWER(p.idpeminjams) LIKE LOWER(:searchTerm)";
                break;
                case 1:
                queryString += "LOWER(p.nomorindeks) LIKE LOWER(:searchTerm)";
                break;
                case 2:
                queryString += "LOWER(p.nama) LIKE LOWER(:searchTerm)";
                break;
                case 3:
                queryString += "LOWER(p.angkatan) LIKE LOWER(:searchTerm)";
                break;
                case 4:
                queryString += "LOWER(p.prodi) LIKE LOWER(:searchTerm)";
                break;
                case 5:
                queryString += "LOWER(p.status) LIKE LOWER(:searchTerm)";
                break;
                case 6:
                queryString += "LOWER(p.tanggalpinjam) LIKE LOWER(:searchTerm)";
                break;
                case 7:
                queryString += "LOWER(p.tanggalkembali) LIKE LOWER(:searchTerm)";
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

            TypedQuery<Peminjamanskripsi> query = em.createQuery(queryString, Peminjamanskripsi.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Peminjamanskripsi> results = query.getResultList();

            DefaultTableModel dataModel = new DefaultTableModel();

            // Add columns to the model
            dataModel.addColumn("No.");
            dataModel.addColumn("ID Peminjam");
            dataModel.addColumn("Nomor Indeks");
            dataModel.addColumn("Nama");
            dataModel.addColumn("Angkatan");
            dataModel.addColumn("Prodi");
            dataModel.addColumn("status");
            dataModel.addColumn("Tanggal Peminjaman");
            dataModel.addColumn("Tanggal Pengembalian");
            // ... add other columns as needed
            int nomor = 1;
            // Add rows to the model
            for (Peminjamanskripsi result : results) {
                Object[] rowData = {
                    nomor,
                    result.getIdpeminjams(),
                    result.getNomorindeks().getNomorindeks(),
                    result.getNama(),
                    result.getAngkatan(),
                    result.getProdi(),
                    result.getStatus(),
                    result.getTanggalpinjam(),
                    result.getTanggalkembali()
                    // ... add other data fields as needed
                };
                dataModel.addRow(rowData);
                nomor++;
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

        String IdPeminjam = jTable1.getValueAt(baris, 1).toString();
        jTextField1.setText(IdPeminjam);

        String nomorindeks = jTable1.getValueAt(baris, 2).toString();
        jTextField2.setText(nomorindeks);// Assuming jComboBox3 is a JComboBox

        String nama = jTable1.getValueAt(baris, 3).toString();
        jTextField3.setText(nama);
        
                String angkatan = jTable1.getValueAt(baris, 4).toString();
        jTextField8.setText(angkatan);

        String Prodi = jTable1.getValueAt(baris, 5).toString();
        jTextField5.setText(Prodi);

        String status = jTable1.getValueAt(baris, 6).toString();
        jComboBox1.setSelectedItem(status); // Assuming jComboBox1 is a JComboBox

        String tanggalpinjam = jTable1.getValueAt(baris, 7).toString();
        j4.setText(tanggalpinjam);

        String tglkmbl = jTable1.getValueAt(baris, 8).toString();
        j5.setText(tglkmbl);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String idPeminjam = jTextField1.getText().trim();
        String nomorindeks = jTextField2.getText();
        String nama = jTextField3.getText();
        String angkatan = j4.getText();
        String prodi = jTextField5.getText();
        String status = (String) jComboBox1.getSelectedItem();
        String tanggalpeminjaman = j4.getText();
        String tanggalpengembalian = j5.getText();

        try {

            EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            em.getTransaction().begin();
            DataSkripsi wm = em.find(DataSkripsi.class, nomorindeks);
            Peminjamanskripsi d = new Peminjamanskripsi();
            d.setIdpeminjams(idPeminjam);
            d.setNama(nama);
            d.setNomorindeks(wm);
            d.setAngkatan(angkatan);
            d.setProdi(prodi);
            d.setStatus(status);
            d.setTanggalpinjam(tanggalpeminjaman);
            d.setTanggalkembali(tanggalpengembalian);

            em.persist(d);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        tampil();
        kosongkan_form();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String idPeminjam = jTextField1.getText().trim();
        String nomorindeks = jTextField2.getText();
        String nama = jTextField3.getText();
        String angkatan = j4.getText();
        String prodi = jTextField5.getText();
        String status = (String) jComboBox1.getSelectedItem();
        String tanggalpeminjaman = j4.getText();
        String tanggalpengembalian = j5.getText();

        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();
            DataSkripsi wm = em.find(DataSkripsi.class, nomorindeks);
            Peminjamanskripsi d = new Peminjamanskripsi();
            d.setIdpeminjams(idPeminjam);
            d.setNama(nama);
            d.setNomorindeks(wm);
            d.setAngkatan(angkatan);
            d.setProdi(prodi);
            d.setStatus(status);
            d.setTanggalpinjam(tanggalpeminjaman);
            d.setTanggalkembali(tanggalpengembalian);

            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil diupdate.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Gagal mengupdate data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        tampil();
        kosongkan_form();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       String id = jTextField1.getText().trim();
int dialogResult = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin menghapus data?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
if (dialogResult == JOptionPane.YES_OPTION) {
    try {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Peminjamanskripsi b = em.find(Peminjamanskripsi.class, id);
        em.remove(b);

        em.getTransaction().commit();

        JOptionPane.showMessageDialog(null, "Data berhasil dihapus.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        
        kosongkan_form();
        tampil();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            String selection = ((String) jComboBox2.getSelectedItem()).toLowerCase();
            String searchTerm = txtsearch.getText().trim();

            String queryString = "SELECT p FROM Peminjamanskripsi p WHERE ";

            switch (jComboBox2.getSelectedIndex()) {
                case 0:
                queryString += "LOWER(p.idpeminjams) LIKE LOWER(:searchTerm)";
                break;
                case 1:
                queryString += "LOWER(p.nomorindeks) LIKE LOWER(:searchTerm)";
                break;
                case 2:
                queryString += "LOWER(p.nama) LIKE LOWER(:searchTerm)";
                break;
                case 3:
                queryString += "LOWER(p.angkatan) LIKE LOWER(:searchTerm)";
                break;
                case 4:
                queryString += "LOWER(p.prodi) LIKE LOWER(:searchTerm)";
                break;
                case 5:
                queryString += "LOWER(p.status) LIKE LOWER(:searchTerm)";
                break;
                case 6:
                queryString += "LOWER(p.tanggalpinjam) LIKE LOWER(:searchTerm)";
                break;
                case 7:
                queryString += "LOWER(p.tanggalkembali) LIKE LOWER(:searchTerm)";
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

            TypedQuery<Peminjamanskripsi> query = em.createQuery(queryString, Peminjamanskripsi.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Peminjamanskripsi> results = query.getResultList();

            if (results.isEmpty()) {
                System.out.println("No results found for the given search criteria.");
                return;
            }

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

            // Load the JasperReports design file
            InputStream inputStream = Peminjamanskripsi.class.getResourceAsStream("reportPeminjamanSkripsi.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
            Map<String, Object> parameter = new HashMap<>();
            parameter.put("querySearch", searchTerm);
            parameter.put("searchBy", selection);
            // Compile the JasperReports design
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            // Fill the report with data
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, dataSource);

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
                    Peminjamanskripsi d = new Peminjamanskripsi();
                    d.setIdpeminjams(csvRecord.get(0));
                    d.setNama(csvRecord.get(1));
                    d.setAngkatan(csvRecord.get(2));
                    d.setProdi(csvRecord.get(3));
                    d.setStatus(csvRecord.get(4));
                    d.setTanggalpinjam(csvRecord.get(5));
                    d.setTanggalkembali(csvRecord.get(6));

                    entityManager.persist(d);

                }

            } catch (Exception ex) {
                System.out.println("Error in Parsing CSV File");
            }

            entityManager.getTransaction().commit();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        new PeminjamanBuku().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void j4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j4MouseClicked
        // TODO add your handling code here:
                JFrame frame = new JFrame("Date Picker Example");
        frame.setSize(200, 100);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JDateChooser dateChooser = new JDateChooser();

// Menghapus editor dari JDateChooser agar tidak dapat diedit
        dateChooser.getDateEditor().setEnabled(false);

// Set format tanggal yang diinginkan pada JDateChooser
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateChooser.setDateFormatString("yyyy/MM/dd");

        dateChooser.addPropertyChangeListener(e -> {
            if ("date".equals(e.getPropertyName())) {
                Date selectedDate = dateChooser.getDate();
                if (selectedDate != null) {
                    String formattedDate = dateFormat.format(selectedDate);
                    dateChooser.setDate(selectedDate); // Menetapkan tanggal yang diformat kembali ke dateChooser
                    dateChooser.repaint(); // Memperbarui tampilan dateChooser
                    dateChooser.transferFocus(); // Pindah fokus dari dateChooser

                    // Set tanggal yang diformat ke j4
                    j4.setText(formattedDate);
                }
            }
        });

        panel.add(dateChooser);

        frame.add(panel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_j4MouseClicked

    private void j5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j5MouseClicked
        // TODO add your handling code here:
                JFrame frame = new JFrame("Date Picker Example");
        frame.setSize(200, 100);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JDateChooser dateChooser = new JDateChooser();

// Menghapus editor dari JDateChooser agar tidak dapat diedit
        dateChooser.getDateEditor().setEnabled(false);

// Set format tanggal yang diinginkan pada JDateChooser
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateChooser.setDateFormatString("yyyy/MM/dd");

        dateChooser.addPropertyChangeListener(e -> {
            if ("date".equals(e.getPropertyName())) {
                Date selectedDate = dateChooser.getDate();
                if (selectedDate != null) {
                    String formattedDate = dateFormat.format(selectedDate);
                    dateChooser.setDate(selectedDate); // Menetapkan tanggal yang diformat kembali ke dateChooser
                    dateChooser.repaint(); // Memperbarui tampilan dateChooser
                    dateChooser.transferFocus(); // Pindah fokus dari dateChooser

                    // Set tanggal yang diformat ke j4
                    j5.setText(formattedDate);
                }
            }
        });

        panel.add(dateChooser);

        frame.add(panel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_j5MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int baris = jTable3.rowAtPoint(evt.getPoint());
        if (baris > -1) { // Pastikan baris yang dipilih tidak negatif (-1 menunjukkan tidak ada baris yang dipilih)
            String judulSkripsi = jTable3.getValueAt(baris, 1) != null ? jTable3.getValueAt(baris, 1).toString() : "";
            jTextField2.setText(judulSkripsi);

        }

    }//GEN-LAST:event_jTable3MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // TODO add your handling code here:
                jDialog1.setVisible(true);
        jDialog1.setLocationRelativeTo(this);
        tampilskripsi();
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextsearchKeyReleased
        try {
            String selection = (String) jComboBox3.getSelectedItem();
            String searchTerm = jTextsearch.getText().trim().toLowerCase();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT d FROM DataSkripsi d WHERE ";

            switch (jComboBox3.getSelectedIndex()) {
                case 0:
                queryString += "LOWER(d.nomorindeks) LIKE LOWER(:searchTerm)";
                break;
                case 1:
                queryString += "LOWER(d.judulskripsi) LIKE LOWER(:searchTerm)";
                break;
                case 2:
                queryString += "LOWER(d.penulis) LIKE LOWER(:searchTerm)";
                break;
                case 3:
                queryString += "LOWER(d.kategori) LIKE LOWER(:searchTerm)";
                break;
                case 4:
                queryString += "LOWER(d.programstudi) LIKE LOWER(:searchTerm)";
                break;
                case 5:
                queryString += "LOWER(d.angkatan) LIKE LOWER(:searchTerm)";
                break;
                case 6:
                queryString += "LOWER(d.tahunterbits) LIKE LOWER(:searchTerm)";
                break;
                case 7:
                queryString += "LOWER(d.jumlahhalamans) LIKE LOWER(:searchTerm)";
                break;
                case 8:
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
            dataModel.addColumn("No.");
            dataModel.addColumn("Nomor Indeks");
            dataModel.addColumn("Judul Skripsi");
            dataModel.addColumn("Penulis");
            dataModel.addColumn("Kategori");
            dataModel.addColumn("Program Studi");
            dataModel.addColumn("Angkatan");
            dataModel.addColumn("Tahun Terbit");
            dataModel.addColumn("Jumlah Halaman");
            dataModel.addColumn("Tanggal Penyelesaian");

            // Add rows to the model
            int nomor = 1;
            for (DataSkripsi result : results) {
                Object[] rowData = {
                    nomor,
                    result.getNomorindeks(),
                    result.getJudulskripsi(),
                    result.getPenulis(),
                    result.getKategori(),
                    result.getProgramstudi(),
                    result.getAngkatan(),
                    result.getTahunterbits(),
                    result.getJumlahhalamans(),
                    result.getTanggalpenyelesaian()

                };
                dataModel.addRow(rowData);
                nomor++;
            }

            // Set jTable1 with the created model
            jTable3.setModel(dataModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jTextsearchKeyReleased

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(PeminjamanSkripsiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeminjamanSkripsiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeminjamanSkripsiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeminjamanSkripsiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeminjamanSkripsiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField j4;
    private javax.swing.JTextField j5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JDialog jDialog1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextsearch;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
