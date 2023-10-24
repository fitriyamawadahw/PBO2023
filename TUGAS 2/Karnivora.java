/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author Fitriyah
 */
public class Karnivora extends Hewan {

    public Karnivora() {
        super();
        this.habitat = "Savannah";
        this.hidup = true;
        this.tinggi = 150;
        this.berat = 90.0;
    }

    public Karnivora(String habitat) {
        this.habitat = habitat;
        this.hidup = true;
        this.tinggi = 150;
        this.berat = 90.0;
    }

    public Karnivora(boolean hidup) {
        this.hidup = hidup;
        this.habitat = "Savannah";
        this.tinggi = 150;
        this.berat = 90.0;
    }

    public Karnivora(int tinggi) {
        this.tinggi = tinggi;
        this.habitat = "Savannah";
        this.hidup = true;
        this.berat = 90.0;
    }

    public Karnivora(double berat) {
        this.berat = berat;
        this.habitat = "Savannah";
        this.hidup = true;
        this.tinggi = 150;
    }
}