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
@Table(name = "peminjaman")
@NamedQueries({
    @NamedQuery(name = "Peminjaman.findAll", query = "SELECT p FROM Peminjaman p"),
    @NamedQuery(name = "Peminjaman.findByIdpeminjam", query = "SELECT p FROM Peminjaman p WHERE p.idpeminjam = :idpeminjam"),
    @NamedQuery(name = "Peminjaman.findByNama", query = "SELECT p FROM Peminjaman p WHERE p.nama = :nama"),
    @NamedQuery(name = "Peminjaman.findByProdi", query = "SELECT p FROM Peminjaman p WHERE p.prodi = :prodi"),
    @NamedQuery(name = "Peminjaman.findBySemester", query = "SELECT p FROM Peminjaman p WHERE p.semester = :semester"),
    @NamedQuery(name = "Peminjaman.findByFakultas", query = "SELECT p FROM Peminjaman p WHERE p.fakultas = :fakultas"),
    @NamedQuery(name = "Peminjaman.findByJumlahbuku", query = "SELECT p FROM Peminjaman p WHERE p.jumlahbuku = :jumlahbuku"),
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
    @Column(name = "prodi")
    private String prodi;
    @Column(name = "semester")
    private String semester;
    @Column(name = "fakultas")
    private String fakultas;
    @Column(name = "jumlahbuku")
    private String jumlahbuku;
    @Column(name = "tanggalpeminjaman")
    private String tanggalpeminjaman;
    @Column(name = "tanggalpengembalian")
    private String tanggalpengembalian;

    public Peminjaman() {
    }

    public Peminjaman(String idpeminjam) {
        this.idpeminjam = idpeminjam;
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

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJumlahbuku() {
        return jumlahbuku;
    }

    public void setJumlahbuku(String jumlahbuku) {
        this.jumlahbuku = jumlahbuku;
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
