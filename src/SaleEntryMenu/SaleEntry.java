package SaleEntryMenu;
import java.util.Scanner; // Library yang digunakan
public class SaleEntry {
    double TotalBillAmount, Price, Payment, Change; // variable
    int pilihProduk, SaleQuantity;                  // variable
    
    double hitungTotalBillAmount(int SLqn){ //method menghitung total bill
        SaleQuantity = SLqn;
        switch(pilihProduk){
            case 0:
                System.exit(0);
                break;
            case 1:
                Price = 2000;
                TotalBillAmount = TotalBillAmount+(Price*SLqn);
                break;
            case 2:
                Price = 5000;
                TotalBillAmount = TotalBillAmount+(Price*SLqn);
                break;
            case 3:
                Price = 8000;
                TotalBillAmount = TotalBillAmount+(Price*SLqn);
                break;
            case 4:
                Price = 6000;
                TotalBillAmount = TotalBillAmount+(Price*SLqn);
                break;
            case 5:
                Price = 1000;
                TotalBillAmount = TotalBillAmount+(Price*SLqn);
                break;
            case 6:
                Price = 4000;
                TotalBillAmount = TotalBillAmount+(Price*SLqn);
                break;
            case 7:
                Price = 3000;
                TotalBillAmount = TotalBillAmount+(Price*SLqn);
                break;
            case 8:
                Price = 5000;
                TotalBillAmount = TotalBillAmount+(Price*SLqn);
                break;
            case 9:
                Price = 2000;
                TotalBillAmount = TotalBillAmount+(Price*SLqn);
                break;
            case 10:
                Price = 3000;
                TotalBillAmount = TotalBillAmount+(Price*SLqn);
                break;
            case 11:
                break;
            default: //kondisi ketika inputan yang dimasukan salah
                throw new IllegalArgumentException("ERROR: Input yang Anda Masukkan Salah !!!");
        }
        return TotalBillAmount;
    }
    
    void viewTotalBillAmount(){ //untuk menginputkan total bill
        System.out.println("========BILL AMOUNT=========");
        System.out.println("TotalBillAmount: Rp." + TotalBillAmount);
    }
    
    double hitungChange(double pymnt){ // untuk menghitung kembalian
        Payment = pymnt;
        Change = pymnt-TotalBillAmount;
        return Change;
    }
    
    void viewChange(){ // untuk mengoutputkan kembalian
        System.out.println("Change: Rp." + Change);
        System.out.println("========THANK YOU=========");
    }
    public static void main (String[] args) { //main method program 
        Scanner input = new Scanner(System.in);
        SaleEntry in = new SaleEntry();
        System.out.println("=================");
        System.out.println("StationaryShopYPR");
        do{ // menggunakan while do untuk mengoutputkan 
            System.out.println("=================");
            System.out.println("BARANG BARANG");
            System.out.println("1. Penghapus (Rp.2000)");
            System.out.println("2. Penggaris (Rp.5000");
            System.out.println("3. Buku Tulis (Rp.8000)");
            System.out.println("4. CorrectionTape (Rp.6000)");
            System.out.println("5. Sampul Buku (Rp.1000)");
            System.out.println("6. Pulpen (Rp.4000)");
            System.out.println("7. Buku Gambar (Rp.3000)");
            System.out.println("8. Kertas Folio/5pcs (Rp.5000)");
            System.out.println("9. Kertas HVS (Rp.2000)");
            System.out.println("10. Rautan Pensil (Rp.3000)");
            System.out.println("\n11. Selesai dan Hitung Payment" );
            System.out.println("0. Keluar Program");
            System.out.println("==================");
            System.out.print("Masukkan Pilihan:   ");
            in.pilihProduk = input.nextInt();
            if(in.pilihProduk >=1 && in.pilihProduk <=10){
                System.out.print("Masukkan SaleQuantity: ");
                in.SaleQuantity = input.nextInt();
            }
            in.hitungTotalBillAmount(in.SaleQuantity);
        }while(in.pilihProduk !=11);
        in.viewTotalBillAmount();
        System.out.print("Payment: Rp.");
        in.Payment = input.nextDouble();
        in.hitungChange(in.Payment);
        in.viewChange();
    }
}
