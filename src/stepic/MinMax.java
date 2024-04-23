package stepic;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        int x1, x2, x3;
        String result = "";
        int max = 0;
        int min = 0;

        int[] inputValues = readInput();//2 1 3
        x1 = inputValues[0];//2
        x2 = inputValues[1];//1
        x3 = inputValues[2];//3

        if(x1<x2)
            min = x1;
        else
            min = x2;//1

        if(min>x3)
            min = x3;

        if(x1>x2)
            max = x1;
        else max = x2;

        if(max<x3)
            max = x3;


        result = "минимальное: "+min+", максимальное: "+ max;
        System.out.println(result);
    }

    public static int[] readInput() {
        int[] inputValues = new int[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = Integer.parseInt(values[i]);
            }
        }
        scanner.close();

        return inputValues;
    }

}
