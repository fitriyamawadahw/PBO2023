/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author Fitriyah
 */
public class Hewan extends MakhlukHidup {

    public Hewan() {
        super();
    }

    public Hewan(String habitat) {
        super("Hutan");
        this.habitat = habitat;
        this.hidup = true;
        this.tinggi = 150;
        this.berat = 200.0;
    }

    public Hewan(boolean hidup) {
        super(true);
        this.habitat = "Hutan";
        this.hidup = hidup;
        this.tinggi = 150;
        this.berat = 200.0;
    }

    public Hewan(int tinggi) {
        super(50);
        this.habitat = "Hutan";
        this.hidup = true;
        this.tinggi = tinggi;
        this.berat = 200.0;
    }

    public Hewan(double berat) {
        this.berat = berat;
        this.berat = 50.0;
        this.habitat = "Hutan";
        this.hidup = true;
        this.tinggi = 150;
    }

    /**
     * @return the jumlahKaki
     */
    public int getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @param jumlahKaki the jumlahKaki to set
     */
    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    /**
     * @return the berat
     */
    public double getBerat() {
        return berat;
    }

    private int jumlahKaki;
    protected double berat;
}
