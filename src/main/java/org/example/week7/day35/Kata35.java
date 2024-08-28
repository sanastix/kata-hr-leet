package org.example.week7.day35;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata35 {

    public static List<String> number(List<String> lines) {
        return IntStream.range(0, lines.size())
                .mapToObj(i -> (i + 1) + ": " + lines.get(i))
                .collect(Collectors.toList());
    }

}
