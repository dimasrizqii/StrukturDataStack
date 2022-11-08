public class Stack {
    int size;
    int top;
    StrukBelanja[] data;

    Stack(int size){
        this.size = size;
        data = new StrukBelanja[size];
        top = -1;
    }

    boolean IsEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }

    boolean IsFull(){
        if(top==size-1){
            return true;
        }else{
            return false;
        }
    }

    void push(StrukBelanja sb){
        if(!IsFull()){
            top++;
            data[top] = sb;
        }else{
            System.out.println("DATA SUDAH PENUH!!!!");
        }
    }

    void pop(){
        if(!IsEmpty()){
            StrukBelanja x = data[top];
            top--;
            System.out.println("-----------------------------Data yang keluar-----------------------------");
            System.out.println("Nomor Transaksi\t\t: " + x.nomorTransaksi);
            System.out.println("Tanggal Pembelian\t: " + x.tanggalPembelian);
            System.out.println("Jumlah Barang\t\t: " + x.jumlahBarang);
            System.out.println("Total Pembayaran\t:Rp " + x.totalHargaBayar);
        }else{
            System.out.println("STACK MASIH KOSONG!!!");
        }
    }

    void print(){
        System.out.println("Daftar Struk Belanja yang Tersimpan : ");
        for(int i=top;i>=0;i--){
            System.out.println("Nomor Transaksi\t\t: " + data[i].nomorTransaksi);
            System.out.println("Tanggal Pembelian\t: " + data[i].tanggalPembelian);
            System.out.println("Jumlah Barang\t\t: " + data[i].jumlahBarang);
            System.out.println("Total Pembayaran\t:Rp " + data[i].totalHargaBayar);
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}
