# T05 Advanced Academic Stats

Tugas ini merupakan pengembangan dari hasil pekerjaan anda pada UTS yll (M01). Pada tugas ini anda diminta untuk menyelesaikan dua persoalan. Yang pertama anda diminta untuk menganalisis potensi penerapan prinsip inheritance pada solusi terdahulu. Sementara pada bagian kedua, anda diminta untuk mengembangkan sebuah fitur baru ke dalam simulator.

## Task 01: Applying Inheritance (academic.driverDriver1, 60pts)

Pada tugas ini anda diminta untuk menganalisis pekerjaan anda sebelumnya guna mencari aspek-aspek di mana inheritance berpotensi diaplikasikan. Anda dapat menerapkan pendekatan top-down maupun bottom-up untuk menemukan potensi tersebut.

Bila telah menemukan, tuangkan ide anda dalam sebuah Class Diagram yang nantinya akan dipresentasikan dalam laporan.

Tahap terakhir adalah realisasikan ide anda dengan me-refactor codebase anda.

## Task 02: Student's GPA (academic.driverDriver2, 40pts)

Tugas ini merupakan kelanjutan dari **Task 01**. Pada tugas ini anda diminta untuk me-revisit solusi anda sehingga mampu menangani kasus mengulang mata kuliah berulang. Sebagai contoh, seorang mahasiswa telah mengambil sebuah mata kuliah (misal Basisdata) pada dua semester berbeda. Pada pengambilan pertama mendapat nilai BC dan berikutnya mendapatkan nilai A. Merujuk pada Peraturan Akademik, nilai yang akan diakui adalah yang terakhir. Dengan demikian, perhitungan performa akademik juga akan menggunakan nilai terakhir. Perhatikan contoh berikut.

**Input**

```bash
lecturer-add#0130058501#Parmonangan Rotua Togatorop#PAT#mona.togatorop@del.ac.id#Information Systems
lecturer-add#0114129002#Iustisia Natalia Simbolon#IUS#iustisia.simbolon@del.ac.id#Informatics
lecturer-add#0124108201#Rosni Lumbantoruan#RSL#rosni@del.ac.id#Information Systems
course-add#12S1101#Dasar Sistem Informasi#3#D#IUS
course-add#12S2102#Basisdata#4#C#PAT,IUS,RSL
student-add#12S20001#Marcelino Manalu#2020#Information Systems
student-add#12S20002#Yoga Sihombing#2020#Information Systems
student-add#12S20003#Marcel Simanjuntak#2020#Information Systems
enrollment-add#12S1101#12S20001#2020/2021#odd
enrollment-add#12S1101#12S20002#2020/2021#odd
enrollment-add#12S1101#12S20003#2020/2021#odd
enrollment-grade#12S1101#12S20001#2020/2021#odd#B
enrollment-grade#12S1101#12S20002#2020/2021#odd#B
enrollment-grade#12S1101#12S20003#2020/2021#odd#B
enrollment-add#12S2102#12S20001#2021/2022#odd
enrollment-add#12S2102#12S20002#2021/2022#odd
enrollment-add#12S2102#12S20003#2021/2022#odd
enrollment-grade#12S2102#12S20001#2021/2022#odd#B
enrollment-grade#12S2102#12S20002#2021/2022#odd#AB
enrollment-grade#12S2102#12S20003#2021/2022#odd#BC
enrollment-add#12S2102#12S20003#2022/2023#odd
enrollment-grade#12S2102#12S20003#2022/2023#odd#AB
student-details#12S20001
student-details#12S20002
student-details#12S20003
---

```

**Output**

```bash
12S20001|Marcelino Manalu|2020|Information Systems|3.00|7
12S20002|Yoga Sihombing|2020|Information Systems|3.29|7
12S20003|Marcel Simanjuntak|2020|Information Systems|3.29|7
0130058501|Parmonangan Rotua Togatorop|PAT|mona.togatorop@del.ac.id|Information Systems
0114129002|Iustisia Natalia Simbolon|IUS|iustisia.simbolon@del.ac.id|Informatics
0124108201|Rosni Lumbantoruan|RSL|rosni@del.ac.id|Information Systems
12S1101|Dasar Sistem Informasi|3|D|IUS (iustisia.simbolon@del.ac.id)
12S2102|Basisdata|4|C|PAT (mona.togatorop@del.ac.id);IUS (iustisia.simbolon@del.ac.id);RSL (rosni@del.ac.id)
12S20001|Marcelino Manalu|2020|Information Systems
12S20002|Yoga Sihombing|2020|Information Systems
12S20003|Marcel Simanjuntak|2020|Information Systems
12S1101|12S20001|2020/2021|odd|B
12S1101|12S20002|2020/2021|odd|B
12S1101|12S20003|2020/2021|odd|B
12S2102|12S20001|2021/2022|odd|B
12S2102|12S20002|2021/2022|odd|AB
12S2102|12S20003|2021/2022|odd|BC
12S2102|12S20003|2022/2023|odd|AB

```

## Reporting
Lakukan pertemuan dengan pair anda untuk mendiskusikan persoalan dan pengembangan solusi. Rekaman dari pertemuan tersebut menjadi bagian dari artefak tugas yang harus dikumpulkan. Durasi rekaman minimal **30 menit**.

Presentasikan pekerjaan anda dalam sebuah video. Pada presentasi:
1. Jabarkan hasil analisis anda dan implementasi prinsip inheritance dengan menampilkan Class Diagram yang dihasilkan.
2. Jabarkan hasil refactoring dari pekerjaan anda setelah mengaplikasikan prinsip inheritance.
3. Jabarkan solusi anda dalam upaya menjawab tugas kedua.
4. Berikan rationale dari setiap implementasi yang anda hasilkan serta berikan argumen mengapa pilihan implementasi anda merupakan pilihan terbaik.
5. Jabarkan alir eksekusi dari solusi anda.
6. Demonstrasikan pekerjaan anda.
7. Tunjukkan hasil yang anda peroleh dari GitHub Classroom.
8. Sebutkan kendala yang dihadapi dalam pengerjaan tugas kali ini.

Note: Semakin tajam argumen dan penjabaran anda semakin mudah penilaian dilakukan.

Kriteria Video Presentasi:
+ 1080p/30fps, min. 10 menit.
+ Fullscreen (taskbar terlihat).
+ Suara jernih dan dapat dengan jelas terdengar.
+ Posting video anda di YouTube, di-set "Not For Kids" dengan visibility Unlisted.

## Submission
1. ```src/academic/model/*.java```;
2. ```src/academic/driver/*.java```;
3. changelog.txt

## How to submit?
Please see https://youtu.be/ZOhgmVjWFyo
