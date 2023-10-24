/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utama1;


import tugasconstructor.Angiospermae;
import tugasconstructor.Hewan;
import tugasconstructor.Karnivora;
/**
 *
 * @author Fitriyah
 */
public class utama1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Karnivora singa = new Karnivora();
        singa.setNama("Singa");
        singa.setSpecies("Panthera leo");
        
        Karnivora maung = new Karnivora("Savanah");
        maung.setNama("Harimau");
        maung.setSpecies("Panthera tigris");
        
        Hewan monyet = new Hewan(50.0);
        monyet.setNama("Monyet");
        monyet.setSpecies("Pongo spp");
        monyet.setJumlahKaki(2);
        
        Angiospermae bangkai = new Angiospermae();
        bangkai.setNama("Bunga Bangkai");
        bangkai.setSpecies("Raflesia Arnoldi");
        bangkai.setBauBunga("Busuk");
        

        System.out.println("Nama saya " + singa.getNama() + ", species saya " + singa.getSpecies() + ", habitat saya " + singa.getHabitat() + ", tinggi saya " + singa.getTinggi() + " cm" + ", Berat saya " + singa.getBerat() + " kg");
        System.out.println("Nama saya " + maung.getNama() + ", species saya " + maung.getSpecies() + ", habitat saya " + maung.getHabitat() + ", tinggi saya " + maung.getTinggi() + " cm" + ", Berat saya " + maung.getBerat() + " kg");
        System.out.println("Nama saya " + monyet.getNama() + ", species saya " + monyet.getSpecies() + ", habitat saya " + monyet.getHabitat() + ", tinggi saya " + monyet.getTinggi() + " cm" + ", Berat saya " + monyet.getBerat() + " kg" + ", Jumlah kaki saya " + monyet.getJumlahKaki());
        System.out.println("Nama saya " + bangkai.getNama() + ", species saya " + bangkai.getSpecies() + ", saya hidup/tidak " + bangkai.isHidup() + ", habitat saya " + bangkai.getHabitat() + ", tinggi saya " + bangkai.getTinggi() + " cm" + ", Ukuran sel saya " + bangkai.getUkuranSel() + ", bau bunga " + bangkai.getBauBunga());
    }
}
