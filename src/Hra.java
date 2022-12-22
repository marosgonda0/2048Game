import java.util.Random;
import fri.shapesge.Manazer;

public class Hra {
    private HraciaPlocha hraciaPlocha;
    private Random random;
    private Manazer manazer;

    public Hra() {
        this.hraciaPlocha = new HraciaPlocha(10, 10);
        this.random = new Random();
        this.manazer = new Manazer();
        this.hraciaPlocha.pridajNahodnePolicko();
        this.hraciaPlocha.pridajNahodnePolicko();
        this.manazer.spravujObjekt(this);
    }

    public void posunHore() {
        this.hraciaPlocha.posun(Smer.HORE);
        this.hraciaPlocha.pridajNahodnePolicko();
    }

    public void posunDole() {
        this.hraciaPlocha.posun(Smer.DOLE);
        this.hraciaPlocha.pridajNahodnePolicko();
    }

    public void posunVlavo() {
        this.hraciaPlocha.posun(Smer.VLAVO);
        this.hraciaPlocha.pridajNahodnePolicko();
    }

    public void posunVpravo() {
        this.hraciaPlocha.posun(Smer.VPRAVO);
        this.hraciaPlocha.pridajNahodnePolicko();
    }
}
