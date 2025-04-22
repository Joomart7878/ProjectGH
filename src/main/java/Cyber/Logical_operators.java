package Cyber;

public class Logical_operators {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(true && false);
        System.out.println(false && true);

        System.out.println(2 < 4 && 4 < 6);

        boolean b = 10 == 10 && false;
        System.out.println(b);

        String drink = "coffee";
        boolean hot = true;
        boolean free = true;

        boolean bool = drink.equals("coffee") && hot && free;  // should be true
        boolean bool1 = drink.equals("tea") && hot && free;  // should be false

        System.out.println(bool);
        System.out.println(bool1);



    }
}
