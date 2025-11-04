import java.util.HashMap;
import java.util.Map;

public class _5Maps {
    public static void main(String[] args) {
        Map<String,Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alicade",90);
        studentMarks.put("Benjamin",91);
        studentMarks.put("Christopher",90);
        studentMarks.put("David",99);
        studentMarks.put("Freddy",88);
        studentMarks.put("George",90);
        System.out.print(studentMarks+"\n");//Printing whole collection (Pair of key and values)
        System.out.print(studentMarks.keySet()+"\n"); // Printing only the keys
        System.out.print(studentMarks.values()+"\n"); // Printing only the values
        for(String student: studentMarks.keySet()){
            System.out.print(student+" : " +studentMarks.get(student)+" ");//printing key & values in loop
        }
    }
}
