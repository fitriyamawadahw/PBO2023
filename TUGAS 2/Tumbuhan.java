/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author Fitriyah
 */
public class Tumbuhan extends MakhlukHidup {

    public Tumbuhan() {
        super();
        this.habitat = "Air";
        this.hidup = true;
        this.tinggi = 150;
        this.ukuranSel = 0.2;
    }

    public Tumbuhan(String habitat) {
        super("Air");
        this.habitat = habitat;
        this.hidup = true;
        this.tinggi = 150;
        this.ukuranSel = 0.2;
    }

    public Tumbuhan(boolean hidup) {
        super(true);
        this.habitat = "Air";
        this.hidup = hidup;
        this.tinggi = 150;
        this.ukuranSel = 0.2;
    }

    public Tumbuhan(int tinggi) {
        super(150);
        this.habitat = "Air";
        this.hidup = true;
        this.tinggi = tinggi;
        this.ukuranSel = 0.2;
    }

    public Tumbuhan(double ukuranSel) {
        this.ukuranSel = ukuranSel;
        this.ukuranSel = 0.2;
        this.habitat = "Air";
        this.hidup = true;
        this.tinggi = 150;
    }

    /**
     * @return the jenisAkar
     */
    public String getJenisAkar() {
        return jenisAkar;
    }

    /**
     * @param jenisAkar the jenisAkar to set
     */
    public void setJenisAkar(String jenisAkar) {
        this.jenisAkar = jenisAkar;
    }

    /**
     * @return the ukuranSel
     */
    public double getUkuranSel() {
        return ukuranSel;
    }
    private String jenisAkar;
    protected double ukuranSel;
}
