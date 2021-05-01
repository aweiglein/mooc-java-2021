
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numOfNum = 0;
        int sumOfNum = 0;
       
        while (true) {
            System.out.println("Give a number:");
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0 ) {
                break;
            }
            if (input != 0) {
                numOfNum = numOfNum + 1;
                sumOfNum = sumOfNum + input;
            }
        }
        System.out.println("Number of numbers: " + numOfNum);
        System.out.println("Sum of the numbers: " + sumOfNum);
    }
}
