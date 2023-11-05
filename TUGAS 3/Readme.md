# Interface
Interface adalah blue print dari class. Isi method-nya kosong dan nanti akan diimplementasikan pada class lain.
interface berfungsi sebagai penghubung antara sesuatu yang ‘abstrak’ dengan sesuatu yang nyata.
https://www.petanikode.com/java-oop-interface/

# Tahapan-tahapan
  Orang merupakan superclass yang akan mewariskan. OrangBorneo dan OrangPapua adalah class turunan dari Orang. Class OrangBorneo akan implements ke class interface PengrajinKayu, PetaniSawit, dan PenjualIkan. Sedangkan class OrangPapua, akan implements ke class interface Guru, PemanduWisata, dan PenjagaHutan.

1.  Pertama, buat class Orang terlebih dahulu. Terdapat beberapa atribut yaitu jenisKelamin, 
    tempatTinggal, hobi, statusPernikahan, dan jenisMakanan. Lalu, terdapat juga metod yaitu 
    beribadah.
2.  Kedua, buat kelas turunan dari Orang. Beri nama class turunan pertama dengan nama 
    OrangBorneo. Dalam class OrangBorneo terdapat class interface yang implements dari 
    PengrajinKayu, PetaniSawit, dan PenjualIkan. Terdapat konstruktor tanpa parameter untuk 
    menginisialisasi atribut dari class Orang, atribut-atribut tersebut akan diatur sesuai dengan nilai-nilai yang ditentukan.
3.  Beri nama class turunan kedua dengan nama OrangPapua. Dalam class OrangPapua terdapat 
    class interface yang implements dari Guru, PemanduWisata, dan PenjagaHutan. Terdapat 
    konstruktor tanpa parameter untuk menginisialisasi atribut dari class Orang, atribut-atribut 
    tersebut akan diatur sesuai dengan nilai-nilai yang ditentukan.
