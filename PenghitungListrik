import java.util.Scanner;

public class PenghitungListrik {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // --- Input Pengguna ---
        System.out.println("Program Penghitung Pemakaian Listrik Sederhana");

        System.out.print("Masukkan Nama\t\t: ");
        String nama = input.nextLine();

        System.out.print("Kelurahan\t\t: ");
        String kelurahan = input.nextLine();

        System.out.print("Masukkan posisi awal Kwh Meter\t: ");
        int awalKwh = input.nextInt();

        System.out.print("Masukkan posisi akhir Kwh Meter\t: ");
        int akhirKwh = input.nextInt();

        System.out.print("Masukkan biaya beban saat ini\t: ");
        double biayaBeban = input.nextDouble();

        System.out.print("Masukkan PPJ (dalam persen)\t: ");
        double ppjPersen = input.nextDouble();

        // --- Proses Perhitungan ---

        // 1. Hitung total pemakaian Kwh
        int totalKwh = akhirKwh - awalKwh;

        // 2. Hitung total biaya berdasarkan pemakaian Kwh dan biaya beban
        double totalBiayaPemakaian = totalKwh * biayaBeban;

        // 3. Hitung jumlah PPJ
        double jumlahPPJ = totalBiayaPemakaian * (ppjPersen / 100);

        // 4. Hitung total tagihan (biaya pemakaian + PPJ)
        double totalTagihan = totalBiayaPemakaian + jumlahPPJ;

        // --- Output Hasil ---
        System.out.println("\n--- Rincian Tagihan Listrik ---");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Kelurahan\t\t: " + kelurahan);
        System.out.println("Pemakaian Kwh\t\t: " + totalKwh + " Kwh");
        System.out.println("Biaya Beban per Kwh\t: Rp " + String.format("%.2f", biayaBeban)); // Format hingga 2 desimal
        System.out.println("Total Biaya Pemakaian\t: Rp " + String.format("%.2f", totalBiayaPemakaian));
        System.out.println("PPJ (" + ppjPersen + "%)\t\t: Rp " + String.format("%.2f", jumlahPPJ));
        System.out.println("Total Tagihan\t\t: Rp " + String.format("%.2f", totalTagihan));

        input.close(); // Menutup scanner
    }
}
