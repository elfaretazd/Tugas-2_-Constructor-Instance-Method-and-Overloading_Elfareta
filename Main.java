public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Membuat dua objek BankAccount dengan constructor yang berbeda
        BankAccount akun1 = new BankAccount("123456789", "Reta", 100000.0, "Tabungan");
        BankAccount akun2 = new BankAccount("987654321", "Rasya", "Giro");

        // Menampilkan informasi akun
        akun1.displayInfo();
        akun2.displayInfo();

        // Melakukan deposit pada akun pertama
        System.out.print("Masukkan jumlah deposit untuk akun 1: ");
        double deposit1 = scan.nextDouble();
        akun1.deposit(deposit1);
        akun1.displayInfo();

        // Melakukan withdraw pada akun kedua
        System.out.print("Masukkan jumlah penarikan untuk akun 2: ");
        double withdraw2 = scan.nextDouble();
        akun2.withdraw(withdraw2);
        akun2.displayInfo();

        // Melakukan transfer dari akun pertama ke akun kedua
        System.out.print("Masukkan jumlah transfer dari akun 1 ke akun 2: ");
        double transferAmount = scan.nextDouble();
        akun1.transfer(akun2, transferAmount);

        // Menampilkan informasi akhir setelah transaksi
        akun1.displayInfo();
        akun2.displayInfo();

        scan.close();
    }
}
