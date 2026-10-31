import java.util.Scanner;
public class tugasTiga09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
         
        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int total = 0;
            int barangTertinggi = -1;
            int tokoTerbanyak = 0;
            int toko = 1;
            String ringkasan = "";
            
            while (toko <= jumlahToko) {
                int jumlahPelanggan;
                do {
                    System.out.print(" Toko " + toko + " - Jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println( "Tidak boleh negatif. Input lagi!.");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print(" Pelanggan " + p + " - Jumlah barang: ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println(" Tidak boleh negatif. Input lagi!.");
                        }
                    }
                    while (barang < 0);
                    totalBarangToko += barang;
                }
                ringkasan += "Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko;
                total += totalBarangToko;
                
                if (totalBarangToko > barangTertinggi) {
                    barangTertinggi = totalBarangToko;
                    tokoTerbanyak = toko;

                }
                toko++;
            }
            System.out.println();
            System.out.println("Total barang seluruh toko: " + total);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}