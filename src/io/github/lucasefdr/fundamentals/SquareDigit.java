package io.github.lucasefdr.fundamentals;

public class SquareDigit {
    public static int squareDigits(int n) {
        String str = String.valueOf(n);
        String[] letters = str.split("");
        String result = "";

        for (String letter : letters) {
            Integer i = Integer.parseInt(letter);
            i *= i;
            result += String.valueOf(i);
        }

        return Integer.parseInt(result);
    }
}