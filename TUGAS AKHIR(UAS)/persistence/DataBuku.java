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
@Table(name = "data_buku")
@NamedQueries({
    @NamedQuery(name = "DataBuku.findAll", query = "SELECT d FROM DataBuku d"),
    @NamedQuery(name = "DataBuku.findByIsbn", query = "SELECT d FROM DataBuku d WHERE d.isbn = :isbn"),
    @NamedQuery(name = "DataBuku.findByJudul", query = "SELECT d FROM DataBuku d WHERE d.judul = :judul"),
    @NamedQuery(name = "DataBuku.findByNamakategori", query = "SELECT d FROM DataBuku d WHERE d.namakategori = :namakategori"),
    @NamedQuery(name = "DataBuku.findByPengarang", query = "SELECT d FROM DataBuku d WHERE d.pengarang = :pengarang"),
    @NamedQuery(name = "DataBuku.findByPenerbit", query = "SELECT d FROM DataBuku d WHERE d.penerbit = :penerbit"),
    @NamedQuery(name = "DataBuku.findByTahunterbit", query = "SELECT d FROM DataBuku d WHERE d.tahunterbit = :tahunterbit"),
    @NamedQuery(name = "DataBuku.findByJumlahhalaman", query = "SELECT d FROM DataBuku d WHERE d.jumlahhalaman = :jumlahhalaman"),
    @NamedQuery(name = "DataBuku.findByJumlahbuku", query = "SELECT d FROM DataBuku d WHERE d.jumlahbuku = :jumlahbuku")})
public class DataBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "judul")
    private String judul;
    @Column(name = "namakategori")
    private String namakategori;
    @Column(name = "pengarang")
    private String pengarang;
    @Column(name = "penerbit")
    private String penerbit;
    @Column(name = "tahunterbit")
    private String tahunterbit;
    @Column(name = "jumlahhalaman")
    private String jumlahhalaman;
    @Column(name = "jumlahbuku")
    private String jumlahbuku;

    public DataBuku() {
    }

    public DataBuku(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNamakategori() {
        return namakategori;
    }

    public void setNamakategori(String namakategori) {
        this.namakategori = namakategori;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahunterbit() {
        return tahunterbit;
    }

    public void setTahunterbit(String tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    public String getJumlahhalaman() {
        return jumlahhalaman;
    }

    public void setJumlahhalaman(String jumlahhalaman) {
        this.jumlahhalaman = jumlahhalaman;
    }

    public String getJumlahbuku() {
        return jumlahbuku;
    }

    public void setJumlahbuku(String jumlahbuku) {
        this.jumlahbuku = jumlahbuku;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataBuku)) {
            return false;
        }
        DataBuku other = (DataBuku) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projectuas.DataBuku[ isbn=" + isbn + " ]";
    }
    
}
