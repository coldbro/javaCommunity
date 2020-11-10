package H2J;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratotTest {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        set.add("acde");
        set.add("fghi");
        set.add("hijkl");
        Iterator<String> diedaiq= set .iterator();
        while(diedaiq.hasNext()) {
            String s = diedaiq.next();

            System.out.println(s);
        }
    }
}
