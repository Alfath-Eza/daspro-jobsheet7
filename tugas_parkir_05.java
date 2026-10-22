import java.util.Scanner;

public class tugas_parkir_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis,durasi,total = 0,kendaraan = 0;
        System.out.print("apakah anda ingin parkir? (iya/tidak) = ");
        String parkir = sc.next();
        int motor = 2000;
        int mobil = 3000;
        int totalperPembayaranParkir = 0;
        
        while (parkir.equalsIgnoreCase("iya")) {
        System.out.println("masukkan jenis kendaraan = ");
        System.out.println("ketik 1 untuk kendaraan mobil ");
        System.out.println("ketik 2 untuk kendaraan motor");
        System.out.println("ketik 0 untuk keluar");
        System.out.print("=");
        jenis = sc.nextInt();

        if (jenis == 1) {
            System.out.print("berapa lama anda parkir = ");
            durasi = sc.nextInt();
            totalperPembayaranParkir = durasi * mobil;
        }else if (jenis == 2) {
            System.out.print("berapa lama anda parkir = ");
            durasi = sc.nextInt();
            totalperPembayaranParkir = durasi * motor;
            
        }else if (jenis == 0) {
            System.out.println("terima kasih telah berkunjung");
        }
        total +=totalperPembayaranParkir;
        kendaraan++;
        System.out.println("biaya parkir anda = " + totalperPembayaranParkir);
        System.out.println("melanjutkan kendaraan selanjutnya");
        System.out.print("apakah anda ingin parkir? (iya/tidak) = ");
        parkir = sc.next();
        }
        System.out.println("====================================================================================");
        System.out.println("jumlah kendaraan yang parkir hari ini = "+ kendaraan);
        System.out.println("total pendapatan adalah = " + total + " , dari " +kendaraan + " kendaraan.");
    }
    
}
