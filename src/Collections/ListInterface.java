package Collections;
import java.util.ArrayList;
import java.util.List;

public class ListInterface {
   public static void main(String[] args) {
       List<String> stringList = new ArrayList<>();
       stringList.add("Hello");
       stringList.add("World");
       stringList.add("!");
       for(String element : stringList){
           System.out.println(element);
       }
   }



}
