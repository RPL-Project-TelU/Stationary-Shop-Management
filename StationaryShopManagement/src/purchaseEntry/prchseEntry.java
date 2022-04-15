package purchaseEntry;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class prchseEntry {

    public static void ReadJSON() {
        try {
            Object obj = new JSONParser().parse(new FileReader("D:\\Kuliah\\Semester 4\\Konstruksi Perangkat Lunak\\Stationary-Shop-Management\\StationaryShopManagement\\src\\purchaseEntry\\purchasedata.json"));
            JSONArray jsonarray = (JSONArray) obj;
            Iterator itr = jsonarray.iterator();
            System.out.println("Purchase");
            int i = 1;
            while (itr.hasNext()) {
                JSONObject atr = (JSONObject) itr.next();
                System.out.println("Nama Produk :"+atr.get("nama_produk"));
                System.out.println("Jumlah Pembelian :"+atr.get("jml_pembelian"));
                System.out.println("Harga :"+atr.get("harga"));
                System.out.println("Nama Vendor :"+atr.get("nama_vendor"));
                System.out.println("Jumlah Tagihan Total :"+atr.get("jml_total_tagihan"));
                i +=1;
            }

        } catch (FileNotFoundException FE) {
            System.out.println("File tidak ditemukan, periksa ulang path dari file json kembali!");
            FE.printStackTrace();
        } catch (IOException IE) {
            System.out.println("Error "+IE);
            IE.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Gagal parsing");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        prchseEntry.ReadJSON();
    }
}
