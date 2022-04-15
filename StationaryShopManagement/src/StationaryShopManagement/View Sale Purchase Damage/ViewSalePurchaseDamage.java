//Tasyrika Nurul Hajar - 1302201131
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.sale.purchase.damage;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ViewSalePurchaseDamage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sale<String> pilihproduk = new Sale<>();
        System.out.print("Pilih Produk: ");
        
        Sale<String> salequantity = new Sale<>();
        System.out.print("Sale Quantity: ");
        
        Sale<String> totalbillamount = new Sale<>();
        System.out.print("Total Bill Amount: ");
        
       
        Purchase<String> namaproduk = new Purchase<>();
        System.out.print("Nama Produk: ");

        Purchase<String> jumlahpembelian = new Purchase<>();
        System.out.print("Jumlah Pembelian: ");
        
        Purchase<String> namavendor = new Purchase<>();
        System.out.print("Nama Vendor: ");
        
        Purchase<String> jumlahtagihantotal = new Purchase<>();
        System.out.print("Jumlah Tagihan Total: ");
        
        
        Damage<String> bukutulis = new Damage<>();
        System.out.println("Buku Tulis");
        
        Damage<String> penghapus = new Damage<>();
        System.out.println("Penghapus");
        
        Damage<String> pulpen = new Damage<>();
        System.out.println("Pulpen");
        
        Damage<String> penggaris = new Damage<>();
        System.out.println("Penggaris");
        
        Damage<String> pensilbuku = new Damage<>();
        System.out.println("Pensil Buku");
        
        Damage<String> spidol = new Damage<>();
        System.out.println("Spidol");
        
        Damage<String> stabilo = new Damage<>();
        System.out.println("Stabilo");
        
        
        
    }
    
}
