# Public, Private, Protected
- Public : dapat diakses oleh kelas manapun
- private : tidak dapat dipanggil diluar kelas
- protected : hanya dapat diakses oleh kelas turunannya

# Tahapan-tahapan
1. Pertama, buat Project Baru yang akan digunakan untuk membuat kelas-kelasnya.
2. Untuk categoriesnya pilih Java with Ant dan projectnya pilih Java Application. Klik Next.
3. Beri nama project Tugas PBO
4. Klik Kanan, lalu pilih refactor, klik rename untuk merubah nama kelas.
5. Rename kelas menjadi Makhluk Hidup. Klik Refactor.
6. Kelas Makhluk Hidup merupakan superclass/kelas yang menjadi dasar yang sifatnya akan di turunkan 
   kepada subclass/kelas turunannya. Didalam kelas diatas terdapat banyak variabel diantaranya Nama, 
   Species, Batang, Iklim, Jenis Daun, Bentuk Daun, Ujung Daun, Warna Kulit Buah, Jenis Akar, 
   Menggugurkan Daun, dan Berfotosintesis.
7. Selanjutnya yaitu mendeklarasikan variabel-variabel dari public menjadi private dan protected. Pertama 
   blok terlebih dahulu mana yang akan di refactor, lalu pilih Encapsulate Fields. Refactor merupakan 
   proses mengubah sebuah kode yang ada tanpa mengubah fungsinya. Tujuannya agar kode mudah 
   dibaca. Sedangkan, Enkapsulasi digunakan untuk menjaga program agar tidak diakses secara 
   sembarangan.
8. Ketika sudah mengklik encapsulate maka akan muncul tampilan seperti diatas. Centang kotak pada 
   bagian getter dan setter yang akan dijadikan private. Lalu Klik Refactor.
9. Setelah merefactor, maka source code nya akan otomatis menjadi seperti gambar diatas. Set digunakan 
   untuk mengatur nilai pada variabel sedangkan get digunakan untuk mengambil nilai dari variabelnya.
10. Source code yang awalnya public String sekarang berubah menjadi private String yang hanya dapat 
    diakses dikelas yang sama. Untuk itu, digunakan set dan get untuk mengatur dan mengambil nilai seperti 
11. penjelasan sebelumnya pada variabel Nama, Species, Batang, Iklim, Jenis Daun, Bentuk Daun, Ujung 
    Daun, Warna Kulit Buah, dan Jenis Akar. Untuk variable Menggugurkan Daun dan Berfotosinteis saya 
    menggunkan protected yang hanya dapat diakses oleh turunanya, dalam kelas yang sama, dan dalam 
    package yang sama. Pemilihan private dan protected sendiri tergantung kalian bagaimana data dan 
    metode tersebut dapat diakses.
12. Langkah selanjutnya yaitu kita membuat kelas baru yang nantinya akan menjadi kelas turunan dari 
    Makhluk Hidup.
13. Lalu, Beri nama kelas turunan dengan nama Tumbuhan. Klik Browse untuk mengambil dari mana 
    superclassnya/kelas yang akan diturunkan. Klik OK lalu Finish.
14. Maka, terbentuklah kelas Turunan dari Makhluk Hidup. Extends digunakan untuk membuat pewarisan 
    antara superclass dan subclass/kelas turunan.
15. Buat kelas lagi dengan nama Salak. Lalu ketik Tumbuhan Salak = new Tumbuhan(); yang menandakan 
    untuk membuat objek baru dari kelas Tumbuhan dengan nama Salak. Untuk yang private diatur dengan 
    set dan pada system out println nya diambil dengan get. Untuk yang protected pada system out println 
    nya langsung diketik sytem.out.println(salak.MenggugurkanDaun();, Salak nama kelas yang sekarang 
    dan Menggugurkan Daun adalah variabelnya yang diambil dari superclass.
