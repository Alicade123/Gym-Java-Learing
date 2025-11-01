import java.util.Arrays;
import java.util.Collections;
public class _4ArraySortings {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //5. Sorting the Array/Primitive datatypes in decending order
        Integer[] sortedNumbers = new Integer[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            sortedNumbers[i] = numbers[i];
        }
        Arrays.sort(sortedNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
        Arrays.sort(sortedNumbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(sortedNumbers));
    }

}
