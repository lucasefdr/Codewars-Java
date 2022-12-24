package io.github.lucasefdr.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        if (names.length == 0)
            return "no one likes this";

        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            nameList.add(names[i]);
        }

        if (nameList.size() == 1) {
            return nameList.get(0) + " likes this";
        } else if (nameList.size() == 2) {
            return nameList.get(0) + " and " + nameList.get(1) + " like this";
        } else if (nameList.size() == 3) {
            return nameList.get(0) + ", " + nameList.get(1) + " and " + nameList.get(2) + " like this";
        } else {
            return nameList.get(0) + ", " + nameList.get(1) + " and " + (nameList.size() - 2) + " others like this";
        }
    }

    public static String whoLikesItSwitchCase(String... names) {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return String.format("%s likes this", names[0]);
            case 2:
                return String.format("%s and %s like this", names[0], names[1]);
            case 3:
                return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default:
                return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }

}