# T06 Remedial

Pada tugas ini anda diminta untuk kembali mengembangkan Academic Simulator dengan menambahkan fitur baru.

## Task 01 Remedial (academic.driver.Driver1, 100pts)

Pada tugas ini, kembangkanlah sebuah fitur yang memampukan simulator untuk menerima nilai remedial. Remedial adalah sebuah proses untuk mengganti nilai (```grade```) yang diperoleh oleh mahasiswa di suatu mata kuliah. Remedial hanya dapat dilakukan bagi mahasiswa yang sebelumnya sudah pernah mendapatkan nilai. Nilai pengganti atau nilai remedial kemudian digunakan untuk mengukur performa mahasiswa di mata kuliah tersebut.

Hal yang perlu diperhatikan:
1. Remedial hanya dapat dilakukan sekali untuk setiap rencana studi.
2. Sekalipun nilai telah diganti namun nilai sebelumnya harus tetap tercatat dan digunakan sebagai sejarah perubahan.

Dengan penambahan fitur ini, maka bentuk keluaran untuk ```enrollment``` akan sedikit berbeda. Khusus bagi yang melakukan remedial harus menampilkan juga nilai terdahulu. Perhtikan bahwa untuk mahasiswa yang tidak melakukan remedial format keluaran yang digunakan adalah format sebelumnya.

```bash
<course-code>|<student-id>|<year>|<semester>|<grade>(<previous-grade>)
```

Perhatikan contoh berikut.

**Input**:
```bash
lecturer-add#0114129002#Iustisia Natalia Simbolon#IUS#iustisia.simbolon@del.ac.id#Informatics
course-add#12S1101#Dasar Sistem Informasi#3#D#IUS
student-add#12S20001#Marcelino Manalu#2020#Information Systems
student-add#12S20002#Yoga Sihombing#2020#Information Systems
student-add#12S20003#Marcel Simanjuntak#2020#Information Systems
enrollment-add#12S1101#12S20001#2020/2021#odd
enrollment-add#12S1101#12S20002#2020/2021#odd
enrollment-add#12S1101#12S20003#2020/2021#odd
enrollment-grade#12S1101#12S20001#2020/2021#odd#B
enrollment-grade#12S1101#12S20002#2020/2021#odd#B
enrollment-grade#12S1101#12S20003#2020/2021#odd#B
student-details#12S20001
student-details#12S20002
student-details#12S20003
enrollment-remedial#12S1101#12S20003#2020/2021#odd#A
enrollment-remedial#12S1101#12S20003#2020/2021#odd#AB
student-details#12S20003
---

```

**Output**:
```bash
12S20001|Marcelino Manalu|2020|Information Systems|3.00|3
12S20002|Yoga Sihombing|2020|Information Systems|3.00|3
12S20003|Marcel Simanjuntak|2020|Information Systems|3.00|3
12S20003|Marcel Simanjuntak|2020|Information Systems|4.00|3
0114129002|Iustisia Natalia Simbolon|IUS|iustisia.simbolon@del.ac.id|Informatics
12S1101|Dasar Sistem Informasi|3|D|IUS (iustisia.simbolon@del.ac.id)
12S20001|Marcelino Manalu|2020|Information Systems
12S20002|Yoga Sihombing|2020|Information Systems
12S20003|Marcel Simanjuntak|2020|Information Systems
12S1101|12S20001|2020/2021|odd|B
12S1101|12S20002|2020/2021|odd|B
12S1101|12S20003|2020/2021|odd|A(B)

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
