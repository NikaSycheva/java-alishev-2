package stepic;

import java.util.Scanner;

public class UpDown {
    public static void main(String[] args) {
        int x, y;
        String direction, result = "";

        String[] inputValues = readInput();
        x = Integer.parseInt(inputValues[0]);
        y = Integer.parseInt(inputValues[1]);
        direction = inputValues[2];

       /*     switch (direction) {
                case "up" -> y--;
                case "down" -> y++;
                case "left" -> x--;
                case "right" -> x++;
            }*/

        //result = String.format("x: %d, y: %d, direction: %s", x, y, direction);
        //System.out.println(result);

        if (direction.equals("up")) {
            stepUp(y);
        } else if (direction.equals("down")) {
            stepDown(y);
        } else if (direction.equals("left")) {
            stepLeft(x);
        } else if (direction.equals("right")) {
            stepRight(x);
        }

        result = String.format("x: %d, y: %d, direction: %s");

        //result = "x: " + x + ", y: " + y + ", direction: " + direction;
        System.out.println(result);
    }

    public static String[] readInput() {
        String[] inputValues = new String[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = values[i];
            }
        }
        scanner.close();

        return inputValues;
    }

    public static void stepDown(int y){
        if (y > 0 && y < 100)
            y++;
        else if (y <= 0)
            y = 0;
        else if (y >= 100)
            y = 100;
    }

    public static void stepLeft(int x){
        if (x > 0 && x < 100)
            x--;
        else if (x <= 0)
            x = 0;
        else if (x >= 100)
            x = 100;
    }

    public static void stepRight(int x){
        if (x > 0 && x < 100)
            x++;
        else if (x <= 0)
            x = 0;
        else if (x >= 100)
            x = 100;
    }

    public static void stepUp(int y){
        if (y > 0 && y < 100)
            y--;
        else if (y <= 0)
            y = 0;
        else if (y >= 100)
            y = 100;
    }
}
