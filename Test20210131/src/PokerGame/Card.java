package PokerGame;

//一张扑克牌
public class Card {
    //花色
    protected String suit;
    //点数
    protected String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    @Override
    public String toString(){
        return "(" + this.suit + this.rank + ")";
    }
}
