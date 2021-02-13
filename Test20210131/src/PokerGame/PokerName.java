package PokerGame;

import java.util.*;

public class PokerName {
    //存放4种花色
    public static final String[] suits = {"♥","♠","♣","♦"};
    //存放点数
    public static final String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    private static List<Card> buyPoker(){
        List<Card> poker = new ArrayList<>();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length ; j++) {
                poker.add(new Card(suits[i],ranks[j]));
            }
        }
        poker.add(new Card("red","Joker"));
        poker.add(new Card("black","Joker"));
        return poker;
    }

    private static void shuffle(List<Card> poker){
        Random random = new Random();
        for (int i = poker.size()-1; i > 0 ; i--) {
            int pos  = random.nextInt(i);
            swap(poker,i,pos);
        }
    }

    private static void swap(List<Card> poker, int i, int pos) {
        Card tmp = poker.get(i);
        poker.set(i,poker.get(pos));
        poker.set(pos,tmp);
    }

    public static void main(String[] args) {
        //1.创建出一副扑克牌
        List<Card> poker = buyPoker();
        System.out.println(poker);
        System.out.println("-------------------------------------");
        //2.洗牌
        shuffle(poker);
        System.out.println(poker);
        System.out.println("-------------------------------------");
        //标准库自带的洗牌方法
        Collections.shuffle(poker);
        System.out.println(poker);
        System.out.println("-------------------------------------");
        //3.发牌：每个玩家发5张牌，这五张牌用另一个ArrayList表示
        List<List<Card>> players = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入玩家的个数：");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            players.add(new ArrayList<Card>());
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < num; j++) {
                Card topCard = poker.remove(0);
                List<Card> player = players.get(j);
                player.add(topCard);
            }
        }
        System.out.println(players);
        System.out.println("-------------------------------------");
        //4.展示手牌：
        for (int i = 0; i < players.size(); i++) {
            System.out.println("第" + (i + 1) + "位玩家的牌是：" + players.get(i));
        }
    }
}
