public enum SuitType {

    HEARTS(2),
    DIAMONDS(3),
    CLUBS(4),
    SPADES(1);

    private final int rank;

    SuitType(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

}
