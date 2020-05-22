package co.interleap.courses.tdd;


import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VowelCounter {

    private static final Set<String> VOWEL_SET = Stream.of("a", "e", "i" , "o", "u","A","E","I","O","U").collect(Collectors.toSet());

    public int count(String text) {

        int counter = 0;
        String[] arr = text.split("");
        for(String letter : arr) {
            if(isAVowel(letter)) {
                counter += 1;
            }
        }
        return counter;
    }

    private boolean isAVowel(String letter) {
        return VOWEL_SET.contains(letter);
    }
 }
