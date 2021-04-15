
/**
 *
 * @author Yusuf Adi D
 */

public class Kubus extends Persegi{
    double volume, Luas;

    @Override
    void hitung() {
        super.hitung();
        Luas = 6 * super.luas;
        volume = Math.pow(super.sisi, 3);
        System.out.println("Luas Permukaan Kubus = " + Luas);
        System.out.println("Volume Kubus = " + volume);
    }
}
