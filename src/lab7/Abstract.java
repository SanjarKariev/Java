package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Abstract {
    public static void main(String[] args) {
        ArrayList<MyFirst> list = new ArrayList<MyFirst>();
        list.add(new FixedPayment("Pavel", 233354.0));
        list.add(new FixedPayment("Evgeniy", 365455.2));
        list.add(new HourlyPayment("Alexey", 436657.1));
        list.add(new HourlyPayment("Sergey", 654645.1));

        list.clear();
        list.add(new FixedPayment("alexey",  5000.0));

        System.out.println("Before:");
        for (MyFirst first : list) {
            System.out.println(first.getName() + ": " + first.getSalary());
            first.GetSalary();
        }

        Collections.sort(list, new Comparator<MyFirst>() {
            @Override
            public int compare(MyFirst o1, MyFirst o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        System.out.println("-------------");
        System.out.println("After:");
        for (MyFirst myFirst  : list) {
            System.out.println(myFirst.getName() + ": " + myFirst.getSalary());
        }
    }
}

