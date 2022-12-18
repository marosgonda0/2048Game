public enum Policka {
    CISLO_PRAZDNE("", "farbaPrazdne", "textTmava"),
    CISLO2("2", "farba2", "textTmava"),
    CISLO4("4", "farba4", "textSvetla"),
    CISLO8("8", "farba8", "textSvetla"),
    CISLO16("16", "farba16", "textSvetla"),
    CISLO32("32", "farba32", "textSvetla"),
    CISLO64("64", "farba64", "textSvetla"),
    CISLO128("128", "farba128", "textSvetla"),
    CISLO256("256", "farba256", "textSvetla"),
    CISLO512("512", "farba512", "textSvetla"),
    CISLO1024("1024", "farba1024", "textSvetla"),
    CISLO2048("2048", "farba2048", "textSvetla");

    private String cislo;
    private String farba;
    private String farbaText;

    Policka(String cislo, String farba, String farbaText) {
        this.cislo = cislo;
        this.farba = farba;
        this.farbaText = farbaText;
    }

    public String getFarba() {
        return this.farba;
    }

    public String getCislo() {
        return this.cislo;
    }

    public String getFarbaText() {
        return this.farbaText;
    }
}
