package Computer_systems_and_industrial_programming.course_2;

public class Main {
    public static void main(String[] args) {
        double multiplied = Calculator.multiply(3.14, 2, 5, 6.5, 7, 8);
        double added = Calculator.add(3.14, 2, 5, 6.5, 7, 8);
        System.out.println("Multiplying answer is " + multiplied);
        System.out.println("Adding answer is " + added);
    }
}
