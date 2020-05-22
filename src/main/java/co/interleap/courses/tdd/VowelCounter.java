package co.interleap.courses.tdd;


public class VowelCounter {

    public int count(String text) {

        int counter = 0;
        if (text.length() > 0) {
            for (String letter : text.split("")) {
                if (isAVowel(letter)) {
                    counter += 1;
                }
            }
        }
        return counter;
    }

    private boolean isAVowel(String letter) {
        return "aeiouAEIOU".contains(letter);
    }
}
