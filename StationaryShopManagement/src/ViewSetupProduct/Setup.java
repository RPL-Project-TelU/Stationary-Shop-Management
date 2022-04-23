//Ahmad Naufal 1302204085
package ViewSetupProduct;
public class Setup {
    
    private enum daftarProduk 
    {
        penghapus,rautan_pensil,penggaris,pensil,bolpoin,
        buku,kotak_pensil,lem,tinta,tipe_x,stempel,kapur,
        stepler,penjepit,jangka,penjepit_kertas,alat_pelobang,
        buku_catatan,tas_sekolah,buku_gambar
    }
    
    public static String[] kodeProduk = {"ERA01","SHRP02","RLS03","PNCL04","PEN05",
        "BK06","PB07","GLE08","INK09","CRT10","STM11","CHK12","STP13","PNS14",
        "CMPS15","PK16","PNC17","NTBK18","BAG19","DRBK20"};
    
    public static String getKodeProduk(String namaPrdk) {
        try {            
            return Setup.kodeProduk[Setup.daftarProduk.valueOf(namaPrdk.toLowerCase()).ordinal()];
        } catch (Exception e) {
            return "NOT FOUND";
        }
    }
}
