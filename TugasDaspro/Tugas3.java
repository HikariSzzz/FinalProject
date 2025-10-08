import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEM PERPUSTAKAAN DAN AKSES WIFI KAMPUS ===");
        System.out.println("1. Cek izin masuk perpustakaan");
        System.out.println("2. Cek akses WiFi kampus");
        System.out.print("Pilih menu (1/2): ");
        int menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                // ======== SISTEM PERPUSTAKAAN ========
                System.out.println("\n--- Sistem Perpustakaan Kampus ---");

                System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
                boolean punyaKartu = sc.nextBoolean();

                System.out.print("Apakah sudah registrasi online? (true/false): ");
                boolean sudahRegistrasi = sc.nextBoolean();

                if (punyaKartu || sudahRegistrasi) {
                    System.out.println("Izin masuk diberikan ");
                } else {
                    System.out.println("Izin masuk ditolak ");
                }
                break;

            case 2:
                // ======== SISTEM AKSES WIFI ========
                System.out.println("\n--- Sistem Akses WiFi Kampus ---");

                System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lain): ");
                String jenis = sc.nextLine().toLowerCase();

                if (jenis.equals("dosen")) {
                    System.out.println("Akses WiFi diberikan (dosen) ");
                } else if (jenis.equals("mahasiswa")) {
                    System.out.print("Masukkan jumlah SKS yang diambil: ");
                    int sks = sc.nextInt();

                    if (sks >= 12) {
                        System.out.println("Akses WiFi diberikan (mahasiswa aktif) ");
                    } else {
                        System.out.println("Akses ditolak, SKS kurang dari 12 ");
                    }
                } else {
                    System.out.println("Akses ditolak ");
                }
                break;

            default:
                System.out.println("Pilihan menu tidak valid.");
                break;
        }

        sc.close();
    }
}
