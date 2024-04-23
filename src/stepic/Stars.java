package stepic;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        int stars = readInput();
        String result = "";

        if (0 < stars && stars < 6)
            result = "★".repeat(stars);

        /*String result = switch(stars){
            case 1 -> "★";
            case 2 -> "★★";
            case 3 -> "★★★";
            case 4 -> "★★★★";
            case 5 -> "★★★★★";

            default -> throw new IllegalStateException("Unexpected value: " + stars);
        };*/


        System.out.println(result);
    }

    public static int readInput() {
        int stars = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            stars = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return stars;
    }
}
