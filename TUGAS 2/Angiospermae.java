/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author Fitriyah
 */
public class Angiospermae extends Tumbuhan {



    public Angiospermae() {
        super();
    }
    

    public Angiospermae(String habitat) {
        this.habitat = habitat;
        this.hidup = true;
        this.tinggi = 100;
        this.ukuranSel = 0.02;
    }

    public Angiospermae(boolean hidup) {
        this.hidup = hidup;
        this.habitat = "Hutan";
        this.tinggi = 100;
        this.ukuranSel = 0.02;
    }

    public Angiospermae(int tinggi) {
        this.tinggi = tinggi;
        this.habitat = "Hutan";
        this.hidup = true;
        this.ukuranSel = 0.02;
    }

    public Angiospermae(double ukuranSel) {
        this.ukuranSel = ukuranSel;
        this.habitat = "Hutan";
        this.hidup = true;
        this.tinggi = 100;
    }

    /**
     * @return the bauBunga
     */
    public String getBauBunga() {
        return bauBunga;
    }

    /**
     * @param bauBunga the bauBunga to set
     */
    public void setBauBunga(String bauBunga) {
        this.bauBunga = bauBunga;
    }

    private String bauBunga;
}
