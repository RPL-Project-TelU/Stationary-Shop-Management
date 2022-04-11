//Ahmad Naufal 1302204085
package ViewSetupProduct;
public class Setup {
    private static String SetupProduk(String Produk){
        switch (Produk) {
            case "penghapus":
                return "ERA01";
            case "rautan pensil":
                return "SHRP02";
            case "penggaris":
                return "RLS03";
            case "pensil":
                return "PNCL04";
            case "bolpoin":
                return "PEN05";
            case "buku":
                return "BK06";
            case "kotak pensil":
                return "PB07";
            case "lem":
                return "GLE08";
            case "tinta":
                return "INK09";
            case "tipe x":
                return "CRT10";
            case "stempel":
                return "STM11";
            case "kapur":
                return "CHK12";
            case "stepler":
                return "STP13";
            case "penjepit":
                return "PNS14";
            case "jangka":
                return "CMPS15";
            case "penjepit kertas":
                return "PK16";
            case "alat pelobang":
                return "PNC17";
            case "buku catatan":
                return "NTBK18";
            case "tas sekolah":
                return "BAG19";
            case "buku gambar":
                return "DRBK20";
            default:
                return "NULL";
        }
    }
    public static String getKodeProduk(String produk) {
        return SetupProduk(produk);
    }
}
