
/**
 *
 * @author Yusuf Adi D
 */
import java.util.Scanner;

public class PersegiPanjang {

    int panjang, lebar;
    double keliling, luas;
    Scanner in = new Scanner(System.in);

    void hitung() {
        try {
            System.out.print("Masukkan Panjang: ");
            panjang = in.nextInt();
            System.out.print("Masukkan Lebar: ");
            lebar = in.nextInt();
            keliling = 2 * (panjang + lebar);
            luas = panjang * lebar;
        } catch (Exception ex) {
            System.out.println("Bukan Angka. Mohon lakukan input ulang melalui menu!");
        } finally {
            System.out.println("Keliling Persegi Panjang = " + keliling);
            System.out.println("Luas Persegi Panjang = " + luas);
        }
    }
}
