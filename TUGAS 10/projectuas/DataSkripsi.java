/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    @NamedQuery(name = "DataSkripsi.findByTanggalpenyelesaian", query = "SELECT d FROM DataSkripsi d WHERE d.tanggalpenyelesaian = :tanggalpenyelesaian")})
public class DataSkripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nomorindeks")
    private String nomorindeks;
    @Basic(optional = false)
    @Column(name = "judulskripsi")
    private String judulskripsi;
    @Basic(optional = false)
    @Column(name = "penulis")
    private String penulis;
    @Basic(optional = false)
    @Column(name = "programstudi")
    private String programstudi;
    @Basic(optional = false)
    @Column(name = "tahunterbits")
    private String tahunterbits;
    @Basic(optional = false)
    @Column(name = "jumlahhalamans")
    private String jumlahhalamans;
    @Basic(optional = false)
    @Column(name = "tanggalpenyelesaian")
    private String tanggalpenyelesaian;

    public DataSkripsi() {
    }

    public DataSkripsi(String nomorindeks) {
        this.nomorindeks = nomorindeks;
    }

    public DataSkripsi(String nomorindeks, String judulskripsi, String penulis, String programstudi, String tahunterbits, String jumlahhalamans, String tanggalpenyelesaian) {
        this.nomorindeks = nomorindeks;
        this.judulskripsi = judulskripsi;
        this.penulis = penulis;
        this.programstudi = programstudi;
        this.tahunterbits = tahunterbits;
        this.jumlahhalamans = jumlahhalamans;
        this.tanggalpenyelesaian = tanggalpenyelesaian;
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
