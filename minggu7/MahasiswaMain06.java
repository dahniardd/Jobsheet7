package Tugas;
import java.util.Scanner;
public class MahasiswaMain06 {
     public static void main(String[] args, int i) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs06 data = new PencarianMhs06();
        System.out.print("Masukkan jumlah data Mahasiswa : ");
        int jmlMhs = s.nextInt();
        Mahasiswa06[] inputan = new Mahasiswa06[jmlMhs];
        data.listMhs = inputan;

        System.out.println("--------------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari nim terkecil : ");
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("-----------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa06 m = new Mahasiswa06(nim, nama, umur, ipk);
            data.tambah(m);

        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("data keseluruhan mahasiswa: ");
        data.tampil();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Pencarian data: ");
        System.out.println("Masukan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama: ");
        String cariNama = sl.nextLine();

        System.out.println("================================");
        System.out.println("Menggunakan binary search");
        int posisi = data.findBinarySearch(cariNama, 0, jmlMhs - 1);

        data.tampilPosisi(cariNama, posisi);
        data.tampilData(cariNama, posisi);
        
        System.out.println("================================");
        System.out.println("Menggunakan binary search");
        int posisi = data.findBinarySearch(cariNama, 0, jmlMhs - 1);
        
        if (posisi == -2) {
            System.out.println("Pencarian menghasilkan lebih dari satu hasil.");
        } else if (posisi != -1) {
            data.tampilPosisi(cariNama, posisi);
            data.tampilData(cariNama, posisi);
        } else {
            System.out.println("Data " + cariNama + " tidak ditemukan");
        }
    }
}

