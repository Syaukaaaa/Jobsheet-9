import java.util.Scanner;
public class NilaiMahasiswa27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Masukkan jumlah Mahasiswa yang mau input nilai =");
        int jumlahMhs=sc.nextInt();
        int total=0,rata;
        int [] nilaiMahasiswa= new int [jumlahMhs];

        for(int i=0;i<nilaiMahasiswa.length;i++){
            System.out.println("Nilai Mahasiswa ke-"+(i+1));
            nilaiMahasiswa[i]=sc.nextInt();
            total+=nilaiMahasiswa[i];
        }
        rata=total/nilaiMahasiswa.length;
        System.out.println("Rata Rata Nilai Mahasiswa adalah=" + rata);


        int nilaitertinggi=0,nilaiterendah=100;

        for(int i=0;i<nilaiMahasiswa.length;i++){
            if (nilaiMahasiswa[i]>nilaitertinggi) {
                nilaitertinggi=nilaiMahasiswa[i];
            }

            if (nilaiMahasiswa[i]<nilaiterendah) {
                nilaiterendah=nilaiMahasiswa[i];
                
            }

            
        }
        System.out.println("Nilai Tertinggi Adalah=" +nilaitertinggi);
        System.out.println("Nilai Terendah Adalah=" +nilaiterendah);

        for(int i=0;i<nilaiMahasiswa.length;i++){
            System.out.println("Nilai Mahasiswa Ke-"+(i+1)+"="+nilaiMahasiswa[i]);
        }
    }

}
