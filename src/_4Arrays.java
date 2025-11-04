import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class _4Arrays {
    public static void main(String[] args) {
        int[] numbers ={13,13,21,89,87,83,23,34,19,13,30, 52,13,23,25};
        String[] names = {"Ujiri","Alicade","Charlie", "Alice", "Bob", "David","Kaka","Robert,Zed"};
        System.out.println(Arrays.toString(numbers));

        //1. Sort Array -Ascending order (Primitive and Non-Primitive datatypes)
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        //2. Binary Search
        System.out.println(Arrays.binarySearch(numbers, 100));//-15
        System.out.println(Arrays.binarySearch(numbers, 13));
        System.out.println(Arrays.binarySearch(numbers, 1)); //-1

        System.out.println(Arrays.binarySearch(names, "Alice"));//1
        System.out.println(Arrays.binarySearch(names, "Alicade"));//0
        System.out.println(names.length);
        System.out.println(numbers.length);

        //3.Sorting the Non-Primitive datatypes data in Descending order
        Arrays.sort(names,Collections.reverseOrder());
        System.out.println(Arrays.toString(names));

        //4.Sorting the Primitive data types data in Descending order
        int[] primitiveNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};

        //. Sorting the Array/Primitive datatypes in descending order
        //step1: Creating the wrapper array.
        Integer[] wrapperArray = new Integer[primitiveNumbers.length];
        //Step2: Copy the original array to the wrapper array
        for(int i = 0; i < primitiveNumbers.length; i++){
            wrapperArray[i] = primitiveNumbers[i];
        }
        //Regular sort
        Arrays.sort(wrapperArray);
        System.out.println(Arrays.toString(wrapperArray));
        //Step3: The descending order sort by using collection reverseOrder()
        Arrays.sort(wrapperArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(wrapperArray));


        ArrayList <String> colors = new  ArrayList<>(Arrays.asList("Red","Green","Blue","Yellow"));
        colors.add("Indigo");
    System.out.println(colors.indexOf("Blue"));
        for(String color: colors){
            System.out.print(color +" ");
        }
        //System.out.println(colors);
    }
}
