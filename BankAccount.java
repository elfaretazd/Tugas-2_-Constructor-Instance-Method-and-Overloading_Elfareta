import java.util.Scanner;

class BankAccount {
    private String noRek;
    private String namaPemilik;
    private double saldo;
    private String jenisAkun;

    // Constructor dengan 4 parameter
    public BankAccount(String noRek, String namaPemilik, double saldo, String jenisAkun) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
        this.jenisAkun = jenisAkun;
    }

    // Constructor dengan 3 parameter (saldo default)
    public BankAccount(String noRek, String namaPemilik, String jenisAkun) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.jenisAkun = jenisAkun;
        this.saldo = jenisAkun.equalsIgnoreCase("Tabungan") ? 100.0 : 500.0;
    }

    // Menampilkan informasi rekening
    public void displayInfo() {
        System.out.println("Nomor Rekening: " + noRek);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
        System.out.println("Jenis Akun: " + jenisAkun);
        System.out.println("---------------------------");
    }

    // Menambahkan saldo
    public void deposit(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal deposit harus lebih dari 0!");
        } else {
            saldo += nominal;
            System.out.println("Berhasil deposit: " + nominal);
        }
    }

    // Menarik saldo
    public void withdraw(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal penarikan harus lebih dari 0!");
        } else if (nominal > saldo) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= nominal;
            System.out.println("Berhasil tarik tunai: " + nominal);
        }
    }

    // Transfer saldo ke rekening lain
    public void transfer(BankAccount tujuan, double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal transfer harus lebih dari 0!");
        } else if (nominal > saldo) {
            System.out.println("Saldo tidak mencukupi untuk transfer!");
        } else {
            saldo -= nominal;
            tujuan.saldo += nominal;
            System.out.println("Transfer sebesar " + nominal + " ke " + tujuan.namaPemilik + " berhasil!");
        }
    }
}
