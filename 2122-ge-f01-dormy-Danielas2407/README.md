# F01 Dormy

Pada sesi ini anda diminta untuk menyelesaikan sebuah persoalan untuk menguji pengetahuan serta keterampilan anda dalam menerapkan berbagai konsep yang telah dipelajari.

## Case Study

Di Institut Teknologi Del, mahasiswa hidup bersama dalam lingkungan asrama. Setiap mahasiswa ditempatkan dalam fasilitas asrama yang nyaman dan asri. Terdapat beberapa asrama yang disediakan untuk mahasiswa pria dan wanita.

Berikut adalah ketentuan-ketentuan yang diterapkan:
1. Penempatan mahasiswa memperhatikan jenis kelamin. Mahasiswa pria (```male```) hanya dapat ditempatkan pada asrama pria. Prinsip yang sama diberlakukan juga kepada mahasiswa wanita (```female```).
2. Penempatan mahasiswa ke dalam asrama tidak boleh melebihi kapasitas. Dengan demikian, kenyamanan penghuni asrama dapat dijaga.
3. Seorang mahasiswa (```student```) dapat diidentifikasi dengan atribut: nomor induk mahasiswa (```id```), nama (```name```), tahun masuk (```entrance year```), dan jenis kelamin (```gender```). Keunikan seorang mahasiswa dijamin melalui nomor induk mahasiswa (```id```).
4. Sebuah asrama (```dorm```) dapat diidentifikasi dengan atribut: nama (```name```), kapasitas (```capacity```), dan jenis kelamin penghuni (```gender```). Keunikan sebuah asrama dijamin melalui nama (```name```).


## Codebase
Tugas anda pada adalah mensimulasikan studi kasus di atas dalam sebuah solusi sederhana berbasis Java dengan mengaplikasikan konsep OO dan ORM berbasis JPA. Seluruh data yang diinteraksikan dalam simulator akan disimpan pada H2 database. Sebuah Maven-based repository juga telah disediakan bagi anda. Pada repository tersebut telah disediakan:
+ Initial project setting pada ```pom.xml```.
+ Initial database mapping pada ```./src/main/resources/META-INF/persistence.xml```. Konfigurasi ini masih perlu diadaptasi sesuai dengan solusi anda.
+ Driver class ```pada pbo.f01.App```.

Anda diperbolehkan untuk mendefinisikan construct baru sesuai dengan kebutuhan solusi anda.

**Note**: pasca melakukan repo cloning, silakan untuk mengubah ```groupId``` pada ```pom.xml``` anda dengan menyesuaikan nomor pair.

## Tugas 1. Database Design (20 points)

Dengan memperhatikan studi kasus yang telah dijabarkan, gambarkan struktur basisdata yang sesuai dan relevan. Gambarkan dalam sebuah diagram Physical Data Model (PDM). Presentasikan desain anda.

## Tugas 2. Entity Definition (20 points)

Merujuk pada struktur basisdata yang telah disusun, kembangkan entity classes yang representatif. Anda diperbolehkan untuk mendefinisikan mapping pada entity class (annotation) atau pada ```persistence.xml```. Pada presentasi, buktikan kesesuaian antara struktur basisdata dan entity classes yang anda kembangkan.

## Tugas 3. Display All (20 points)

Dalam bekerja, simulator anda akan berinteraksi dengan pengguna melalui ```STDIN-STDOUT```. Interaksi dilakukan dengan membaca perintah yang diberikan pengguna, baris per baris. Simulator memberikan respon sesuai dengan perintah yang diberikan. Simulator akan berhenti bekerja bila diberi perintah ```---```.

Pada tugas ini anda diminta untuk mengembangkan sebuah fitur untuk menampilkan seluruh data asrama (```dorms```) dan mahasiswa (```students```). Berikut adalah format perintah yang diberikan:

```bash
display-all
```

