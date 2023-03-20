# T04 Student Performance

Tugas kali ini **berbeda** dan **tidak terkait** dengan tugas-tugas sebelumnya sekalipun menggunakan konteks persoalan yang mirip, Academic.

Pada tugas ini anda diminta untuk mengembangkan sebuah solusi yang mampu menyimpan data mahasiswa dan akan digunakan untuk mencari mahasiswa-mahasiswa dengan nilai terbaik. Seorang mahasiswa dapat dideskripsikan dengan Nomor Induk Mahasiswa (NIM--```id```), nama lengkap (```name```), Indeks Prestasi Kumulatif (IPK--```GPA```), dan sks yang telah ditempuh (```credit```). Solusi akan dikembangkan secara bertahap, sebagai berikut.

## Task 01: Adding-up Student (academic.driver.Driver1, 40 pts)

Pada tugas pertama, anda diminta mengembangkan sebuah fitur untuk menambah data mahasiswa baru. Berikut adalah format perintah yang digunakan.

```bash
student-add#<student-id>#<name>#<gpa>#<credit>
```

Berikut adalah contoh penggunaan perintah di atas.

```bash
student-add#12S20001#Marcelino Manalu#3.28#57
```

Selanjutnya, solusi juga harus mampu menampilkan seluruh data mahasiswa yang telah tersimpan. Data ditampilkan berurut sesuai urutan masukan. Berikut adalah format perintah yang digunakan.

```bash
student-show-all
```

Perhatikan contoh berikut.

**Input**

```bash
student-add#12S20001#Marcelino Manalu#3.28#57
student-add#12S20002#Yoga Sihombing#3.04#57
student-add#12S20003#Marcel Simanjuntak#2.57#57
student-show-all
student-add#12S20005#Juan Sitompul#3.17#57
student-add#12S20006#Nadya Tambunan#2.98#57
student-show-all
---

```

**Output**

```bash
12S20001|Marcelino Manalu|3.28|57
12S20002|Yoga Sihombing|3.04|57
12S20003|Marcel Simanjuntak|2.57|57
12S20001|Marcelino Manalu|3.28|57
12S20002|Yoga Sihombing|3.04|57
12S20003|Marcel Simanjuntak|2.57|57
12S20005|Juan Sitompul|3.17|57
12S20006|Nadya Tambunan|2.98|57

```

## Task 02: THe Best Students (academic.driver.Driver2, 60 pts)

Pada bagian ini, anda diminta untuk mengembangkan sebuah fitur untuk menampilkan ```n``` mahasiswa terbaik dilihat dari IPK-nya. Bila terdapat lebih dari satu mahasiswa dengan IPK yang sama, maka mahasiswa diurutkan kembali berdasarkan NIM-nya. Berikut adalah format perintah yang digunakan.

```bash
student-best#<n>
```

Perhatikan contoh berikut.

**Input**

```bash
student-add#12S20001#Marcelino Manalu#3.28#57
student-add#12S20002#Yoga Sihombing#3.04#57
student-add#12S20003#Marcel Simanjuntak#2.57#57
student-best#2
student-add#12S20005#Juan Sitompul#3.17#57
student-show-all
student-add#12S20006#Nadya Tambunan#2.98#57
student-best#2
---

```

**Output**

```bash
12S20001|Marcelino Manalu|3.28|57
12S20002|Yoga Sihombing|3.04|57
12S20001|Marcelino Manalu|3.28|57
12S20002|Yoga Sihombing|3.04|57
12S20003|Marcel Simanjuntak|2.57|57
12S20005|Juan Sitompul|3.17|57
12S20001|Marcelino Manalu|3.28|57
12S20005|Juan Sitompul|3.17|57

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
