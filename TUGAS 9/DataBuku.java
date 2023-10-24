/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbofitriya;

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
    @NamedQuery(name = "DataBuku.findByTahun", query = "SELECT d FROM DataBuku d WHERE d.tahun = :tahun"),
    @NamedQuery(name = "DataBuku.findByPenerbit", query = "SELECT d FROM DataBuku d WHERE d.penerbit = :penerbit")})
public class DataBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "judul")
    private String judul;
    @Column(name = "tahun")
    private String tahun;
    @Column(name = "penerbit")
    private String penerbit;

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

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
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
        return "utspbofitriya.DataBuku[ isbn=" + isbn + " ]";
    }
    
}
