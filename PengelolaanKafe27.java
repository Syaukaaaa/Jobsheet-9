import java.util.Scanner;

public class PengelolaanKafe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Pesanan");
        int jmlPesanan = sc.nextInt();
         sc.nextLine();

        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];
        double totalBiaya = 0;

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            System.out.println("Menu Yang Ingin Anda pesan : ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Harga: ");
            hargaPesanan[i] = sc.nextDouble();
              sc.nextLine();
             totalBiaya += hargaPesanan[i];
        }
        

        System.out.println("========================");
        System.out.println("Daftar Pesanan Pelanggan : ");

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);

           
        }
         System.out.println("Total biaya pesanan: Rp " + totalBiaya);
         System.out.println("===============================");
    }
}
