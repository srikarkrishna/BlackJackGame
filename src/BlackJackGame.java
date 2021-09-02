import java.util.Random;

public class BlackJackGame {
    Card cards[] = new Card[52];

    public void fill(){
        int i=0;
        for(Suit s: Suit.values()){
            for(Rank r:Rank.values()){
                cards[i]= new Card(s,r);
                i++;
            }
        }
    }
    public Card drawCard() {
        Card card = null;
        Random random = new Random();
        while (card != null) {
            int cardVal = random.nextInt(52);
            if(!cards[cardVal].drawn){
                card = cards[cardVal];
            }
        }
        return card;
    }
}
