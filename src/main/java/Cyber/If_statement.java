package Cyber;

public class If_statement {
    public static void main(String[] args) {
        if (9 > 2) {
            System.out.println("Control operator");
        }

        int apples = 10;
        int oranges = 5;

        if (apples > oranges) {
            System.out.println("I have more apples than oranges");
        }

        String userName = "abc";
        String inputUserName = "abc";

        if (userName.equals(inputUserName)) {
            System.out.println("Access granted");
            System.out.println("Welcome agent!");
        }

        int books = 500;

        if (books < 500) {
            books += 5;
            System.out.println(books);
        }
    }
}
