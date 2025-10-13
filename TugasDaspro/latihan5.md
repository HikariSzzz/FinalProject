# Latihan Soal

**Nama**: Varell Nashwa Alifio Wijaya
**NIM**: 254107020209
**Kelas**: TI-1C  

## Soal

### Soal 1
Jika mahasiswa membawa kartu mahasiswa atau sudah melakukan registrasi online, maka boleh masuk. Jika tidak memenuhi salah satu dari dua syarat tersebut, maka ditolak masuk. Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!

### Soal 2
Di kampus tersedia layanan WiFi gratis yang hanya bisa diakses oleh civitas akademika. Sistem hotspot kampus akan melakukan pengecekan sebagai berikut:  
- Jika jenis pengguna adalah dosen, maka tampilkan “Akses WiFi diberikan (dosen)”.  
- Jika jenis pengguna adalah mahasiswa, maka sistem akan memeriksa jumlah SKS yang diambil:  
  - Jika SKS ≥ 12, maka tampilkan “Akses WiFi diberikan (mahasiswa aktif)”.  
  - Jika SKS < 12, maka tampilkan “Akses ditolak, SKS kurang dari 12”.  
- Jika bukan mahasiswa maupun dosen, maka tampilkan “Akses ditolak”.  
Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!

## Jawaban

### Jawaban Soal 1
**Flowchart**:  
![Flowchart Soal 1](https://github.com/user-attachments/assets/2e26119d-c341-4977-9ad0-82d2aa121914)

**Pseudocode**:  
```
START
DECLARE boolean ktm, registrasi

INPUT ktm
INPUT registrasi

IF (ktm = true OR registrasi = true)
    OUTPUT "Boleh masuk"
ELSE
    OUTPUT "Dilarang masuk"
END
```

### Jawaban Soal 2
**Flowchart**:  
![Flowchart Soal 2](https://github.com/user-attachments/assets/8bc84a06-b8b0-40c4-b44e-d6f166891b16)

**Pseudocode**:  
```
START
DECLARE string jenisPengguna
DECLARE integer sks

OUTPUT "Masukkan jenis pengguna (dosen/mahasiswa/lainnya): "
INPUT jenisPengguna

IF jenisPengguna = "dosen"
    OUTPUT "Akses WiFi diberikan (dosen)"
ELSE IF jenisPengguna = "mahasiswa"
    OUTPUT "Masukkan jumlah SKS yang diambil: "
    INPUT sks
    IF sks >= 12
        OUTPUT "Akses WiFi diberikan (mahasiswa aktif)"
    ELSE
        OUTPUT "Akses ditolak, SKS kurang dari 12"
ELSE
    OUTPUT "Akses ditolak"
END