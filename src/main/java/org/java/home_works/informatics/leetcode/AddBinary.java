package org.java.home_works.informatics.leetcode;

import java.math.BigInteger;

public class AddBinary {
    public String addBinary(String a, String b) {
        BigInteger aBig = new BigInteger(a,2);
        BigInteger bBig = new BigInteger(b,2);
        return aBig.add(bBig).toString(2);
    }
}
