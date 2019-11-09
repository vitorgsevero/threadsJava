package d;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[200];
        for (int i = 0; i < 200; i++) {
            numbers[i] = new Random().nextInt();
        }
        System.out.print("Choose a number: ");
        int number = new Scanner(System.in).nextInt();

        new Thread(numbers, 0, 50, number).start();
        new Thread(numbers, 50, 100, number).start();
        new Thread(numbers, 100, 150, number).start();
        new Thread(numbers, 150, 200, number).start();
    }
}
