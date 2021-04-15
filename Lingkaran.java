
/**
 *
 * @author Yusuf Adi D
 */
import java.util.Scanner;

public class Lingkaran {

    static final double PI = 3.14;
    int jarijari;
    double keliling, luas;
    Scanner in = new Scanner(System.in);

    void hitung() {
        try {
            System.out.print("Masukkan Jari-Jari: ");
            jarijari = in.nextInt();
            keliling = 2 * PI * jarijari;
            luas = PI * Math.pow(jarijari, 2);
        } catch (Exception ex) {
            System.out.println("Bukan Angka. Mohon lakukan input ulang melalui menu!");
        } finally {
            System.out.println("Keliling Lingkaran= " + keliling);
            System.out.println("Luas Lingkaran= " + luas);
        }
    }
}
