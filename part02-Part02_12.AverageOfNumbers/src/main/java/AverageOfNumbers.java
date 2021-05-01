
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        double avg = 0;
            
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            if (num != 0) {
                count = count +1;
                sum = num + sum;
                avg = (double)sum / count;
            }
        }
        System.out.println("Average of the numbers: " + avg);
    }
}
