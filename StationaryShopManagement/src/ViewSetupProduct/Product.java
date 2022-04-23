//Ahmad Naufal 1302204085
package ViewSetupProduct;

import java.util.Scanner;

public class Product {
  public String kode_produk;
  public String nama_produk;
  public String vendor;
  public String quantity;
  public double harga;
  public static Product addInformation() {
    Product product = new Product();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.printf("Kode Kategori Produk : ");
      product.kode_produk = scanner.nextLine().toUpperCase().trim();

      if (product.kode_produk.isEmpty()) {
        Helper.printErrorMessage("Kode Produk Tidak Boleh Kosong!");
        continue;
      }
      
      System.out.printf("Nama Kategori Produk : ");
      product.nama_produk = scanner.nextLine().trim();

      if (product.kode_produk.isEmpty()) {
        Helper.printErrorMessage("Nama Kategori Produk Tidak Boleh Kosong!");
        continue;
      }

      System.out.printf("Vendor : ");
      product.vendor = scanner.nextLine().trim();

      if (product.vendor.isEmpty()) {
        Helper.printErrorMessage("Nama Vendor Tidak Boleh Kosong!");
        continue;
      }

      System.out.printf("Quantity : ");
      product.quantity = scanner.nextLine().trim();

      if (product.quantity.isEmpty()) {
        Helper.printErrorMessage("Quantity Tidak Boleh Kosong!");
        continue;
      }

      System.out.printf("Harga Produk : ");

      try {
        product.harga = Double.parseDouble(scanner.nextLine().trim());
      } catch (NumberFormatException e) {
        Helper.printErrorMessage("Harga Harus Angka!");
        continue;
      }

      if (product.harga < 0) {
        Helper.printErrorMessage("Harga Tidak Boleh Negatif!");
        continue;
      }

      System.out.println();
      System.out.println("Setup Barang Berhasil.");
      System.out.println();

      return product;
    }
  }
  
  public void displayInformation() {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Kode Produk : ");
    input.nextLine();
    System.out.printf("Nama Kategori Produk : %s%n", this.nama_produk);
    System.out.printf("Quantity : %s%n", this.quantity);
  }
}
