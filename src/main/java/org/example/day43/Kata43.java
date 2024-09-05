package org.example.day43;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Kata43 {

    enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    public static int arithmetic(int a, int b, String operator) {
        Map<Operator, BiFunction<Integer, Integer, Integer>> operations = new EnumMap<>(Operator.class);
        operations.put(Operator.ADD, (x, y) -> x + y);
        operations.put(Operator.SUBTRACT, (x, y) -> x - y);
        operations.put(Operator.MULTIPLY, (x, y) -> x * y);
        operations.put(Operator.DIVIDE, (x, y) -> x / y);
        Operator op = Operator.valueOf(operator.toUpperCase());
        return operations.get(op).apply(a, b);
    }

}
