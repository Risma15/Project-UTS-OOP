import java.util.LinkedList;
import java.util.Scanner;
import model.*;
import service.*;

public class Aplikasi {

    private static Scanner scanner;
    private static BukuPerpusService service;

    public static void main(String args[]) {
        int opsi = 0;
        scanner = new Scanner(System.in);
        service = new BukuPerpusService();

        do {
            cetakMenu();
            opsi = scanner.nextInt();
            switch(opsi) {
                case 1 :
                  modulAdd();
                  break;
                case 2 :
                  ubahData(); break;
                case 3 :
                  hapusData(); break;
                case 4 :
                  tampilData();
                  break;
            }
        } while(opsi != 0);

    }

    private static void cetakMenu() {
        System.out.println("\n\n");
        System.out.println("|-------------------------------------------|");
        System.out.println("|----- APLIKASI DATA BUKU PERPUSTAKAAN -----|");
        System.out.println("| 1. Tambah Data                            |");
        System.out.println("| 2. Ubah Data                              |");
        System.out.println("| 3. Hapus Data                             |");
        System.out.println("| 4. Tampilkan data                         |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| 0. KELUAR                                 |");
        System.out.println("|-------------------------------------------|");
        System.out.println("\n");
        System.out.print(" Pilihan > ");
    }

    private static void modulAdd() {
        String kdbuku, jdlbuku, nmpgrg, pnrbit, thntrbt;
    
        System.out.println("|------------------ Tambah Data ----------------");
        System.out.println("|-----------------------------------------------");
        System.out.print("| Kode Buku       : "); 
        scanner = new Scanner(System.in);
        kdbuku = scanner.nextLine();
        System.out.print("| Judul Buku      : ");
        jdlbuku = scanner.nextLine();
        System.out.print("| Nama Pengarang  : ");
        nmpgrg = scanner.nextLine();
        System.out.print("| Penerbit        : ");
        pnrbit = scanner.nextLine();
        System.out.print("| Tahun Terbit    : ");
        thntrbt = scanner.nextLine();
        System.out.println("|------------------------------------------------");
        service.addData(new Buku(kdbuku, jdlbuku, nmpgrg, pnrbit, thntrbt));
        System.out.println("|------------------------------------------------");
    }

    private static void tampilData() {
        LinkedList<Buku> result = (LinkedList<Buku>) service.getAllData();

        int i=1;
        for(Buku bukuperpus : result) {
            
            System.out.println("|------------------ Tampil Data ----------------");
            System.out.println("|-----------------------------------------------");
            System.out.println("| Data ke-" + i++);
            System.out.println("|  Kode Buku: " + bukuperpus.getKdbuku());
            System.out.println("|  Judul Buku: " + bukuperpus.getJdlbuku());
            System.out.println("|  Nama Pengarang: " + bukuperpus.getNmpgrg());
            System.out.println("|  Penerbit: " + bukuperpus.getPnrbit());
            System.out.println("|  Tahun Terbit: " + bukuperpus.getThntrbt());
            System.out.println("|-----------------------------------------------");
        }
    }

    private static void ubahData() {
        String kdbuku, jdlbuku, nmpgrg, pnrbit, thntrbt;

        System.out.println("|---------------- Perubahan Data ---------------");
        System.out.println("|-----------------------------------------------");
        System.out.print("| Kode Buku       : "); 
        scanner = new Scanner(System.in);
        kdbuku = scanner.nextLine();
        System.out.print("| Judul Buku      : ");
        jdlbuku = scanner.nextLine();
        System.out.print("| Nama Pengarang  : ");
        nmpgrg = scanner.nextLine();
        System.out.print("| Penerbit        : ");
        pnrbit = scanner.nextLine();
        System.out.print("| Tahun Terbit    : ");
        thntrbt = scanner.nextLine();
        System.out.println("|------------------------------------------------");
        service.updateData(new Buku(kdbuku, jdlbuku, nmpgrg, pnrbit, thntrbt));
        System.out.println("|------------------------------------------------");
    }

    private static void hapusData() {
        String kdbuku;

        System.out.println("|------------------ Hapus Data -----------------");
        System.out.println("|-----------------------------------------------");
        System.out.print("| Kode Buku       : "); 
        scanner = new Scanner(System.in);
        kdbuku = scanner.nextLine();
        System.out.println("|-----------------------------------------------");
        service.deleteData(new Buku(kdbuku, null, null, null, null));
        System.out.println("|-----------------------------------------------");
    }

}