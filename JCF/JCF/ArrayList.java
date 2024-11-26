import java.util.*;

public class ArrayList {

    public static void main(String[] args) {

        List<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        // System.out.println(list.size());
        for (int x : list) {
            System.out.print(x);
        }
        list.sort((a, b) -> a - b);

        System.out.println();

        for (int x : list) {
            System.out.print(x);
        }
        System.out.println();

        list.sort((a, b) -> b - a); // lambda function

        for (int x : list) {
            System.out.print(x);
        }

        System.out.println();

        List<String> words = Arrays.asList("banana ", "apple " , "date ");

        
        for (String x : words) {
            System.out.print(x);
        }
        System.out.println();
        words.sort((a,b)->a.length()-b.length());

         
        for (String x : words) {
            System.out.print(x);
        }
        System.out.println();

        words.sort((a,b)->b.length()-a.length());
        for (String x : words) {
            System.out.print(x);
        }
        System.out.println();

        // SET
        // list.set(2, 2);
        // for(int x: list){
        // System.out.println(x);
        // }

        // REMOVE
        // list.remove(3);
        // for (int x : list) {
        // System.out.println(x);
        // }

        // ADDALL , LISTOF , ARRAYASLISt

        // List lisr1= List.of(11,22,33,44); //Immutable fixed size
        // List list2= Arrays.asList(100,200,300); //mutable fixed size
        // list.addAll(lisr1);
        // list.addAll(list2);

        // for (int x : list) {
        // System.out.println(x);
        // }

        // System.out.println();
        // System.out.println(list.size());

    }

}
