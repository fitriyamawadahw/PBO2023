/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasinterface;

/**
 *
 * @author Fitriyah
 */
public class OrangBorneo extends Orang implements PengrajinKayu, PetaniSawit, PenjualIkan {

    @Override
    public void jualIkan() {
        System.out.println("Saya jual ikan");
    }

    @Override
    public void manenSawit() {
        System.out.println("Saya pemanen sawit");
    }

    @Override
    public void buatUkirankayu() {
        System.out.println("Saya buat ukiran kayu");
    }

    public void setTempatTinggal() {
        super.setTempatTinggal("Borneo");
    }

    public void setJenisMakanan() {
        super.setJenisMakanan("Nasi");
    }

    public void setJenisKelamin() {
        super.setJenisKelamin("Laki-laki");
    }

    public void setHobi() {
        super.setHobi("Mendayung");
    }

    public void setStatusPernikahan() {
        super.setStatusPernikahan("Menikah");
    }

    public OrangBorneo() {
        this.setTempatTinggal();
        this.setJenisMakanan();
        this.setHobi();
        this.setJenisKelamin();
        this.setStatusPernikahan();
    }

}
