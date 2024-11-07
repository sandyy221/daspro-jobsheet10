import java.util.Scanner;
public class SIAKAD27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        System.out.print("Masukan jumlah mata kuliah: ");
        int jumlahMtkul = sc.nextInt();
        int [][] nilai = new int[jumlahMhs][jumlahMtkul];

        for (int i=0; i<jumlahMhs; i++){
            System.out.println("Input nilai Mahasiswa ke- " + (i+1));
            double totalPerSiswa = 0;

            for (int j=0; j<jumlahMtkul; j++){
                System.out.print("Nilai mata kuliah " + (j+1)+ ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata rata: " + totalPerSiswa/jumlahMtkul);
        }
        System.out.println("\n========================================");
        System.out.println("Rata rata Nilai Setiap Mata Kuliah");

        for (int j=0; j<jumlahMtkul; j++){
            double totalPerMatkul = 0;

            for(int i=0; i<jumlahMhs; i++){
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j+1) + ": " + totalPerMatkul/jumlahMhs);
        }
    }
}
