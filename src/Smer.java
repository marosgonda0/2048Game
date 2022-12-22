public enum Smer {
    HORE(-1, 0),
    DOLE(1, 0),
    VLAVO(0, -1),
    VPRAVO(0, 1);

    private int x;
    private int y;

    Smer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
