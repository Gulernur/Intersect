import java.util.ArrayList;

public class Main {

    public ArrayList<Integer> intersect(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> list = new ArrayList<>();
        for (int integer : a) {
            if(b.contains(integer)){
                list.add(integer);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Main m = new Main();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(4);
        a.add(8);
        a.add(9);
        a.add(11);
        a.add(15);
        a.add(17);
        a.add(28);
        a.add(41);
        a.add(59);

        b.add(4);
        b.add(7);
        b.add(11);
        b.add(17);
        b.add(19);
        b.add(20);
        b.add(23);
        b.add(28);
        b.add(37);
        b.add(59);
        b.add(81);

        System.out.println(m.intersect(a,b));


    }
}
