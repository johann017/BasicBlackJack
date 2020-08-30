import java.util.ArrayList;

public class Sorting {
    private ArrayList<Integer> a;
    //private ArrayList<String> b;

    public Sorting(){
    }
    public Sorting(ArrayList<Integer> as){
        a = new ArrayList<>();
        for(Integer i : as){
            a.add(i);
        }
    }
//    public Sorting(ArrayList<String> as){
//        b = new ArrayList<>();
//        for(String s : as){
//            b.add(s);
//        }
//    }
    public void increasingOrder(){
        int min = 0;
        for(int i=0; i < a.size();i++) {
            for (int j = 1 + i; j < a.size(); j++) {
                if (a.get(i) > a.get(j)) {
                    min = a.get(j);
                    a.remove(j);
                    a.add(i, min);
                }
            }
        }
    }
    public void toStr(){
        System.out.print("{ " + a.get(0));
        for(int i = 1; i < a.size(); i++){
            System.out.print(" , " + a.get(i));
        }
        System.out.print(" }");
    }
}
