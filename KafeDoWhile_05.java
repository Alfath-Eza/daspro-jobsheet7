import java.util.Scanner;

public class KafeDoWhile_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi= 12000,teh= 7000,roti= 20000;
        int totalHarga;

        do {
                System.out.print("masukkan nama pelanggan (ketik 'batal' untuk keluar) = ");
                String nama = sc.next();

                if (nama.equalsIgnoreCase("batal")) {
                    System.out.print("transaksi dibatalkan");
                    break;
                }
                System.out.print("jumlah kopi = ");
                int jmlKopi = sc.nextInt();
                System.out.print("jumlah teh = ");
                int jmlTeh = sc.nextInt();
                System.out.print("jumalah roti = ");
                int jmlRoti = sc.nextInt();

                totalHarga= (jmlKopi*kopi) - (jmlTeh*teh) + (jmlRoti * roti); 
                System.out.println("total harga yang harus dibayar Rp" + totalHarga);
                sc.nextLine();
        } while (true);
        System.out.println("semua transaksi selesai.");
    
}
}
