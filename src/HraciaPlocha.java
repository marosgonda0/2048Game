public class HraciaPlocha {
    private CisloStvorek[][] cisloStvorcek;

    public HraciaPlocha(int x, int y) {
        this.cisloStvorcek = new CisloStvorek[4][4];

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                this.cisloStvorcek[i][j] = new CisloStvorek(i * 135 + x , j * 135 + y, Policka.CISLO_PRAZDNE);
            }
        }
    }

    public CisloStvorek[][] getHraciaPlocha() {
        return this.cisloStvorcek;
    }
}