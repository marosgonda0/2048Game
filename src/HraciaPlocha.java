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

    public CisloStvorek getPolicko(int i, int j) {
        return this.cisloStvorcek[i][j];
    }

    public void setPolicko(int i, int j, Policka stav) {
        this.cisloStvorcek[i][j].zmenStav(stav);
    }

    public void posun(Smer smer) {
                //  for(int i = 0; i < getHraciaPlocha().length; i++) {
                //     for(int j = 0; j < getHraciaPlocha().length; j++) {
                //         if(this.cisloStvorcek[i][j].getStav() != Policka.CISLO_PRAZDNE) {
                //             if(this.cisloStvorcek[i + Smer.HORE.getX()][j + Smer.HORE.getY()].getStav() == Policka.CISLO_PRAZDNE) {
                //                 this.cisloStvorcek[i + Smer.HORE.getX()][j + Smer.HORE.getY()].zmenStav(this.cisloStvorcek[i][j].getStav());
                //                 this.cisloStvorcek[i][j].zmenStav(Policka.CISLO_PRAZDNE);
                //             }
                //             posun(Smer.HORE);
                //         }
                        
                //     }
                //  }
            
        }
    }
}