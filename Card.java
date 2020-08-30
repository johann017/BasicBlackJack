import java.util.Scanner;

public class Card {
    private String face;
    private String suit;

    public Card(){
    }
    public Card(String f, String s){
        face = f;
        suit = s;
    }
    public String getFace() {
        return face;
    }
    public void setFace(String face) {
        this.face = face;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public String toString(){
        return getFace() + " of " + getSuit();
    }
    public int faceToValue(String s){
        if(s == "Ace")
            return 1;
        if(s == "2")
            return 2;
        if(s == "3")
            return 3;
        if(s == "4")
            return 4;
        if(s == "5")
            return 5;
        if(s == "6")
            return 6;
        if(s == "7")
            return 7;
        if(s == "8")
            return 8;
        if(s == "9")
            return 9;
        if(s == "10")
            return 10;
        if(s == "Jack")
            return 10;
        if(s == "Queen")
            return 10;
        if(s == "King")
            return 10;
        return 0;
    }
    public String valueToFace(int i){
        if(i == 1)
            return "Ace";
        if(i == 2)
            return "2";
        if(i == 3)
            return "3";
        if(i == 4)
            return "4";
        if(i == 5)
            return "5";
        if(i == 6)
            return "6";
        if(i == 7)
            return "7";
        if(i == 8)
            return "8";
        if(i == 9)
            return "9";
        if(i == 10)
            return "10";
        if(i == 11)
            return "Jack";
        if(i == 12)
            return "Queen";
        if(i == 13)
            return "King";
        return "";
    }
    public String valueToSuit(int i){
        if(i == 1)
            return "Hearts";
        if(i == 2)
            return "Clubs";
        if(i == 3)
            return "Diamonds";
        if(i == 4)
            return "Spades";
        return "";
    }
    public Card numToCard(int i, int j){
        Card c = new Card();
        c.face = valueToFace(i);
        c.suit = valueToSuit(j);
        return c;
    }
    public String blackjack() {
        int sum = 0;
        int sum2 = 0;
        System.out.println("Hello welcome to Blackjack!");
        int random = (int) (Math.random() * 13) + 1;
        int random2 = (int) (Math.random() * 4) + 1;
        Card c = numToCard(random, random2);
        sum += faceToValue(c.face);
        System.out.print("You have been dealt : " + c.toString());
        random = (int) (Math.random() * 13) + 1;
        random2 = (int) (Math.random() * 4) + 1;
        c = numToCard(random, random2);
        sum += faceToValue(c.face);
        System.out.println(" and " + c.toString());
        //boolean z = true;
        System.out.println("Would you like to hit or stay?");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        while (str.equals("hit")) {
            random = (int) (Math.random() * 13) + 1;
            random2 = (int) (Math.random() * 4) + 1;
            c = numToCard(random, random2);
            System.out.println("You have been dealt : " + c.toString());
            sum += faceToValue(c.face);
            if(sum > 21){
                System.out.println("Bust. You lost!");
                return "Bust. You lost!";
            }
            System.out.println("Would you like to hit or stay?");
            str = s.next();
        }
        random = (int) (Math.random() * 13) + 1;
        random2 = (int) (Math.random() * 4) + 1;
        c = numToCard(random, random2);
        sum2 += faceToValue(c.face);
        System.out.print("Dealer has been dealt : " + c.toString());
        random = (int) (Math.random() * 13) + 1;
        random2 = (int) (Math.random() * 4) + 1;
        c = numToCard(random, random2);
        sum2 += faceToValue(c.face);
        System.out.println(" and " + c.toString());
        while (sum2 < 17) {
            random = (int) (Math.random() * 13) + 1;
            random2 = (int) (Math.random() * 4) + 1;
            c = numToCard(random, random2);
            System.out.println("Dealer has been dealt : " + c.toString());
            sum2 += faceToValue(c.face);
        }
        if(sum2 > 21){
            System.out.println("Dealer has bust. You won!");
            return "Dealer has bust. You won!";
        }
        if(sum > sum2){
            System.out.println("You won!");
            return "You won!";
        }
        System.out.println("You lost!");
        return "You lost!";
    }
}
