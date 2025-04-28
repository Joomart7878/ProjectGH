package org.java.home_works.informatics.conditional_operators;

public class J_KingMoveChecker {
    public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            int a = scanner.nextInt(); // Начальный столбец
            int b = scanner.nextInt(); // Начальная строка
            int c = scanner.nextInt(); // Конечный столбец
            int d = scanner.nextInt(); // Конечная строка

            // Проверяем, что все координаты находятся в пределах от 1 до 8 (хотя в условии это уже дано)
            if ((a < 1 || a > 8) || (b < 1 || b > 8) || (c < 1 || c > 8) || (d < 1 || d > 8)) {
                System.out.println("NO"); // Некорректные координаты (хотя по условию это не должно произойти)
            } else {
                // Проверяем, может ли король переместиться на одну клетку по горизонтали, вертикали или диагонали
                if (Math.abs(a - c) <= 1 && Math.abs(b - d) <= 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            scanner.close();

    }
}
