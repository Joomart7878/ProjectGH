package Cyber;

import javax.xml.transform.Source;

public class Precedence_logical_operators {
    public static void main(String[] args) {
//        ! is evaluated first
//        && is evaluated second
//        || is evaluated third
//                          true    or     false
        System.out.println(!(false) || true && false);  // true

        boolean bool = !(10 < 8 && (5 > 2 || 3 < 5));  // true

        System.out.println(bool);

    }
}
