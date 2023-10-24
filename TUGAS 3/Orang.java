/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasinterface;

/**
 *
 * @author Fitriyah
 */
public class Orang {

    public Orang() {
        this.jenisKelamin = "Tidak mau memberi tahu";
        this.tempatTinggal = "Di atas Bumi";
        this.hobi = "Banyak banget lohhh";
        this.statusPernikahan = "Lajang";
        this.JenisMakanan = "Terserah";
    }

    /**
     * @return the jenisKelamin
     */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param jenisKelamin the jenisKelamin to set
     */
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    /**
     * @return the tempatTinggal
     */
    public String getTempatTinggal() {
        return tempatTinggal;
    }

    /**
     * @param tempatTinggal the tempatTinggal to set
     */
    public void setTempatTinggal(String tempatTinggal) {
        this.tempatTinggal = tempatTinggal;
    }

    /**
     * @return the hobi
     */
    public String getHobi() {
        return hobi;
    }

    /**
     * @param hobi the hobi to set
     */
    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    /**
     * @return the statusPernikahan
     */
    public String getStatusPernikahan() {
        return statusPernikahan;
    }

    /**
     * @param statusPernikahan the statusPernikahan to set
     */
    public void setStatusPernikahan(String statusPernikahan) {
        this.statusPernikahan = statusPernikahan;
    }

    /**
     * @return the JenisMakanan
     */
    public String getJenisMakanan() {
        return JenisMakanan;
    }

    /**
     * @param JenisMakanan the JenisMakanan to set
     */
    public void setJenisMakanan(String JenisMakanan) {
        this.JenisMakanan = JenisMakanan;
    }
    
    private String jenisKelamin = "Tidak mau memberi tahu";
    private String tempatTinggal = "Di atas Bumi";
    String hobi = "Banyak banget lohhh";
    private String statusPernikahan = "Lajang";
    private String JenisMakanan = "Terserah";

    
    public String beribadah() {
        return "ibadah tepat waktu";
    }

    public String beribadah(String jam) {
        return "ibadah sholat dhuhur agak telat " + jam;
    }

    public String beribadah(int jam) {
        return "ibadah sholat dhuhur agak telat pada jam " + String.valueOf(jam);
    }

    public String beribadah(double jam) {
        return "ibadah sholat dhuhur agak telat pada jam " + String.valueOf(jam);
    }
    
}
