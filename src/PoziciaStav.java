public class PoziciaStav {
    private int stlpec;
    private int riadok;
    private Policka stav;

    public PoziciaStav(int stlpec, int riadok, Policka stav) {
        this.stlpec = stlpec;
        this.riadok = riadok;
        this.stav = stav;
    }

    public int getStlpec() {
        return this.stlpec;
    }

    public int getRiadok() {
        return this.riadok;
    }

    public Policka getStav() {
        return this.stav;
    }
}
