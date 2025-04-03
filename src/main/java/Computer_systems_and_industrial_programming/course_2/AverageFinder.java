package Computer_systems_and_industrial_programming.course_2;

public class AverageFinder {
    public static void  main(String[] args){
        System.out.println("Average Finder");
        double avg = findAverage(new String[]{"1", "70"});
        System.out.println("The average is " + avg);
        System.out.println(avg + " - is the real average");
    }

    static double findAverage(String[] input) {
        double result = 0;
        if (input.length == 0) {
            return result;
        }

        for (String s : input) {
            result += Integer.parseInt(s);
        }

        return result / input.length;
    }
}
