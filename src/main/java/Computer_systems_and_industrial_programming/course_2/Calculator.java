package Computer_systems_and_industrial_programming.course_2;

import java.util.stream.DoubleStream;

public class Calculator {
    static double add (double...numbers) {
        return DoubleStream.of(numbers)
                .sum();
    }

    static double multiply (double... numbers) {
        return DoubleStream.of(numbers)
                .reduce(1, (a, b) -> a * b);
        // 2, 3, 4 => 2*3*4
    }
}
