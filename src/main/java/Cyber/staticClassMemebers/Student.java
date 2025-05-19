package Cyber.staticClassMemebers;

public class Student {
    String name;
    int age;
    int idNumber;
    static String school = "CybertekEU";

    public Student(String name, int age, int idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idNumber=" + idNumber +
                ", school='" + school + '\'' +
                '}';
    }
}
