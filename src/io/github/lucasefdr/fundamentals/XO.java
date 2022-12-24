package io.github.lucasefdr.fundamentals;

public class XO {
    
    public static boolean getXO(String str) {
        int x = str.replaceAll("[^xX]", "").length();
        int o = str.replaceAll("[^oO]", "").length();
        return x == o;
    }
}