package perso;

public class perso {

    public int vida = 10;
    public int danomax = 3;
    public int lvl = 1;
    public int vidap;

    public int vidap(int danom) {
        this.vida = this.vida - danom;
        return this.vida;
    }


}


