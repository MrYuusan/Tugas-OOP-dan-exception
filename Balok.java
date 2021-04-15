
/**
 *
 * @author Yusuf Adi D
 */

public class Balok extends PersegiPanjang{
    double Luas, volume;
    @Override
    void hitung(){
        Persegi per = new Persegi();
        per.hitung();
        super.hitung();
        Luas = 2 * per.luas + 4 * super.luas;
        volume = per.sisi * super.panjang * super.lebar;
        System.out.println("Luas Permukaan Balok = " + Luas);
        System.out.println("Volume Balok = " + volume);
    }
}
