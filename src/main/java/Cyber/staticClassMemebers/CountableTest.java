package Cyber.staticClassMemebers;

public class CountableTest {

    public static void main(String[] args) {

        int objectCount;

        Countable c1 = new Countable();
        Countable c2 = new Countable();
        Countable c3 = new Countable();

        objectCount = c1.getInstanceCount();
        objectCount = c2.getInstanceCount();
        objectCount = c3.getInstanceCount();

        System.out.println(c1.getInstanceCount());
    }
}
