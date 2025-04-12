package Computer_systems_and_industrial_programming.course_2;

import java.util.stream.DoubleStream;

public class Calculator {
    static double add (double...numbers) {
        return DoubleStream.of(numbers)
                .sum();
    }

    static double multiply (double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }
}
