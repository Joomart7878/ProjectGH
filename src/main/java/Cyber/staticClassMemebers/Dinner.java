package Cyber.staticClassMemebers;

public class Dinner {

    static int pizza = 8;

    public void takeASlice() {
        pizza--;
    }

    public void takeASLice(int count) {
        pizza -= count;
    }
}
