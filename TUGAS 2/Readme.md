# Constructor
Constructor adalah method khusus yang akan dieksekusi pada saat pembuatan objek (instance). www.petanikode.com/java-oop-constructor/

# Tahapan-tahapan
1.  Pertama, membuat diagram turunan Makhluk Hidup.
2.  Kedua, membuat kelas MakhlukHidup yang digunakan sebagai kelas untuk diwariskan kepada 
    kelas turunannya. Disini atribut yang saya gunakan ada nama, species, hidup, habitat, dan 
    tinggi. Untuk atribut hidup, habitat, dan tinggi saya menggunakan protected agar nanti dapat 
    diakses oleh kelas turunannya dan untuk constructornya ada 4. Constructor disini merupakan 
    method yang digunakan agar bisa dipanggil diawal, memiliki nama yang sama dengan kelas, 
    dan tidak ada balikan.
3.  Ketiga, membuat kelas turuna Hewan extends MakhlukHidup. Terdapat 5 constructor dengan 
    konstruktor pertama tanpa parameter yang digunakan untuk membuat objek dengan nilai-nilai 
    awal/default yang sudah ditentukan. Untuk constructor selanjutnya, saya menggunakan 
    parameter dengan tipe data berbeda agar dapat menginisialisasi objek dengan nilai-nilai yang 
    berbeda. Terdapat super dan this pada constructor. Super digunakan untuk memanggil kelas 
    awal/kelas penurun yang awal sedangkan this digunakan untuk memanggil dirinya sendiri.
    Atribut yang saya gunakan pada kelas Hewan ada jumlahKaki dan berat. Untuk berat saya 
    menggunakan protected agar bisa diturunkan ke kelas turunannya. Dapat dilihat dari gambar 
    dibawah ini.
4.  Ke-empat, membuat kelas turunan karnivora, terdapat 5 constructor didalamnya dan this yang 
    digunakan untuk memanggil dirinya sendiri.
5.  Kelima, membuat kelas turuna Tumbuhan extends MakhlukHidup. Terdapat 5 constructor 
    dengan construktor pertama tanpa parameter yang digunakan untuk membuat objek dengan 
    nilai-nilai awal/default yang sudah ditentukan. Untuk constructor selanjutnya, saya 
    menggunakan parameter dengan tipe data berbeda agar dapat menginisialisasi objek dengan 
    nilai-nilai yang berbeda. Terdapat super dan this pada constructor. Super digunakan untuk 
    memanggil kelas awal/kelas penurun yang awal sedangkan this digunakan untuk memanggil 
    dirinya sendiri. Atribut yang saya gunakan pada kelas Tumbuhan ada jenisAkar dan ukuranSel. 
    Untuk ukuranSel saya menggunakan protected agar bisa diturunkan ke kelas turunannya. Dapat 
    dilihat dari gambar dibawah ini.
6.  Ke-enamt, membuat kelas turunan Angiospermae, terdapat 5 constructor didalamnya dan this
    yang digunakan untuk memanggil dirinya sendiri. Saya juga menambahkan lagi atribut 
    bauBunga didalamnya.
7.  Untuk bagian kelas utama1 saya menggunakan package berbeda agar dapat mengetahui apakah 
    jika terdapat protected error atau tidak, jika error maka pada kelas utama1diberi import agar 
    bisa diakses.
