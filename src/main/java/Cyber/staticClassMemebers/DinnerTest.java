package Cyber.staticClassMemebers;

public class DinnerTest {
    public static void main(String[] args) {
        Dinner mom = new Dinner();
        Dinner kid = new Dinner();
        Dinner dad = new Dinner();

        System.out.println("Total Slice of pizza " + Dinner.pizza);

        dad.takeASLice(2);
        kid.takeASlice();
        mom.takeASLice(3);

        System.out.println(Dinner.pizza);
    }
}
