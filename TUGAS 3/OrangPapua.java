/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasinterface;

/**
 *
 * @author Fitriyah
 */
public class OrangPapua extends Orang implements Guru, PemanduWisata, PenjagaHutan {

    @Override
    public void mengajar() {
        System.out.println("Saya mengajar");
    }

    @Override
    public void jagaHutan() {
        System.out.println("Saya jaga hutan");
    }

    @Override
    public void manduWisata() {
        System.out.println("Saya memandu wisata");
    }

    public void setTempatTinggal() {
        super.setTempatTinggal("Tanah Papua");
    }

    public void setJenisMakanan() {
        super.setJenisMakanan("Papeda");
    }

    public void setJenisKelamin() {
        super.setJenisKelamin("Perempuan");
    }

    public void setHobi() {
        super.setHobi("Manjat pohon");
    }

    public void setStatusPernikahan() {
        super.setStatusPernikahan("Janda");
    }

    public OrangPapua() {
        this.setTempatTinggal();
        this.setJenisMakanan();
        this.setHobi();
        this.setJenisKelamin();
        this.setStatusPernikahan();
    }
}
