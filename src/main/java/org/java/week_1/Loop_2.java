package org.java.week_1;

import java.util.*;

class Loop_2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // Calculate and print the series
            int current = a;
            for(int j=0; j<n; j++){
                current += Math.pow(2, j) * b;
                System.out.print(current + " ");
            }
            System.out.println(); // Move to the next line for the next query
        }
        in.close();
    }
}
