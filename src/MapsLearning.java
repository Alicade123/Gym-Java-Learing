import java.util.HashMap;
import java.util.Map;

public class MapsLearning {

    public static void main(String[] args) {
        String test = "kigali";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < test.length(); i++) {
            char ch = test.charAt(i);
            if(!map.containsKey(ch+"")) {
                map.put(ch+"", 1);
            }else {
                map.put(ch+"", map.get(ch+"")+1);
            }
        }
        System.out.println(map);
    }
}
