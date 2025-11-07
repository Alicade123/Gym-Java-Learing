package Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Collection;
public class CollectionInterface {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        Queue<Double> doubleQueue = new LinkedList<>();
        Deque<Integer> intDeque = new ArrayDeque<>();

        intList.add(5);
        intList.add(8);
        intList.add(5);
        intList.add(1);

        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("World");

        doubleQueue.add(3.89);
        doubleQueue.add(889.64);

        intDeque.addFirst(7);
        intDeque.addFirst(8);
        intDeque.addLast(40);

        System.out.println(intList.getClass());
        printCollection(intList);
        System.out.println();
        System.out.println(stringSet.getClass());
        printCollection(stringSet);
        System.out.println();
        System.out.println(doubleQueue.getClass());
        printCollection(doubleQueue);
        System.out.println();
        System.out.println(intDeque.getClass());
        printCollection(intDeque);
    }

    private static <T> void printCollection(Collection<T> collection) {
        for(T item:collection){
            System.out.println(item);
        }
    }
}
