package perso;
import java.util.Random;
public class mobgeral {

    mob m1 = new mob();
    mob2 m2 = new mob2();
    mob3 m3 = new mob3();

    Random x = new Random();

    public int levelmob (int lvl){
        return x.nextInt(lvl);
    }
}
