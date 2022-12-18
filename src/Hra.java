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
        this.hraciaPlocha.setPolicko(this.random.nextInt(4), this.random.nextInt(4), Policka.CISLO2);
        this.hraciaPlocha.setPolicko(this.random.nextInt(4), this.random.nextInt(4), Policka.CISLO2);
        this.manazer.spravujObjekt(this);
    }

    public void posunHore() {
        this.hraciaPlocha.posun(Smer.HORE);
    }

    public void posunDole() {
        this.hraciaPlocha.posun(Smer.DOLE);
    }

    public void posunVlavo() {
        this.hraciaPlocha.posun(Smer.VLAVO);
    }

    public void posunVpravo() {
        this.hraciaPlocha.posun(Smer.VPRAVO);
    }
}
