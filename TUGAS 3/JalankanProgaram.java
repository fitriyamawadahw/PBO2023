/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menjalankan;

import tugasinterface.Orang;
import tugasinterface.OrangBorneo;
import tugasinterface.OrangPapua;

/**
 *
 * @author Fitriyah
 */
public class JalankanProgaram {

    /**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
     * 
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OrangBorneo luta = new OrangBorneo();
        System.out.println("Luta bertempat tinggal di " + luta.getTempatTinggal() + ", Jenis kelamin Luta " + luta.getJenisKelamin() + ", Status pernikahan Luta " + luta.getStatusPernikahan() + ", Jenis Makanan pokok Luta " + luta.getJenisMakanan() + ", Hobi Luta " + luta.getHobi());
        System.out.println("Luta menunaikan " + luta.beribadah("Menjelang ashar"));
        System.out.println("Profesi Luta :");
        luta.jualIkan();
        luta.manenSawit();
        luta.buatUkirankayu();
        System.out.println("\n");
        
        OrangPapua maria = new OrangPapua();
        System.out.println("Maria bertempat tinggal di " + maria.getTempatTinggal() + ", Jenis kelamin Maria " + maria.getJenisKelamin() + ", Status pernikahan Maria " + maria.getStatusPernikahan() + ", Jenis Makanan pokok Maria " + maria.getJenisMakanan() + ", Hobi Maria " + maria.getHobi());
        System.out.println("Matias menunaikan " + maria.beribadah(14));
        System.out.println("Profesi Matias :");
        maria.mengajar();
        maria.manduWisata();
        maria.jagaHutan();
        System.out.println("\n");
        
        Orang bedul = new Orang();
        System.out.println("Bedul bertempat tinggal di " + bedul.getTempatTinggal() + ", Jenis kelamin Bedul " + bedul.getJenisKelamin() + ", Status pernikahan Bedul " + bedul.getStatusPernikahan() + ", Jenis Makanan pokok Bedul " + bedul.getJenisMakanan() + ", Hobi bedul " + bedul.getHobi());
        System.out.println("Bedul menunaikan " + bedul.beribadah());

        
    }
}
