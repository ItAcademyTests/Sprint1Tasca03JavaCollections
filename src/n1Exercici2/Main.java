package n1Exercici2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        Collections.reverse(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);

        for (Integer num : list2) {
            System.out.println(num);
        }

    }

}
