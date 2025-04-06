package org.java.home_works.week_1;
import java.io.*;


public class Loop_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i=0; i<=10; i++){
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
        bufferedReader.close();
    }
}

