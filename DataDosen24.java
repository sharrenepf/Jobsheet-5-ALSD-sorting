public class DataDosen24 {
    Dosen24[] dataDosen = new Dosen24[10];
    int idx = 0;

    public void tambah(Dosen24 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada Data Dosen.");
        } else {
            System.out.printf("\n%-10s %-15s %-15s %-5s\n", "Kode", "Nama", "Jenis Kelamin", "Usia");
            System.out.println("-----------------------------------------------------");
            for (int i = 0; i < idx; i++) {
                String jenisKelamin = dataDosen[i].jenisKelamin ? "Laki-laki" : "Perempuan";
                System.out.printf("%-10s %-15s %-15s %-5d\n",
                    dataDosen[i].kode, 
                    dataDosen[i].nama, 
                    jenisKelamin, 
                    dataDosen[i].usia
                );
            }
        }
    }
    

    public void sortingASC() { // bubble sort muda ke tua
        if (idx == 0) { 
            System.out.println("Belum ada Data Dosen.");
            return;
        }

        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen24 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan dari termuda ke tertua!");
    }

    public void sortingDSC() { // selection sort tua ke muda
        if (idx == 0) { 
            System.out.println("Belum ada Data Dosen.");
            return;
        }

        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen24 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data berhasil diurutkan dari tertua ke termuda!");
    }
}
