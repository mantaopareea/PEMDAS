import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan operator pertama: ");
        int operator1 = input.nextInt();
        System.out.print("Masukkan operator kedua: ");
        int operator2 = input.nextInt();

        // Proses & Output
        int hasilPenjumlahan = operator1 + operator2;
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        int hasilPengurangan = operator1 - operator2;
        System.out.println("Hasil pengurangan: " + hasilPengurangan);
        int hasilPerkalian = operator1 * operator2;
        System.out.println("Hasil perkalian: " + hasilPerkalian);

        // Menggunakan double untuk pembagian agar mendapatkan hasil desimal
        double hasilPembagian = (double) operator1 / operator2;
        System.out.println("Hasil pembagian: " + hasilPembagian);

        input.close(); // Menutup scanner
    }
}
