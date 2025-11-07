package Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AggregateOperators {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Tree");
        words.add("Hello");
        words.add("World");
        words.add("Race");
        words.add("Game");
        words.add("Numbers");
        words.add("Ride");

        List<String> specialWordsWithForLoop = getSpecialWordsWithForLoop(words);

        List<String> specialWordsWithPipeline = getSpecialWordsWithPipeline(words);

        System.out.println("Special Words retrieved from for loop: "+ specialWordsWithForLoop);

        System.out.println("Special Words retrieved from pipeline: "+ specialWordsWithPipeline);

    }

    public static List<String> getSpecialWordsWithForLoop(List<String> words){
        List<String> specialWords = new ArrayList<>();

        for(String word: words) {
            if (word.length() == 4) {
                String upperCaseWord = word.toUpperCase();
                specialWords.add(upperCaseWord);
            }
        }
        return specialWords;
    }

    public static List<String> getSpecialWordsWithPipeline(List<String> words){
        List<String> specialWords = words.stream().filter(word -> word.length() == 4).map(word -> word.toUpperCase()).collect(Collectors.toList());

        return specialWords;
    }
}