import java.util.Scanner;
public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;
        String [][] penonton = new String [4][2];

        while (true) {
            System.out.println("=================MENU================== ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

        switch (pilihan) {
            case 1:
                int baris, kolom;
                String nama, next;
                do {
                    System.out.print("Masukan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.println("masukan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.println("masukan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris >=1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris-1][kolom-1] ==null) {
                                penonton[baris-1][kolom-1] = nama;
                                System.out.println("Data penonton berhasil ditambahkan");
                                break;   
                            }else{
                                System.out.println("Kursi pada baris " + baris + " kolom " + kolom + " sudah terisi oleh "
                                 + penonton[baris-1][kolom-1]);
                                System.out.println("Silahkan pilih kursi lain");
                            }
                            
                        } else {
                            System.out.println("Posisi kolom atau baris tidak valid. Silahkan masukan dengan benar");

                        
                            

                        }
                    }
                    System.out.println("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                } while (next.equalsIgnoreCase("y"));
                break;

            case 2:
                System.out.println("===========Daftar penonton============");
                for(int i=0; i<penonton.length; i++){
                    System.out.println("penonton pada baris ke- " +(i+1) + ": ");
                    String[] row = penonton[i];
                    for(int j=0; j< row.length; j++){
                        if (row[j]==null) {
                            row[j]="***";
                        }
                    }
                    System.out.println(String.join(", " , row));
                }
                break;
            
            case 3:
                System.out.println("keluar dari program");
                sc.close();
                System.exit(0);
                break;
            default:
            System.out.println("pilihan tidak valid. silahkan pilih menu 1, 2, atau 3");


            }
        }
    }
}