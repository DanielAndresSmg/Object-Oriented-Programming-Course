# T02 Juragan Buku (Paired Assignment)

Pada hari Minggu Butet diajak ke kota oleh ayahnya. Dalam perjalanan pulang, ia berada dalam satu kendaraan umum bersama sorang pustakawan. Untuk mengisi waktu, Butet berbincang bersama sang pustakawan dengan menjaga protokol kesehatan. Maklum, masih pandemi. Dalam perbincangan, Butet ingin tahu lebih banyak mengenai karakteristik buku dan serba-serbinya. Butet sangat menikmati perbincangan tersebut.

Dari perbincangan bersama sang pustakawan, Butet mengetahui dua hal baru. Hal pertama adalah ada buku yang penerbitannya tidak dilakukan melalui suatu penerbit tertentu. Penerbitan ini disebut self publication. Buku yang dipublikasikan secara mandiri tidak dituliskan penerbitnya.

Hal menarik kedua adalah kategori kualitas buku. Menurut sang pustakawan, kualitas buku dapat dikategori menjadi lima (5). Kategori ditentukan dari ```rating``` yang diperoleh buku. Berikut adalah pengkategorian buku dari yang tertinggi. Sebuah buku hanya dapat dikategorikan ke dalam satu kategori saja.
1. Best Pick, minimal rating 4.7;
2. Must Read, minimal rating 4.5;
3. Recommended, minimal rating 4.0;
4. Average, minimal rating 3.0;
5. Low, rating di bawah 3.0;

Keesokan harinya, Butet menyampaikan pengalamannya pada Ucok. Butet berpendapat bahwa dua hal menarik yang diperolehnya dari sang pustakawan dapat diintegrasikan ke dalam program yang mereka sudah kembangkan. Dari analisis Ucok, perlu dilakukan perubahan pada bagaimana program membaca input dan memberikan keluaran.

**Perubahan pada input**. Untuk buku yang dipublikasikan secara mandiri, user harus memasukkan ```---``` (trippled dashes). Perhatikan Example 1.

**Perubahan pada output**. Pada luaran, ditambahkan satu segmen tambahan yang menunjukkan kualitas buku. Segmen kualitas dituliskan sesuai dengan pengkategorian di atas. Perhatikan Example 1 dan Example 2.

### Example 1

**Input**:
```bash
979-8700048361
The Science of Self-Control
Menno Henselmans
2021
---
no
35.98
1.11
41
5.0

```

**Output**:
```bash
979-8700048361|The Science of Self-Control|Menno Henselmans|2021|---|no|35.98|1.11|41|5.0|Best Pick

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
978-0130895929|C: A Reference Manual|Samuel Harbison, Guy Steele Jr.|2002|Pearson|no|50.19|11.05|21|4.1|Recommended

```

## Reporting

Lakukan pertemuan dengan pair anda untuk mendiskusikan persoalan dan pengembangan solusi. Rekaman dari pertemuan tersebut menjadi bagian dari artefak tugas yang harus dikumpulkan. Durasi rekaman minimal 20 menit.

Presentasikan pekerjaan anda dalam sebuah video.
1. Setiap pair member harus berkontribusi dalam presentasi.
2. Jabarkan solusi anda (Flowgorithm).
3. Jabarkan kesulitan yang anda hadapi dalam rangka pengembangan solusi.

**Note**: Semakin tajam argumen dan penjabaran anda semakin mudah penilaian dilakukan.

**Kriteria Video Presentasi**:
+ 1080p/30fps, min. 10 menit.
+ Suara jernih dan dapat dengan jelas terdengar.
+ Posting video anda di YouTube, di-set "Not For Kids" dengan visibility Unlisted.

## Submissions:

1. T02.java
2. T02.fprg
3. changelog.txt

## How to Submit?

Please see https://youtu.be/cU546lAL9g8