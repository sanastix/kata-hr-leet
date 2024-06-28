package org.example.week2.day7;

import java.util.ArrayList;
import java.util.List;

public class Kata7 {

    public static List<Object> filterList(final List<Object> list) {
        List<Object> result = new ArrayList<>();
        for (Object o : list) {
            if (o instanceof Integer) result.add(o);
        }
        return result;
    }

}
