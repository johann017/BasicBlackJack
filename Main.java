import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
//        Game g = new Game();
//        g.run();
//        Card d = new Card();
//        d.blackjack();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(382);
        a.add(10);
        a.add(8);
        Sorting s = new Sorting(a);
        s.increasingOrder();
        s.toStr();
    }
}

//Stem and leaf plot
