import java.util.Scanner;
public class MenuKafe27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
         String[] menu = { "Nasi Goreng","Mie Goreng","Roti Bakar","Kentang Goreng","Teh Tarik","Cappucino","Chocolate Ice"};

          System.out.println("===== Daftar Menu Kafe =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println("==================");
        System.out.println("Masukkan Nama Yang ingin Dicari");
        String cari=sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
        if (menu[i].equalsIgnoreCase(cari)) {
             System.out.println(menu[i] + " tersedia di menu (nomor " + (i + 1) + ").");
             break;
        }
    }
    }
}
