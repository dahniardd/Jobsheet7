package minggu7;
import java.util.Scanner;

public class MahasiswaMain06 {
    public static void main (String[]args) {
        try (Scanner s = new Scanner(System.in)) {
            try (Scanner sl = new Scanner(System.in)) {
                PencarianMhs06 data = new PencarianMhs06();
                int jumMhs = 5;

                System.out.println("------------------------------------");
                System.out.println("Masukkan data mahasiswa secara urut dari Nim Terkecil : ");
                for(int i = 0; i < jumMhs; i++){
                    System.out.println("------------------------");
                    System.out.println("Nim\t: ");
                    int nim = s.nextInt();
                    System.out.println("Nama\t: ");
                    String nama = sl.nextLine();
                    System.out.println("Umur\t: ");
                    int umur = s.nextInt();
                    System.out.println("IPK\t: ");
                    double ipk = s.nextDouble();

                    Mahasiswa06 m = new Mahasiswa06(nim, nama, umur, ipk);
                    data.tambah(m);
                }

                System.out.println("-----------------------------");
                System.out.println("Data keseluruhan Mahasiswa : ");
                data.tampil();
                
                System.out.println("-----------------------------");
                System.out.println("-----------------------------");
                System.out.println("Pencarian Data : ");
                System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
                System.out.println("NIM : ");
                int cari = s.nextInt();
                System.out.println("Menggunakan sequential Search : ");
                int posisi = data.FindSeqSearch(cari);

                data.Tampilposisi(cari, posisi);
                data.TampilData(cari, posisi);
            }
        }
    }
} 