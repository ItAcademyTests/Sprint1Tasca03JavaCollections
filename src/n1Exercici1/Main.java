package n1Exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        var months = new ArrayList<Month>();

        months.add(new Month("Gener"));
        months.add(new Month("Febrer"));
        months.add(new Month("Març"));
        months.add(new Month("Abril"));
        months.add(new Month("Maig"));
        months.add(new Month("Juny"));
        months.add(new Month("Juliol"));
        months.add(new Month("Setembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Novembre"));
        months.add(new Month("Decembre"));

        months.add(7, new Month("Agost"));

        for (Month m : months) {
            System.out.println(months.indexOf(m) + "   " + m);
        }

        Set<Month> monthsSet = new HashSet<>();
        monthsSet.addAll(months);

        System.out.println();
        for (Month m : monthsSet) {
            System.out.println(months.indexOf(m) + "   " + m);
        }

    }

}
