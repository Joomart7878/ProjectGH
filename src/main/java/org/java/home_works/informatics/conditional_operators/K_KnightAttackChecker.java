package org.java.home_works.informatics.conditional_operators;

public class K_KnightAttackChecker {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int a = scanner.nextInt(); // Столбец коня
        int b = scanner.nextInt(); // Строка коня
        int c = scanner.nextInt(); // Столбец фигуры
        int d = scanner.nextInt(); // Строка фигуры

        // Проверяем, находятся ли все координаты в пределах от 1 до 8
        if ((a < 1 || a > 8) || (b < 1 || b > 8) || (c < 1 || c > 8) || (d < 1 || d > 8)) {
            System.out.println("NO"); // Некорректные координаты
        } else {
            // Проверяем все 8 возможных ходов коня
            if ((Math.abs(a - c) == 2 && Math.abs(b - d) == 1) || (Math.abs(a - c) == 1 && Math.abs(b - d) == 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}

