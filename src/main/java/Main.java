import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
//        sqrt(a ^ 2 + b ^ 2)
        System.out.println(Math.sqrt(a * a + b * b));
    }
}