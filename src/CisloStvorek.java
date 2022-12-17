import fri.shapesge.Stvorec;
import fri.shapesge.Text;

public class CisloStvorek {
    private Stvorec stvorec;
    private Text text;

    public CisloStvorek(int x, int y, Policka polickoStav) {
        this.stvorec = new Stvorec(x, y);
        this.text = new Text(polickoStav.getCislo(), x + 60, y + 60);
        this.stvorec.zmenStranu(120);
        this.stvorec.zmenFarbu(polickoStav.getFarba());
        this.stvorec.zobraz();
    }
    
}
