
/**
 *
 * @author Yusuf Adi D
 */
import java.util.Scanner;

public class Segitiga {

    int alas, tinggi;
    double miring, keliling, luas;
    Scanner in = new Scanner(System.in);

    void hitung() {
        try {
            System.out.print("Masukkan Alas: ");
            alas = in.nextInt();
            System.out.print("Masukkan Tinggi: ");
            tinggi = in.nextInt();
            miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
            keliling = alas + tinggi + miring;
            luas = (alas * tinggi) / 2;
        } catch (Exception ex) {
            System.out.println("Bukan Angka. Mohon lakukan input ulang melalui menu!");
        } finally {
            System.out.println("Keliling Segitiga = " + keliling);
            System.out.println("Luas Segitiga = " + luas);
        }
    }

}
