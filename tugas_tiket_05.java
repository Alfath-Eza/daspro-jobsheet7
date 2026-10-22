import java.util.Scanner;

public class tugas_tiket_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalPenjualan = 0;
        int tiketTerjual = 0;
        int tiket = 50000;
        double totalAkhir = 0;
        double diskon = 0;
        int transaksi = 0;
        int jmltiket = 0;
        

        System.out.print("apakah anda ingin membeli tiket ? (iya/tidak) = ");
        String beli = sc.next();;

        while (beli.equalsFoldCase("iya")) {
            System.out.print("berapa jumlah tiket yang anda ingin beli =  ");
             jmltiket = sc.nextInt();
             int totalAwal = jmltiket * tiket;
              if (jmltiket > 10) {
                 diskon = totalAwal * 0.15;
                totalAkhir = totalAwal - diskon;
                System.out.println("total biaya dari pembelian tiket anda Rp" + totalAkhir);


                
              }else if (jmltiket > 4 && jmltiket < 10 ) {
                diskon = totalAwal * 0.10;
                totalAkhir = totalAwal - diskon;
                System.out.println("total biaya dari pembelian tiket anda Rp" + totalAkhir);

                
                
              }else{
                System.out.println("total biaya dari pembelian tiket anda Rp" + totalAwal);
              }
              totalPenjualan += totalAkhir; 
              tiketTerjual += jmltiket;
              transaksi++;
              System.out.print("apakah anda ingin melanjutkan pembelian? (iya/tidak) =");
              beli = sc.next();

            
        }
        
        System.out.println("-----------------------------------------------");
        System.out.println("total transaksi hari ini = " + transaksi);
        System.out.println("jumlah tiket yang terjuaal = " + tiketTerjual);
        System.out.println("total pendapatan hari ini = " + totalPenjualan);
        
    }
}
