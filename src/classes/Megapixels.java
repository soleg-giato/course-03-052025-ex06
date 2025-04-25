package classes;

public enum Megapixels {

    RETRO(0),
    FLIP(2),
    SMARTPHONE(120);

    private final int megapixels;

    Megapixels(int megapixels) {
        this.megapixels = megapixels;
    }

    public int getMegapixels() {
        return megapixels;
    }
}
