import java.util.*;

public class ArrayList {

    public static void main(String[] args) {

        List<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(30);
        list.add(99);
        list.add(20);
        
        for (int x : list) {
            System.out.println(x);
        }

        System.out.println();
        //SET
        // list.set(2, 2);
        // for(int x: list){
        // System.out.println(x);
        // }

        //REMOVE
        list.remove(3);
        for (int x : list) {
            System.out.println(x);
        }

    }

}
