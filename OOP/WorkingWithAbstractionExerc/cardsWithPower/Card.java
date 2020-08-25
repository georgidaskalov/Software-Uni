package OOP.WorkingWithAbstractionExerc.cardsWithPower;

public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString(){
        return String.format("Card name: %s of %s; Card power: %d",rank,suit,getPower());
    }

    private int getPower() {
        int power = CardRank.valueOf(rank).getValue() + cardSuits.valueOf(suit).getValue();
        return power;
    }
}
