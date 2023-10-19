package perso;

public class mob {

    public int vida = 10;
    public int danomax = 3;
    public int lvl = 0;

    public int vidam(int danop) {
        this.vida = this.vida - danop;
        return this.vida;
    }

}



