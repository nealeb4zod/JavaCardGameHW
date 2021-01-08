public enum SuitType {

    HEARTS(3),
    DIAMONDS(2),
    CLUBS(1),
    SPADES(4);

    private final int rank;

    SuitType(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

}
