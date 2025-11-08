import java.util.Scanner;
public class SearchNilai27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
         System.out.print("Masukkan Banyaknya nilai yang akan diinput: ");
        int banyakNilai = sc.nextInt();
        int[] arrNilai = new int [banyakNilai];
        for(int i=0;i<banyakNilai;i++){
            System.out.println("Masukkan Nilai Mahasiswa ke-"+(i+1));
            arrNilai[i]=sc.nextInt();
        }
        System.out.println("Masukkan Nilai Yang Ingin Dicari:");
        int key = sc.nextInt();
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
            
        }
        if (hasil!=0) {
             System.out.println("Nilai " + key + " Ditemukan di  Indeks"+ " " + (hasil+1));
        }else{
            System.out.println("Nilai Tidak Ditemukan");
        }
       
        
    }
}
    

