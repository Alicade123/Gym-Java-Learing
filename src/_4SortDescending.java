import java.util.Arrays;
import java.util.Collections;
public class _4SortDescending {
    public static void main(String[] args) {
        int[] primitiveNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //A. Sorting the Array/Primitive datatypes in descending order
        //step1: Creating the wrapper array.
        Integer[] sortedNumbers = new Integer[primitiveNumbers.length];
        //Step2: Copy the original array to the wrapper array
        for(int i = 0; i < primitiveNumbers.length; i++){
            sortedNumbers[i] = primitiveNumbers[i];
        }
        //Regular sort
        Arrays.sort(sortedNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
        //Step3: The descending order sort by using collection reverseOrder()
        Arrays.sort(sortedNumbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(sortedNumbers));
    }

}
