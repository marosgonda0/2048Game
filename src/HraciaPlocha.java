import java.util.ArrayList;
import java.util.Random;

public class HraciaPlocha {
    private CisloStvorek[][] cisloStvorcek;
    private ArrayList<PoziciaStav> poziciaCisel;
    private Random random;

    public HraciaPlocha(int x, int y) {
        this.cisloStvorcek = new CisloStvorek[4][4];
        this.poziciaCisel = new ArrayList<PoziciaStav>();
        this.random = new Random();

        for(int i = 0; i < getHraciaPlocha().length; i++) {
            for(int j = 0; j < getHraciaPlocha().length; j++) {
                this.cisloStvorcek[i][j] = new CisloStvorek(i * 135 + x , j * 135 + y, Policka.CISLO_PRAZDNE);
            }
        }
    }

    public CisloStvorek[][] getHraciaPlocha() {
        return this.cisloStvorcek;
    }

    public CisloStvorek getPolicko(int i, int j) {
        return this.cisloStvorcek[i][j];
    }

    public void setPolicko(int i, int j, Policka stav) {
        this.cisloStvorcek[i][j].zmenStav(stav);
    }

    public Policka spojPolicka(Policka policko) {
        switch(policko) {
            case CISLO2:
                return Policka.CISLO4;
            case CISLO4:
                return Policka.CISLO8;
            case CISLO8:
                return Policka.CISLO16;
            default:
                return Policka.CISLO_PRAZDNE;
        }
    }

    public void posun(Smer smer) {
        int index = 0;

        for(PoziciaStav p : this.poziciaCisel) {
            this.cisloStvorcek[p.getStlpec() + smer.getY()][p.getRiadok() + smer.getX()].zmenStav(p.getStav());
            this.cisloStvorcek[p.getStlpec()][p.getRiadok()].zmenStav(Policka.CISLO_PRAZDNE);
        }

        this.poziciaCisel.removeAll(poziciaCisel);

        for(int stlpec = 0; stlpec < getHraciaPlocha().length; stlpec++) {
            for(int riadok = 0; riadok < getHraciaPlocha().length; riadok++) {
                if(this.cisloStvorcek[stlpec][riadok].getStav() != Policka.CISLO_PRAZDNE) {
                    if(stlpec + smer.getY() <= 3 &&
                    riadok + smer.getX() <= 3 &&
                    stlpec + smer.getY() >= 0 &&
                    riadok + smer.getX() >= 0
                    ) {
                        if(this.cisloStvorcek[stlpec + smer.getY()][riadok + smer.getX()].getStav() == Policka.CISLO_PRAZDNE) {
                            this.poziciaCisel.add(index++, new PoziciaStav(stlpec, riadok, this.cisloStvorcek[stlpec][riadok].getStav()));
                            posun(smer);
                        } else if(this.cisloStvorcek[stlpec + smer.getY()][riadok + smer.getX()].getStav() == this.cisloStvorcek[stlpec][riadok].getStav()) {
                            this.poziciaCisel.add(index++, new PoziciaStav(stlpec, riadok, spojPolicka(this.cisloStvorcek[stlpec][riadok].getStav())));
                            posun(smer);
                        }
                    }
                }
            }
        }
    }

    public void pridajNahodnePolicko() {
        int cislo1 = this.random.nextInt(4);
        int cislo2 = this.random.nextInt(4);
            if(this.cisloStvorcek[cislo1][cislo2].getStav() == Policka.CISLO_PRAZDNE) {
                this.cisloStvorcek[cislo1][cislo2].zmenStav(Policka.CISLO2);
            } else {
                pridajNahodnePolicko();
            }
    }
}