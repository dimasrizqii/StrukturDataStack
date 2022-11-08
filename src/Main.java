import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Berapa Jumlah Struk yang ingin Anda Input?");
        System.out.print("Jawaban Anda : ");
        int jumlah = sc1.nextInt();
        Stack st = new Stack(jumlah);

        char pilih;

        do{
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Menu yang Tersedia : ");
            System.out.println("1. Input Struk");
            System.out.println("2. Ambil Struk Terbaru");
            System.out.print("Pilihan Anda : ");
            int pilihan = sc1.nextInt();
            switch (pilihan) {
                case 1 -> {
                    System.out.println("================================Input Data================================");
                    do {
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.print("Nomor Transaksi\t\t: ");
                        sc1.nextLine();
                        String nomorTransaksi = sc1.nextLine();
                        System.out.print("Tanggal Pembelian\t: ");
                        String tanggalPembelian = sc1.nextLine();
                        System.out.print("Jumlah Barang\t\t: ");
                        int jumlahBarang = sc1.nextInt();
                        System.out.print("Total Pembayaran\t:Rp");
                        int totalBayar = sc1.nextInt();
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("Apakah Anda akan menambahkan Struk lagi?(Y/n)");
                        System.out.print("Jawaban Anda : ");
                        pilih = sc1.next().charAt(0);
                        StrukBelanja nomor2 = new StrukBelanja(nomorTransaksi, tanggalPembelian, jumlahBarang, totalBayar);
                        st.push(nomor2);
                    } while (pilih == 'y');
                    System.out.println("--------------------------------------------------------------------------");
                }
                case 2 -> {
                    System.out.println("===========================Ambil Struk Terbaru============================");
                    st.pop();
                    System.out.println("--------------------------------------------------------------------------");
                }
                default -> System.out.println("NOMOR YANG ANDA MASUKKAN SALAH");
            }
            System.out.println();
            System.out.println("Apakah Anda Ingin Memilih Lagi?(y/n)");
            System.out.print("Jawaban Anda : ");
            pilih = sc1.next().charAt(0);
        }while(pilih == 'y');

        System.out.println("================================TERIMAKASIH===============================");

    }
}
