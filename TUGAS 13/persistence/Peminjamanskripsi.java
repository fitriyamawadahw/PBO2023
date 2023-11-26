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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Fitriyah
 */
@Entity
@Table(name = "peminjamanskripsi")
@NamedQueries({
    @NamedQuery(name = "Peminjamanskripsi.findAll", query = "SELECT p FROM Peminjamanskripsi p"),
    @NamedQuery(name = "Peminjamanskripsi.findByIdpeminjams", query = "SELECT p FROM Peminjamanskripsi p WHERE p.idpeminjams = :idpeminjams"),
    @NamedQuery(name = "Peminjamanskripsi.findByNama", query = "SELECT p FROM Peminjamanskripsi p WHERE p.nama = :nama"),
    @NamedQuery(name = "Peminjamanskripsi.findByAngkatan", query = "SELECT p FROM Peminjamanskripsi p WHERE p.angkatan = :angkatan"),
    @NamedQuery(name = "Peminjamanskripsi.findByProdi", query = "SELECT p FROM Peminjamanskripsi p WHERE p.prodi = :prodi"),
    @NamedQuery(name = "Peminjamanskripsi.findByStatus", query = "SELECT p FROM Peminjamanskripsi p WHERE p.status = :status"),
    @NamedQuery(name = "Peminjamanskripsi.findByTanggalpinjam", query = "SELECT p FROM Peminjamanskripsi p WHERE p.tanggalpinjam = :tanggalpinjam"),
    @NamedQuery(name = "Peminjamanskripsi.findByTanggalkembali", query = "SELECT p FROM Peminjamanskripsi p WHERE p.tanggalkembali = :tanggalkembali")})
public class Peminjamanskripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idpeminjams")
    private String idpeminjams;
    @Column(name = "nama")
    private String nama;
    @Column(name = "angkatan")
    private String angkatan;
    @Column(name = "prodi")
    private String prodi;
    @Column(name = "status")
    private String status;
    @Column(name = "tanggalpinjam")
    private String tanggalpinjam;
    @Column(name = "tanggalkembali")
    private String tanggalkembali;
    @JoinColumn(name = "nomorindeks", referencedColumnName = "nomorindeks")
    @ManyToOne
    private DataSkripsi nomorindeks;

    public Peminjamanskripsi() {
    }

    public Peminjamanskripsi(String idpeminjams) {
        this.idpeminjams = idpeminjams;
    }

    public String getIdpeminjams() {
        return idpeminjams;
    }

    public void setIdpeminjams(String idpeminjams) {
        this.idpeminjams = idpeminjams;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public DataSkripsi getNomorindeks() {
        return nomorindeks;
    }

    public void setNomorindeks(DataSkripsi nomorindeks) {
        this.nomorindeks = nomorindeks;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpeminjams != null ? idpeminjams.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjamanskripsi)) {
            return false;
        }
        Peminjamanskripsi other = (Peminjamanskripsi) object;
        if ((this.idpeminjams == null && other.idpeminjams != null) || (this.idpeminjams != null && !this.idpeminjams.equals(other.idpeminjams))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projectuas.Peminjamanskripsi[ idpeminjams=" + idpeminjams + " ]";
    }
    
}
