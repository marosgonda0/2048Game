public enum Policka {
    CISLO_PRAZDNE("", "farbaPrazdne"),
    CISLO2("2", "farba2"),
    CISLO4("4", "farba4"),
    CISLO8("8", "farba8"),
    CISLO16("16", "farba16"),
    CISLO32("32", "farba32"),
    CISLO64("64", "farba64"),
    CISLO128("128", "farba128"),
    CISLO256("256", "farba256"),
    CISLO512("512", "farba512"),
    CISLO1024("1024", "farba1024"),
    CISLO2048("2048", "farba2048");

    private String cislo;
    private String farba;

    Policka(String cislo, String farba) {
        this.cislo = cislo;
        this.farba = farba;
    }

    public String getFarba() {
        return this.farba;
    }

    public String getCislo() {
        return this.cislo;
    }
}
