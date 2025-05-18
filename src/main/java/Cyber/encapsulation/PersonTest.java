package Cyber.encapsulation;

public class PersonTest {
    public static void main(String[] args) {

        Person p = new Person();

        p.setAge(30);
        p.setName("Ansar");
        p.setGender('M');
        System.out.println("His name is " + p.getName() + " and his age is " + p.getAge() + " and gender is " + p.getGender());
    }
}
