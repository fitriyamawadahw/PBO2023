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
@Table(name = "peminjaman")
@NamedQueries({
    @NamedQuery(name = "Peminjaman.findAll", query = "SELECT p FROM Peminjaman p"),
    @NamedQuery(name = "Peminjaman.findByIdpeminjam", query = "SELECT p FROM Peminjaman p WHERE p.idpeminjam = :idpeminjam"),
    @NamedQuery(name = "Peminjaman.findByNama", query = "SELECT p FROM Peminjaman p WHERE p.nama = :nama"),
    @NamedQuery(name = "Peminjaman.findByAngkatan", query = "SELECT p FROM Peminjaman p WHERE p.angkatan = :angkatan"),
    @NamedQuery(name = "Peminjaman.findByProdi", query = "SELECT p FROM Peminjaman p WHERE p.prodi = :prodi"),
    @NamedQuery(name = "Peminjaman.findByStatus", query = "SELECT p FROM Peminjaman p WHERE p.status = :status"),
    @NamedQuery(name = "Peminjaman.findByTanggalpeminjaman", query = "SELECT p FROM Peminjaman p WHERE p.tanggalpeminjaman = :tanggalpeminjaman"),
    @NamedQuery(name = "Peminjaman.findByTanggalpengembalian", query = "SELECT p FROM Peminjaman p WHERE p.tanggalpengembalian = :tanggalpengembalian")})
public class Peminjaman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idpeminjam")
    private String idpeminjam;
    @Column(name = "nama")
    private String nama;
    @Column(name = "angkatan")
    private String angkatan;
    @Column(name = "prodi")
    private String prodi;
    @Column(name = "status")
    private String status;
    @Column(name = "tanggalpeminjaman")
    private String tanggalpeminjaman;
    @Column(name = "tanggalpengembalian")
    private String tanggalpengembalian;
    @JoinColumn(name = "isbn", referencedColumnName = "isbn")
    @ManyToOne
    private DataBuku isbn;

    public Peminjaman() {
    }

    public Peminjaman(String idpeminjam) {
        this.idpeminjam = idpeminjam;
    }

    Peminjaman(String bn, Long jumlahPeminjaman) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getIdpeminjam() {
        return idpeminjam;
    }

    public void setIdpeminjam(String idpeminjam) {
        this.idpeminjam = idpeminjam;
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

    public String getTanggalpeminjaman() {
        return tanggalpeminjaman;
    }

    public void setTanggalpeminjaman(String tanggalpeminjaman) {
        this.tanggalpeminjaman = tanggalpeminjaman;
    }

    public String getTanggalpengembalian() {
        return tanggalpengembalian;
    }

    public void setTanggalpengembalian(String tanggalpengembalian) {
        this.tanggalpengembalian = tanggalpengembalian;
    }

    public DataBuku getIsbn() {
        return isbn;
    }

    public void setIsbn(DataBuku isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpeminjam != null ? idpeminjam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjaman)) {
            return false;
        }
        Peminjaman other = (Peminjaman) object;
        if ((this.idpeminjam == null && other.idpeminjam != null) || (this.idpeminjam != null && !this.idpeminjam.equals(other.idpeminjam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projectuas.Peminjaman[ idpeminjam=" + idpeminjam + " ]";
    }
    
}
