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
    @NamedQuery(name = "DataBuku.findBySubJudul", query = "SELECT d FROM DataBuku d WHERE d.subJudul = :subJudul"),
    @NamedQuery(name = "DataBuku.findByPengarang", query = "SELECT d FROM DataBuku d WHERE d.pengarang = :pengarang"),
    @NamedQuery(name = "DataBuku.findByPenerbit", query = "SELECT d FROM DataBuku d WHERE d.penerbit = :penerbit"),
    @NamedQuery(name = "DataBuku.findByTahunTerbit", query = "SELECT d FROM DataBuku d WHERE d.tahunTerbit = :tahunTerbit"),
    @NamedQuery(name = "DataBuku.findByJumlahHalaman", query = "SELECT d FROM DataBuku d WHERE d.jumlahHalaman = :jumlahHalaman"),
    @NamedQuery(name = "DataBuku.findByJumlahBuku", query = "SELECT d FROM DataBuku d WHERE d.jumlahBuku = :jumlahBuku")})
public class DataBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ISBN")
    private String isbn;
    @Basic(optional = false)
    @Column(name = "judul")
    private String judul;
    @Basic(optional = false)
    @Column(name = "subJudul")
    private String subJudul;
    @Basic(optional = false)
    @Column(name = "pengarang")
    private String pengarang;
    @Basic(optional = false)
    @Column(name = "penerbit")
    private String penerbit;
    @Basic(optional = false)
    @Column(name = "tahunTerbit")
    private String tahunTerbit;
    @Basic(optional = false)
    @Column(name = "jumlahHalaman")
    private String jumlahHalaman;
    @Basic(optional = false)
    @Column(name = "jumlahBuku")
    private String jumlahBuku;

    public DataBuku() {
    }

    public DataBuku(String isbn) {
        this.isbn = isbn;
    }

    public DataBuku(String isbn, String judul, String subJudul, String pengarang, String penerbit, String tahunTerbit, String jumlahHalaman, String jumlahBuku) {
        this.isbn = isbn;
        this.judul = judul;
        this.subJudul = subJudul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.jumlahBuku = jumlahBuku;
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

    public String getSubJudul() {
        return subJudul;
    }

    public void setSubJudul(String subJudul) {
        this.subJudul = subJudul;
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

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(String jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(String jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
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
