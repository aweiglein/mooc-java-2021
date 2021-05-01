
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPos = 0;
        int sum = 0;
        double avg = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }
            if (input > 0) {
                countPos = countPos + 1;
                sum = sum + input;
                avg = (double) sum / countPos;
            }
        }
        if (countPos == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(avg);
        }
    }
}
