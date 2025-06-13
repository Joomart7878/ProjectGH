package Discret_Math.home_works.Java.solutions;

import java.util.List;

public class Snake_in_Matrix {
    public  int finalPositionOfSnake(int n, List<String> commands){
        int row = 0;
        int col = 0;
        for (String command : commands){
            if (command.equals("UP")) {
                row--;
            } else if (command.equals("DOWN")) {
                row++;
            } else if (command.equals("RIGHT")) {
                col++;
            } else if (command.equals("LEFT")) {
                col--;
            }
        }
        return row * n + col;
    }
}
