# Penjelasan program

Pemrograman ini bertujuan untuk mensimulasikan sistem rekening bank sederhana dengan berbagai operasi seperti penyetoran (deposit), penarikan (withdraw), dan transfer saldo antar akun.

# Penjelasan Singkat Kode:

1. ***Kelas `BankAccount` (Blueprint untuk Rekening)***

- Berisi atribut: `noRek`, `namaPemilik`, `saldo`, dan `jenisAkun`.
- Memiliki dua constructor:
- Dengan saldo yang ditentukan pengguna.
- Dengan saldo default berdasarkan jenis akun (`Tabungan` → 100000, lainnya → 500000).

***Metode:***
- `displayInfo():` Menampilkan informasi rekening.
- `deposit(nominal):` Menambahkan saldo dengan validasi.
- `withdraw(nominal):` Menarik saldo dengan validasi.
- `transfer(BankAccount tujuan, double nominal):` Mengirim saldo ke akun lain.

2. ***Kelas Main (Eksekusi Program)***

- Membuat dua objek `BankAccount` dengan constructor yang berbeda.
- Menampilkan informasi awal akun.
- Memproses transaksi (deposit, withdraw, transfer) berdasarkan input pengguna.
- Menampilkan informasi rekening setelah transaksi.

# Kesimpulan
Program ini mensimulasikan operasi dasar rekening bank dan memastikan transaksi hanya berjalan dengan saldo yang cukup serta nominal yang valid.
