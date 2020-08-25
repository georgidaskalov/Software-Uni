package OOP.WorkingWithAbstractionExerc.cardsWithPower;



public enum cardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    private final int value;

    cardSuits(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
