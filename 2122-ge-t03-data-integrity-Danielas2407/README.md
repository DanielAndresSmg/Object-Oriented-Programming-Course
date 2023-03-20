# T03 Data Integrity
Pada tugas kali ini anda akan mengembangkan pekerjaan sebelumnya terkait Academic Simulator. Spesifikasi-spesifikasi dari pekerjaan sebelumnya tetap digunakan dalam tugas kali ini.

## Task 01: Protect All Important Data (20 pts)

Pada tugas pertama ini anda diminta untuk menganalisis kembali deskripsi Academic Simulator dan mengidentifikasi accessor atau mutator apa saja yang benar-benar diperlukan. Accessor dan mutator yang tidak diperlukan kemudian harus dihapus dari definisi kelas. Pada saat menganalisis, anda harus mampu menjawab pertanyaan "mengapa accessor atau mutator tersebut tidak diperlukan?" dan bukan "apa guna dari accessor dan mutator tersebut?" Dalam pengerjaan tugas ini anda diizinkan untuk menambah kelas-kelas baru sesuai dengan hasil analisis anda.

Pada saat melaporkan (>5 menit):
1. sampaikan hasil analisis anda dengan argumentatif.
2. tampilkan source code perubahan.

## Task 02: Class Relationships (30 pts)

Untuk tugas kedua anda diminta untuk menganalisis kembali deskripsi Academic Simulator untuk mengidentifikasi possible class relationships dan objek-objek yang sebelumnya belum teridentifikasi. Selanjutnya desain sebuah class diagram yang mencerminkan hasil analisis anda.

Pada saat melaporkan (>10 min.):
1. tampilkan class diagram yang dihasilkan.
2. jabarkan kelas apa saja yang anda identifikasi.
3. jabarkan relasi antarkelas dengan rinci, sertakan juga aspek-aspek teoretik yang sudah anda pelajari.
4. buktikan bahwa relasi antarkelas telah diimplementasikan dengan benar dalam source code.

## Task 03: Test It Up (20 pts)

Semua perubahan yang dilakukan pada **Task 01** dan **Task 02** akan memengaruhi source code anda. Codebase akan diuji dengan menggunakan spesifikasi yang sama dengan **T02**. Untuk keperluan pengujian, tuliskan driver class yang anda hasilkan pada **T02 (Task 04)** ke ```academic.driver.Driver1``` di tugas ini. Anda harus menjamin bahwa tidak terjadi duplikasi data baik pada ```course```, ```student```, dan ```enrollment```. Bila ada upaya yang memungkinkan terjadinya duplikasi data maka upaya tersebut akan dibatalkan dan program akan meneruskan eksekusi.

## Task 04: When Things Go Wrong (30 pts)

Sebuah ```enrollment``` hanya dapat dilakukan bila ```course``` dan ```student``` yang terlibat sudah terlebih dahulu didaftarkan. Bila belum didaftarkan, maka upaya ```enrollment``` harus dibatalkan karena ```course``` atau ```student``` yang terlibat **does not exist**. Pada tugas ini anda diminta untuk mengembangkan suatu mekanisme penanganan eksepsi pada saat ```course``` atau ```student``` invalid. Tuliskan solusi anda pada ```academic.driver.Driver2```.

**Input:**
```bash
course-add#12S2203#Object-oriented Programming#3#C
course-add#12S2203#Object-oriented Programming#3#C
student-add#12S20999#Wiro Sableng#2020#Information Systems
course-add#12S2204#Object-oriented Programming#3#D
course-add#10S1002#Pemrograman Prosedural#2#D
course-add#10S1002#Pemrograman Prosedural#2#D
course-add#10S1005#Pemrograman Prosedural#2#D
student-add#12S20999#Wiro Sableng#2020#Information Systems
enrollment-add#12S2203#12S20999#2021/2022#even
enrollment-add#12S2204#12S20999#2021/2022#even
student-add#12S20111#Jaka Sembung#2019#Information Systems
enrollment-add#12S2203#12S20000#2020/2021#even
enrollment-add#12S2200#12S20000#2020/2021#odd
---

```

Pemeriksaan terhadap validitas terlebih dahulu dilakukan terhadap ```course``` kemudian ```student```.

**Output:**
```bash
invalid student|12S20000
invalid course|12S2200
10S1002|Pemrograman Prosedural|2|D
12S2203|Object-oriented Programming|3|C
12S20111|Jaka Sembung|2019|Information Systems
12S20999|Wiro Sableng|2020|Information Systems
12S2203|12S20999|2021/2022|even|None

```

## Reporting
Lakukan pertemuan dengan pair anda untuk mendiskusikan persoalan dan pengembangan solusi. Rekaman dari pertemuan tersebut menjadi bagian dari artefak tugas yang harus dikumpulkan. Durasi rekaman minimal **30 menit**.

Presentasikan pekerjaan anda dalam sebuah video. Pada presentasi:
1. Jabarkan solusi anda kelas-per-kelas.
2. Berikan rationale dari setiap implementasi yang anda hasilkan serta berikan argumen mengapa pilihan implementasi anda merupakan pilihan terbaik.
3. Jabarkan alir eksekusi dari solusi anda.
4. Demonstrasikan pekerjaan anda.
5. Tunjukkan hasil yang anda peroleh dari GitHub Classroom.
6. Sebutkan kendala yang dihadapi dalam pengerjaan tugas kali ini.

Note: Semakin tajam argumen dan penjabaran anda semakin mudah penilaian dilakukan.

Kriteria Video Presentasi:
+ Fullscreen (taskbar terlihat).
+ Suara jernih dan dapat dengan jelas terdengar.
+ Posting video anda di YouTube, di-set "Not For Kids" dengan visibility Unlisted.

## Submission
1. ```src/academic/model/*.java```;
2. ```src/academic/driver/*.java```;
3. changelog.txt

## How to submit?
Please see https://youtu.be/ZOhgmVjWFyo