Simulator kemudian akan menampilkan semua data asrama berurutan menaik (```ascending```) berdasarkan nama (```name```) dari asrama. Untuk setiap asrama kemudian ditampilkan nama-nama penghuninya diurutkan menaik (```ascending```) berdasarkan nama (```name```) dari mahasiswa. Perhatikan contoh luaran berikut.

```bash
Kapernaum|male|5|2
12S21010|Bobby Siagian|2021
12S21001|Dhino Turnip|2021
Pniel|female|5|1
12S21006|Weny Sitinjak|2021
```

## Tugas 4. Register a Student (20 points)

Pada tugas ini anda diminta untuk mengembangkan sebuah fitur untuk menambahkan data mahasiswa (```student```) ke dalam simulator. Berikut adalah format masukan yang digunakan.

```bash
student-add#<id>#<name>#<year>#<gender>
```

Simulator tidak memberikan luaran apapun ke ```STDOUT```. Perhatikan contoh berikut.

```bash
student-add#12S21010#Bobby Siagian#2021#male
student-add#12S21001#Dhino Turnip#2021#male
student-add#12S21006#Weny Sitinjak#2021#female
```

## Tugas 4. Register a Dorm (20 points)

Pada tugas ini anda diminta untuk mengembangkan sebuah fitur untuk menambahkan data asrama (```dorm```) ke dalam simulator. Berikut adalah format masukan yang digunakan.

```bash
dorm-add#<name>#<capacity>#<gender>
```

Simulator tidak memberikan luaran apapun ke ```STDOUT```. Perhatikan contoh berikut.

```bash
dorm-add#Pniel#5#female
dorm-add#Kapernaum#5#male
```

## Tugas 5. Assigning Student into Dorm (20 points)

Pada tugas ini anda diminta untuk mengembangkan sebuah fitur untuk menempatkan seorang mahasiswa (```student```) ke sebuah asrama (```dorm```). Perlu diingat bahwa penempatan harus memperhatikan kapasitas asrama. Berikut adalah format masukan yang digunakan.

```bash
assign#<student-id>#<dorm-name>
```

Simulator tidak memberikan luaran apapun ke ```STDOUT```.

Perhatikan contoh berikut.

**Input**:
```bash
dorm-add#Pniel#5#female
dorm-add#Kapernaum#5#male
student-add#12S21010#Bobby Siagian#2021#male
student-add#12S21001#Dhino Turnip#2021#male
student-add#12S21006#Weny Sitinjak#2021#female
assign#12S21010#Kapernaum
assign#12S21001#Kapernaum
assign#12S21006#Pniel
display-all
---

```

**Output**:
```bash
Kapernaum|male|5|2
12S21010|Bobby Siagian|2021
12S21001|Dhino Turnip|2021
Pniel|female|5|1
12S21006|Weny Sitinjak|2021

```

## Reporting
Lakukan pertemuan dengan pair anda untuk mendiskusikan persoalan dan pengembangan solusi. Rekaman dari pertemuan tersebut menjadi bagian dari artefak tugas yang harus dikumpulkan. Durasi rekaman minimal **30 menit**.

Presentasikan pekerjaan anda dalam sebuah video. Pada presentasi:
1. Jabarkan solusi anda dengan rinci.
2. Berikan rationale dari setiap implementasi yang anda hasilkan.
3. Jabarkan alir eksekusi dari solusi anda.
4. Demonstrasikan pekerjaan anda.
5. Tunjukkan hasil yang anda peroleh dari GitHub Classroom.
6. Sebutkan kendala yang dihadapi dalam pengerjaan tugas kali ini.

Note: Semakin tajam argumen dan penjabaran anda semakin mudah penilaian dilakukan.

Kriteria Video Presentasi:
+ 1080p/30fps, min. 10 menit.
+ Fullscreen (taskbar terlihat).
+ Suara jernih dan dapat dengan jelas terdengar.
+ Posting kedua video anda di YouTube, di-set "Not For Kids" dengan visibility Unlisted.

## Submissions:

1. Full project.
2. changelog.txt

## How to submit?
Please see https://youtu.be/g0BQ195-aWo