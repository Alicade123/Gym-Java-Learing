package Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {
    public static void main(String[] args) {
        Set <Integer> sortedSet  = new TreeSet<>();
        sortedSet.add(3);
        sortedSet.add(7);
        sortedSet.add(27);
        sortedSet.add(7);
        for(Integer element : sortedSet){
            System.out.println(element);
        }
    }
}
