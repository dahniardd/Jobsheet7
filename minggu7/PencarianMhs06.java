package Tugas;

public class PencarianMhs06 {
    Mahasiswa06 listMhs[];
    int idx;

    void tambah(Mahasiswa06 m){
        if (idx<listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }
    void tampil(){
        for (Mahasiswa06 m : listMhs) {
            m.tampil();
            System.out.println("------------------------------");
        }
    }
    public int findBinarySearch(String cari, int i, int j) {
        int left = 0;
        int right = listMhs.length - 1;
        int count = 0; // Variabel untuk menghitung jumlah hasil yang ditemukan
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = listMhs[mid].nama.compareTo(cari);
    
            // Jika nama ditemukan di tengah
            if (cmp == 0) {
                // Cek apakah ada entri sebelum atau sesudah yang memiliki nama yang sama
                int temp = mid;
                while (temp >= left && listMhs[temp].nama.equals(cari)) {
                    count++;
                    temp--;
                }
                temp = mid + 1;
                while (temp <= right && listMhs[temp].nama.equals(cari)) {
                    count++;
                    temp++;
                }
                return count > 1 ? -2 : mid; // Jika lebih dari satu hasil, kembalikan -2
            }
            // Jika nama yang dicari lebih kecil, cari di sebelah kiri
            else if (cmp > 0) {
                right = mid - 1;
            }
            // Jika nama yang dicari lebih besar, cari di sebelah kanan
            else {
                left = mid + 1;
            }
        }
    
        // Jika nama tidak ditemukan
        return -1;
    }

    public void tampilPosisi(String nama, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + nama + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + nama + " tidak ditemukan");
        }
    }

    public void tampilData(String nama, int pos) {
        if (pos != -1) {
            System.out.println("Nama\t : " + nama);
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + nama + " tidak ditemukan");
        }
    }

}
