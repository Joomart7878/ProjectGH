package Cyber.encapsulation;

public class CarpetTest {
    public static void main(String[] args) {

//        Floor f = new Floor(10, 20);
//        Carpet c = new Carpet(45.4);
//
//        Calculator cal = new Calculator(f, c);
//
//        System.out.println(cal.getTotalCost());

        Calculator cal = new Calculator(new Floor(10, 25), new Carpet(65.22));
        System.out.println(cal.getTotalCost());
    }
}
