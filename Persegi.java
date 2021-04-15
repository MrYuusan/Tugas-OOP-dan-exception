
/**
 *
 * @author Yusuf Adi D
 */
import java.util.Scanner;

public class Persegi {

    int sisi;
    double keliling, luas;
    Scanner in = new Scanner(System.in);

    void hitung() {
        try {
            System.out.print("Masukkan Sisi: ");
            sisi = in.nextInt();
            keliling = 4 * sisi;
            luas = sisi * sisi;
        } catch (Exception ex) {
            System.out.println("Bukan Angka. Mohon lakukan input ulang melalui menu!");
        } finally {
            System.out.println("Keliling Persegi = " + keliling);
            System.out.println("Luas Persegi = " + luas);
        }
    }
}
