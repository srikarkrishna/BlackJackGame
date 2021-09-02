public enum Suit {
    SPADES,
    CLUBS,
    HEARTS,
    DIAMONDS;

    public Suit getSuitFromValue(int value) {
        switch (value) {
            case 0:
                return Suit.SPADES;
            case 1:
                return Suit.CLUBS;
            case 2:
                return Suit.HEARTS;
            case 3:
                return Suit.DIAMONDS;
        }
        return null;
    }
}