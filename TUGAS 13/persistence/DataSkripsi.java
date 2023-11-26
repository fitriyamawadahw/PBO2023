/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuas;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Fitriyah
 */
@Entity
@Table(name = "data_skripsi")
@NamedQueries({
    @NamedQuery(name = "DataSkripsi.findAll", query = "SELECT d FROM DataSkripsi d"),
    @NamedQuery(name = "DataSkripsi.findByNomorindeks", query = "SELECT d FROM DataSkripsi d WHERE d.nomorindeks = :nomorindeks"),
    @NamedQuery(name = "DataSkripsi.findByJudulskripsi", query = "SELECT d FROM DataSkripsi d WHERE d.judulskripsi = :judulskripsi"),
    @NamedQuery(name = "DataSkripsi.findByPenulis", query = "SELECT d FROM DataSkripsi d WHERE d.penulis = :penulis"),
    @NamedQuery(name = "DataSkripsi.findByProgramstudi", query = "SELECT d FROM DataSkripsi d WHERE d.programstudi = :programstudi"),
    @NamedQuery(name = "DataSkripsi.findByTahunterbits", query = "SELECT d FROM DataSkripsi d WHERE d.tahunterbits = :tahunterbits"),
    @NamedQuery(name = "DataSkripsi.findByJumlahhalamans", query = "SELECT d FROM DataSkripsi d WHERE d.jumlahhalamans = :jumlahhalamans"),
    @NamedQuery(name = "DataSkripsi.findByTanggalpenyelesaian", query = "SELECT d FROM DataSkripsi d WHERE d.tanggalpenyelesaian = :tanggalpenyelesaian"),
    @NamedQuery(name = "DataSkripsi.findByAngkatan", query = "SELECT d FROM DataSkripsi d WHERE d.angkatan = :angkatan"),
    @NamedQuery(name = "DataSkripsi.findByKategori", query = "SELECT d FROM DataSkripsi d WHERE d.kategori = :kategori")})
public class DataSkripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nomorindeks")
    private String nomorindeks;
    @Column(name = "judulskripsi")
    private String judulskripsi;
    @Column(name = "penulis")
    private String penulis;
    @Column(name = "programstudi")
    private String programstudi;
    @Column(name = "tahunterbits")
    private String tahunterbits;
    @Column(name = "jumlahhalamans")
    private String jumlahhalamans;
    @Column(name = "tanggalpenyelesaian")
    private String tanggalpenyelesaian;
    @Column(name = "angkatan")
    private String angkatan;
    @Column(name = "kategori")
    private String kategori;
    @OneToMany(mappedBy = "nomorindeks")
    private Collection<Peminjamanskripsi> peminjamanskripsiCollection;

    public DataSkripsi() {
    }

    public DataSkripsi(String nomorindeks) {
        this.nomorindeks = nomorindeks;
    }

    public String getNomorindeks() {
        return nomorindeks;
    }

    public void setNomorindeks(String nomorindeks) {
        this.nomorindeks = nomorindeks;
    }

    public String getJudulskripsi() {
        return judulskripsi;
    }

    public void setJudulskripsi(String judulskripsi) {
        this.judulskripsi = judulskripsi;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getProgramstudi() {
        return programstudi;
    }

    public void setProgramstudi(String programstudi) {
        this.programstudi = programstudi;
    }

    public String getTahunterbits() {
        return tahunterbits;
    }

    public void setTahunterbits(String tahunterbits) {
        this.tahunterbits = tahunterbits;
    }

    public String getJumlahhalamans() {
        return jumlahhalamans;
    }

    public void setJumlahhalamans(String jumlahhalamans) {
        this.jumlahhalamans = jumlahhalamans;
    }

    public String getTanggalpenyelesaian() {
        return tanggalpenyelesaian;
    }

    public void setTanggalpenyelesaian(String tanggalpenyelesaian) {
        this.tanggalpenyelesaian = tanggalpenyelesaian;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Collection<Peminjamanskripsi> getPeminjamanskripsiCollection() {
        return peminjamanskripsiCollection;
    }

    public void setPeminjamanskripsiCollection(Collection<Peminjamanskripsi> peminjamanskripsiCollection) {
        this.peminjamanskripsiCollection = peminjamanskripsiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomorindeks != null ? nomorindeks.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataSkripsi)) {
            return false;
        }
        DataSkripsi other = (DataSkripsi) object;
        if ((this.nomorindeks == null && other.nomorindeks != null) || (this.nomorindeks != null && !this.nomorindeks.equals(other.nomorindeks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projectuas.DataSkripsi[ nomorindeks=" + nomorindeks + " ]";
    }
    
}
