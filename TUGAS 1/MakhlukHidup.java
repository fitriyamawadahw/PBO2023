/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspbo;
/**
 *
 * @author Fitriyah
 */
public class MakhlukHidup {
    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }
    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    /**
     * @return the Species
     */
    public String getSpecies() {
        return Species;
    }
    /**
     * @param Species the Species to set
     */
    public void setSpecies(String Species) {
        this.Species = Species;
    }

    /**
     * @return the Batang
     */
    public String getBatang() {
        return Batang;
    }

    /**
     * @param Batang the Batang to set
     */
    public void setBatang(String Batang) {
        this.Batang = Batang;
    }

    /**
     * @return the Iklim
     */
    public String getIklim() {
        return Iklim;
    }

    /**
     * @param Iklim the Iklim to set
     */
    public void setIklim(String Iklim) {
        this.Iklim = Iklim;
    }

    /**
     * @return the JenisDaun
     */
    public String getJenisDaun() {
        return JenisDaun;
    }

    /**
     * @param JenisDaun the JenisDaun to set
     */
    public void setJenisDaun(String JenisDaun) {
        this.JenisDaun = JenisDaun;
    }

    /**
     * @return the BentukDaun
     */
    public String getBentukDaun() {
        return BentukDaun;
    }

    /**
     * @param BentukDaun the BentukDaun to set
     */
    public void setBentukDaun(String BentukDaun) {
        this.BentukDaun = BentukDaun;
    }

    /**
     * @return the UjungDaun
     */
    public String getUjungDaun() {
        return UjungDaun;
    }

    /**
     * @param UjungDaun the UjungDaun to set
     */
    public void setUjungDaun(String UjungDaun) {
        this.UjungDaun = UjungDaun;
    }

    /**
     * @return the WarnaKulitBuah
     */
    public String getWarnaKulitBuah() {
        return WarnaKulitBuah;
    }

    /**
     * @param WarnaKulitBuah the WarnaKulitBuah to set
     */
    public void setWarnaKulitBuah(String WarnaKulitBuah) {
        this.WarnaKulitBuah = WarnaKulitBuah;
    }

    /**
     * @return the JenisAkar
     */
    public String getJenisAkar() {
        return JenisAkar;
    }

    /**
     * @param JenisAkar the JenisAkar to set
     */
    public void setJenisAkar(String JenisAkar) {
        this.JenisAkar = JenisAkar;
    }

    /**
     * @param args the command line arguments
     */
    
    private String Nama;
    private String Species;
    private String Batang;
    private String Iklim;
    private String JenisDaun;
    private String BentukDaun;
    private String UjungDaun;
    private String WarnaKulitBuah;
    private String JenisAkar;
    
    protected String MenggugurkanDaun(){
        return "Pohon Salak Menggugurkan Daun";
    }
    protected String Berfotosintesis(){
        return "Melakukan Fotosintesis Melalui Daun";
    }
    
}