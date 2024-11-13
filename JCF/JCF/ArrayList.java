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
        // list.remove(3);
        // for (int x : list) {
        //     System.out.println(x);
        // }

        //ADDALL , LISTOF , ARRAYASLISt 

      List lisr1=  List.of(11,22,33,44);
      List list2= Arrays.asList(100,200,300);
        list.addAll(lisr1);
        list.addAll(list2);

        for (int x : list) {
            System.out.println(x);
        }
        

    }

}
