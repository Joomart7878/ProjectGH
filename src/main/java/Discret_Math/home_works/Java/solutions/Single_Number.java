package Discret_Math.home_works.Java.solutions;

public class Single_Number {
    public int singleNumber(int[] nums){

        int answer = 0;
        for (int x : nums){
            answer ^= x;
        }
        return answer;
    }

}
