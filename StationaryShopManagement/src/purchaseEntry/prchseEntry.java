/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchaseEntry;

/**
 *
 * @author akbar
 */
public class prchseEntry {
        public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("-----------Purchase----------");
        System.out.println("================================");
        // Scanner inputData = new Scanner(System.in);
        // System.out.print("Masukkan nama barang: ");
        // String str = inputData.nextLine();
        // listItem(Item);
        String item[] = {
                "Nama Produk", "Jumlah Pembelian", "Nama Vendor", "Jumlah Tagihan Total",
        };
        for (int i = 0; i <= item.length; i++) {
            System.out.println(item[i]);
        }
    }
}
