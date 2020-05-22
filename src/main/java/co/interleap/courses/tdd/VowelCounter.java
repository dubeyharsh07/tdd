package co.interleap.courses.tdd;


public class VowelCounter {

    public int count(String text) {

        final String consonantRegex = "(?i)[^aeiou]+";
        return text.replaceAll(consonantRegex,"").length();
    }

}
