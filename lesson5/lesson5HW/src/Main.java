import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int sum =0;
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();

        do {
            System.out.print("Enter an intiger, if 0 is typed program will stop): ");
            input = scanner.nextInt();
            sum += input;
            if (input > 0) {
                positiveNumbers.add(input);
            } else if (input < 0) {
                negativeNumbers.add(input);
            }
        } while (input != 0);

        System.out.println("Positive numbers: " + positiveNumbers);
        System.out.println("Negative numbers: " + negativeNumbers);
        System.out.println("The sum of numbers that were typed is: " + sum);
    }
}