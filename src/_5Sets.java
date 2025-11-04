import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _5Sets {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(105);
        set.add(200);
        set.add(300);
        set.add(4);
        set.add(50);
        set.add(633);
        set.add(207);
        set.add(89);
        set.add(99);
        set.add(10);

      for(Integer x : set){
          System.out.print(x+" ");
      }
    }
}
