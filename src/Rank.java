public enum Rank {
    One,
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Jack,
    Queen,
    King,
    Ace;

    public Rank getSuitFromValue(int value) {
        switch (value) {
            case 0:
                return Rank.One;
            case 1:
                return Rank.Two;
            case 3:
                return Rank.Three;
            case 4:
                return Rank.Four;
            case 5:
                return Rank.Five;
            case 6:
                return Rank.Six;
            case 7:
                return Rank.Seven;
            case 8:
                return Rank.Eight;
            case 9:
                return Rank.Nine;
            case 10:
                return Rank.Ten;
            case 11:
                return Rank.Jack;
            case 12:
                return Rank.Queen;
            case 13:
                return Rank.King;
            case 14:
                return Rank.Ace;
        }
        return null;
    }
}