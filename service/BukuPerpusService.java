package service;

import java.util.LinkedList;
import java.util.List;

import model.Buku;

public class BukuPerpusService {

    private static List<Buku> data = new LinkedList<>();

    public void addData(Buku bukuperpus) {
        data.add(bukuperpus);
        System.out.println("|------------- Data telah tersimpan -------------");
    }

    public void updateData(Buku bukuperpus) {
        int result = data.indexOf(bukuperpus);
        
        if(result >= 0) {
            data.set(result, bukuperpus);
            System.out.println("|-------------- Data telah diubah ---------------");
        } else {
            System.out.println("|---- Data yang ingin diubah tidak ditemukan ----");
        }
    }

    public void deleteData(Buku bukuperpus) {
        int result = data.indexOf(bukuperpus);

        if(result >= 0) {
            data.remove(result);
            System.out.println("|-------------- Data telah terhapus ------------");
        } else {
            System.out.println("|------ Data yang ingin dihapus tidak ada ------");
        }
    }

    public List<Buku> getAllData() {
        return data;
    }

}