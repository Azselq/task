package ex_5;


import java.util.ArrayList;
import java.util.List;

public class ex_5 {
    public static void main(String[] args) {
        List<Subject> items = new ArrayList<>();
        items.add(new Subject("s1", 2, 5000));
        items.add(new Subject("s2", 4, 2300));
        items.add(new Subject("s3", 1, 4444));
        items.add(new Subject("s4", 3, 3000));
        items.add(new Subject("s5", 2, 1200));
        items.add(new Subject("s5", 10, 1200));
        items.add(new Subject("s3", 1, 4444));
        items.add(new Subject("s3", 1, 4444));
        items.add(new Subject("s3", 1, 4444));

        Box safe = new Box(12);//вес маскимальный
        safe.makeAllSets(items);
        System.out.println(items);
        System.out.println(" ");
        System.out.println(safe.getBestItems());
    }
}
