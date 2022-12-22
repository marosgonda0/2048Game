import fri.shapesge.FontStyle;
import fri.shapesge.Stvorec;
import fri.shapesge.Text;

public class CisloStvorek {
    private Stvorec stvorec;
    private Text text;
    private Policka polickoStav;

    public CisloStvorek(int x, int y, Policka polickoStav) {
        this.polickoStav = polickoStav;
        this.stvorec = new Stvorec(x, y);
        this.text = new Text(this.polickoStav.getCislo(), x + 45, y + 80);
        this.text.zmenFont("Arial", FontStyle.BOLD, 60);
        this.stvorec.zmenStranu(120);
        this.stvorec.zmenFarbu(this.polickoStav.getFarba());
        this.stvorec.zobraz();
        this.text.zobraz();
    }
    
    public void zmenStav(Policka polickoStav) {
        this.polickoStav = polickoStav;
        this.stvorec.zmenFarbu(polickoStav.getFarba());
        if(polickoStav.equals(Policka.CISLO16)) {
            this.text.posunVodorovne(-18);
            this.text.changeText(polickoStav.getCislo());
        } else {
            this.text.changeText(polickoStav.getCislo());
        }
        this.text.zmenFarbu(polickoStav.getFarbaText());
        this.stvorec.zobraz();
        this.text.zobraz();
    }

    public Policka getStav() {
        return this.polickoStav;
    }
}
