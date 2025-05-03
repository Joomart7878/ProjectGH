package Cyber;

public class Switch_statement {
    public static void main(String[] args) {
        int restaurantRating = 3;

        switch (restaurantRating) {
            case 1:
                System.out.println("This restaurant is not my favorite");
                break;
            case 2:
                System.out.println("This restaurant is fantastic");
                break;
            case 3:
                System.out.println("This restaurant is fantastic");
                break;
            default:
                System.out.println("I've never dined in this restaurant");
                break;

        }
    }
}
