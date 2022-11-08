public class StrukBelanja {
    String nomorTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    long totalHargaBayar;

    StrukBelanja(String nt,String tp,int jb,long thb){
        nomorTransaksi = nt;
        tanggalPembelian = tp;
        jumlahBarang = jb;
        totalHargaBayar = thb;
    }
}
