# Pertemuan Pertama

## Daftar Isi
- [Extends](#extends)
- [Set dan Get](#set-dan-get)
- [Hubungan antara Extends, Set, dan Get](#hubungan-antara-extends-set-dan-get)

---

## Extends
Kata kunci `extends` digunakan untuk membuat hubungan hierarki antara kelas. Ketika sebuah kelas menggunakan `extends`, kelas tersebut akan mewarisi semua atribut dan metode dari kelas yang diwarisi. Kelas yang mewarisi disebut subclass atau anak kelas, sedangkan kelas yang diwarisi disebut superclass atau induk kelas.

**Fungsi**:
- Menerapkan konsep pewarisan (inheritance) dalam pemrograman berorientasi objek.
- Pewarisan memungkinkan kita membuat kelas baru dengan memodifikasi atau menambah fungsionalitas dari kelas yang sudah ada, sehingga menghindari duplikasi kode.

---

## Set dan Get
`set` dan `get` adalah metode yang umum digunakan untuk mengakses dan memodifikasi nilai dari atribut suatu objek. Metode `set` digunakan untuk menetapkan nilai baru ke suatu atribut, sedangkan metode `get` digunakan untuk mengambil nilai dari suatu atribut.

**Fungsi**:
- Membungkus data (atribut) dalam suatu kelas dan menyediakan akses melalui metode `set` dan `get`.
- Memungkinkan kita melakukan validasi terhadap nilai yang akan disimpan dalam atribut sebelum nilai tersebut benar-benar disimpan.
- Memberikan fleksibilitas dalam mengontrol bagaimana data diakses dan dimodifikasi.

---

## Hubungan antara Extends, Set, dan Get
- Konsep `extends` berkaitan dengan pewarisan, sedangkan `set` dan `get` berkaitan dengan pengendalian akses data. Sebuah kelas anak yang mewarisi dari kelas induk dapat mengoverride metode `set` dan `get` yang diwarisi untuk memberikan perilaku yang berbeda.
- Kombinasi dari `extends`, `set`, dan `get` memungkinkan kita mencapai variasi perilaku, yaitu kemampuan suatu objek untuk mengambil berbagai bentuk atau fungsi yang berbeda.

