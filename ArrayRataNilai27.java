import java.util.Scanner;
public class ArrayRataNilai27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total = 0; 
        double rata2,rata3,rata4;
        double totalLulus = 0, totalTidakLulus = 0;
        int jmlLulus = 0, jmlTidakLulus = 0;



         System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
         rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai: " + rata2);

         for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]>70) {
                totalLulus+=nilaiMhs[i];
                jmlLulus++;
            }else{
                totalTidakLulus+=nilaiMhs[i];
                jmlTidakLulus++;
            }

        }  
         rata3 = totalLulus/ jmlLulus;
         System.out.println("Rata Rata Nilai Lulus="+rata3);

         rata4=totalTidakLulus/jmlTidakLulus;
         System.out.println("Rata rata nilai tidak lulus"+rata4);
    }
}