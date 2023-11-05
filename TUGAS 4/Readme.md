# Connection Database
JDBC  (Java Data Base Connectivity) bertugas menyediakan koneksi ke database, sehingga kita bisa mengakses dan mengelola datanya dari program Java.

# Tahapan-tahapan
1.  Pertama, buat terlebih dahulu database yang ada di postgre yang akan di connect ke java 
    netbeans. Disini saya membuat database dengan nama TugasPBO. Lalu buat table dengan 
    perintah query create table program_studi.
2.  Perintah SELECT digunakan untuk menampilkan table yang ada pada program_studi. Disini 
    saya sudah memasukkan beberapa data di postgrenya, yang kemudian di run di netbeans.
    Perintah INSERT digunakan untuk menambahkan data. Disini saya menambahkan data dengan 
    kode prodi = H5, nama prodi = dakwah, jenjang = S1, dan nama kaprodi = Bedul. Dan Ketika
    di run menghasilkan output “Data berhasil ditambahkan!”. Kemudian kita cek kembali di select 
    dan di run maka data yang sudah ditambahkan akan muncul.
3.  Selanjutnya yaitu perintah update, disini saya akan mengupdate nama prodi yang awalnya 
    dakwah menjadi manajemen di kode_prodi = H5. Dan ketika dijalankan maka output yang 
    muncul “Data berhasil di update!”. Lalu kita cek Kembali di select apakah data sudah terupdate
    atau belum. Dapat dilihat pada hasil running di classSelectPS, data telah di update menjadi 
    Nama Prodi = Manajemen.
4.  Lalu, perintah DELETE yang digunakan untuk menghapus data yang ada pada table program_studi. 
    Disini saya akan menghapus data dengan kode_prodi = H2. Jika data berhasil terhapus, maka akan 
    muncul output “Data berhasil dihapus!”. Kemudian kita cek Kembali pada class SelectPS kita jalankan 
    maka data yag mempunyai kode_prodi = H2 telah terhapus.
