//Ahmad Naufal 1302204085
package ViewSetupProduct;
import java.util.Scanner;
public class ViewSetup {
    public static void main(String[] args) {
        Product[] produk = new Product[10];
        while (true) {
      System.out.printf(
        "%s %s %s%n",
        Helper.repeatString(10, "*"),
        "Setup Produk dan View Stock",
        Helper.repeatString(10, "*")
      );
        int selection = 0;
        int produkCounter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Produk Menu:");
        System.out.println("1. Setup Produk");
        System.out.println("2. View Stock");
        System.out.println("3. Kode Kategori Produk");
        System.out.println("4. Exit");
        
        System.out.print("Masukkan Pilihan: ");
        
        try {
        selection = Integer.parseInt(scanner.nextLine());
      } catch (NumberFormatException e) {
        Helper.printErrorMessage("Pilihan harus berupa angka!");
        continue;
      }
        
      switch (selection) {
        case 1:
          produk[produkCounter] = Product.addInformation();

          produkCounter++;
          break;
        case 2:
          System.out.println();

          for (int i = 0; i < produk.length; i++) {
            if (i == 0 && produk[i] == null) {
              System.err.println("Belum ada Produk yang disetup.");
              System.err.println();
              break;
            }

            if (produk[i] == null) break;
            produk[i].displayInformation();
            System.out.println();
          }
          break;
        case 3:
          Scanner input = new Scanner(System.in);
          System.out.print("Masukkan Nama Kategori Produk : ");
          String prdk = input.nextLine();
          System.out.printf("Kode Produk : %s",Setup.getKodeProduk(prdk));
          System.out.println();
          break;
        case 4:
          System.out.println("Quitting...");
          System.exit(0);
          break;
        default:
          System.err.println("Pilihan tidak valid terdeteksi");
          System.err.println("Coba Kembali");
          System.err.println();

          break;
      }
     }
    }
}

