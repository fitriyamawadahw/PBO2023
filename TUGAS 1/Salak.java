/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author Fitriyah
 */
public class Salak {
        public static void main(String[] args) {
            
        Tumbuhan Salak = new Tumbuhan();
        Salak.setNama("Salak");
        Salak.setSpecies("Salacca zalacca");
        Salak.setBatang("Pendek dan Tebal");
        Salak.setIklim("Tropis");
        Salak.setJenisDaun("Majemuk");
        Salak.setBentukDaun("Elips/ovals");
        Salak.setUjungDaun("Runcing");
        Salak.setWarnaKulitBuah("Coklat");
        Salak.setJenisAkar("Serabut/Fibrous Root");
        
        System.out.println("Nama Tumbuhan : "+Salak.getNama());
        System.out.println("Species Tumbuhan : "+Salak.getSpecies());
        System.out.println("Salak Mempunyai Batang "+Salak.getBatang());
        System.out.println("Salak Biasanya Tumbuh di Iklim "+Salak.getIklim());
        System.out.println("Salak Memiliki Jenis Daun "+Salak.getJenisDaun());
        System.out.println("Bentuk Daun Salak "+Salak.getBentukDaun());
        System.out.println("Ujung Daun Salak Berbentuk "+Salak.getUjungDaun());
        System.out.println("Warna Kulit Buah Salak "+Salak.getWarnaKulitBuah());
        System.out.println("Salak Memiliki Jenis Akar "+Salak.getJenisAkar());

        System.out.println(Salak.MenggugurkanDaun());
        System.out.println(Salak.Berfotosintesis());
        // TODO code application logic here
    }
}
