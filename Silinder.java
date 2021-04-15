
/**
 *
 * @author Yusuf Adi D
 */
import java.util.Scanner;

public class Silinder extends Lingkaran {

    int tinggi;
    double Luas, volume;
    Scanner scan = new Scanner(System.in);

    @Override
    void hitung() {
        try {
            System.out.print("Masukkan Tinggi:  ");
            tinggi = scan.nextInt();
            super.hitung();
            Luas = 2 * super.luas + 2 * Lingkaran.PI * super.jarijari * tinggi;
            volume = super.luas * tinggi;
        } catch (Exception ex) {
            System.out.println("Bukan Angka. Mohon lakukan input ulang melalui menu!");
        } finally {
            System.out.println("Luas Permukaan Silinder = " + Luas);
            System.out.println("Volume Silinder = " + volume);
        }
    }
}
