package io.github.lucasefdr.fundamentals;

public class Vowels {
    
    public static int getCount(String str) {
        String[] letters = str.split("");
        String[] vowels = { "a", "e", "i", "o", "u" };
        int count = 0;

        for (var letter : letters) {
            for (var vowel : vowels) {
                if (letter.equals(vowel)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int getCountWithRegex(String str) {
        return str.replaceAll("[^aeiou]","").length();
    }
}
