import java.util.Random;

public class Card {
    Suit s;
    Rank r;
    boolean drawn = false;
    public Card(Suit s,Rank r){
        this.s = s;
        this.r = r;
    }
}
