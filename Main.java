
/**
 *
 * @author Yusuf Adi D
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char lagi;
        do {
            
            System.out.println("Menu");
            System.out.print("1.Persegi\n"
                    + "2.Lingkaran\n"
                    + "3.Persegi Panjang\n"
                    + "4.Segitiga\n"
                    + "5.Kubus\n"
                    + "6.Silinder\n"
                    + "7.Balok\n"
                    + "0.Keluar\n"
            );
            System.out.print("Pilih: ");
            int pilih = in.nextInt();
            switch (pilih) {
                case 1: {
                    System.out.println("=====Persegi======");
                    Persegi per = new Persegi();
                    per.hitung();
                }
                break;
                case 2: {
                    System.out.println("=====Lingkaran=====");
                    Lingkaran ling = new Lingkaran();
                    ling.hitung();
                }
                break;
                case 3: {
                    System.out.println("=====Persegi Panjang=====");
                    PersegiPanjang perpan = new PersegiPanjang();
                    perpan.hitung();
                }
                break;
                case 4: {
                    System.out.println("=====Segitiga Siku-Siku=====");
                    Segitiga seg3 = new Segitiga();
                    seg3.hitung();
                }
                break;
                case 5: {
                    System.out.println("=====Kubus=====");
                    Kubus cube = new Kubus();
                    cube.hitung();
                }
                break;
                case 6: {
                    System.out.println("=====Silinder=====");
                    Silinder sln = new Silinder();
                    sln.hitung();
                }
                break;
                case 7: {
                    System.out.println("=====Balok=====");
                    Balok blk = new Balok();
                    blk.hitung();
                }
                break;
                case 0: {
                    System.out.println("Anda telah keluar....");
                    System.exit(0);
                }
                break;
                default:
                    System.err.println("Pilihan yang Anda pilih salah....");
                    System.exit(0);
            }
            System.out.print("Kembali ke Menu? (y atau n) : ");
            lagi = in.next().charAt(0);
        } while (lagi == 'y' || lagi == 'Y');
    }
}
