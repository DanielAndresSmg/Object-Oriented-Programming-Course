# T01 Juragan Buku (Individual Assignment)

Ucok dan Butet sudah sahabat sejak kecil. Keduanya bercita-cita ingin menjadi duo enterpreneur muda di masa mendatang. Akhir-akhir ini Ucok sedang memikirkan sesuatu, suatu ide besar untuk membangun sebuah start up company. Ucok terinspirasi Amazon.com, toko online yang dimulai dari menjual buku.

Sabtu lalu, Ucok menyampaikan idenya pada sang sahabat, Butet. Menurut Butet, untuk menjadi besar tentu memerlukan waktu, usaha, komitmen, dan yang terpenting adalah memulai dari hal kecil. Ucok dan Butet pun bertekad untuk memulai mimpi besar mereka hari ini.

Ucok dan Butet kemudian berpikir untuk menginisiasi mimipi besar mereka membangun start up dalam bentuk program penjualan buku sederhana. Hal terkecil yang dapat dilakukan adalah mengidentifikasi properti-properti dari suatu buku. Kebetulan di sesi perkuliahan PEMVIS minggu ini dibahas mengenai data, tipe data, variabel, constant, dan operator materii yang menurut Butet dapat direlasikan.

Butet kemudian mulai menganalisis dan mendaftarkan properti dari objek buku beserta deskripsinya:

1. ISBN. Kode ISBN-13 yang secara unik mengidentifikasi buku. Misal: 978-0201498400.
2. Judul. Judul dari buku. Misal: Data Structures and Algorithm Analysis in C.
3. Penulis. Nama dari penulis, jika lebih dari satu dipisahkan dengan tanda koma. Misal: Mark Allen Weiss.
4. Tahun terbit. Tahun buku diterbitkan. Misal: 1996.
5. Penerbit. Nama penerbit. Misal: Pearson;
6. Format buku elektranik. Terdapat dua format buku yaitu paperback dan ebook (buku elektronik). Paperback adalah buku fisik yang dicetak sementara ebook adalah versi digital.

Ucok kemudian menambahkan beberapa properti lagi untuk melengkapi:

7. Harga pembelian. Harga buku ketika dibeli dalam mata uang USD. Nilai terendah adalah 1.00.
8. Minimum margin. Nilai keuntungan yang akan ditambahkan untuk menghasilkan harga jual USD. Minimum 1.00.
9. Stok. Jumlah stok buku. Minimum 0 (tidak tersedia) dan > 0 jika tersedia.
10. Rating. Rata-rata review penilaian dengan rentang 0.0 s.d. 5.0. Semakin besar semakin bagus penilaiannya.

## Input-Output Simulation (T01)

Tugas berikutnya, kembangkan sebuah solusi sederhana yang secara berturut-turut akan membaca kesepuluh properti buku. Setiap properti baca dalam satu baris masukan. Selanjutnya, tampilkan semua nilai properti yang telah dimasukkan dalam satu baris keluaran. Antara properti yang satu dengan properti lainnya dipisahkan dengan tanda pipe ```|```. Perhatikan dua contoh berikut.

### Example 1

**Input**:
```bash
978-0201498400
Data Structures and Algorithm Analysis in C
Mark Allen Weiss
1996
Pearson
yes
84.21
20.12
0
4.6

```

**Output**:
```bash
978-0201498400|Data Structures and Algorithm Analysis in C|Mark Allen Weiss|1996|Pearson|yes|84.21|20.12|0|4.6

```

### Example 2

**Input**:
```bash
978-0130895929
C: A Reference Manual
Samuel Harbison, Guy Steele Jr.
2002
Pearson
no
50.19
11.05
21
4.1

```

**Output**:
```bash
978-0130895929|C: A Reference Manual|Samuel Harbison, Guy Steele Jr.|2002|Pearson|no|50.19|11.05|21|4.1

```

## Reporting

Presentasikan pekerjaan anda dalam sebuah video. Pada presentasi:
1. Definisikan tipe data yang cocok dan representatif untuk setiap properti.
2. Berikan dasar pemikiran anda mengenai usulan tipe data tersebut.
3. Jabarkan solusi anda (Flowgorithm).

**Note**: Semakin tajam argumen dan penjabaran anda semakin mudah penilaian dilakukan.

**Kriteria Video Presentasi**:
+ 1080p/30fps, min. 10 menit.
+ Suara jernih dan dapat dengan jelas terdengar.
+ Posting video anda di YouTube, di-set "Not For Kids" dengan visibility Unlisted.

## Submissions:

1. T01.java
2. T01.fprg
3. changelog.txt

## How to Submit?

Please see https://youtu.be/cU546lAL9g8