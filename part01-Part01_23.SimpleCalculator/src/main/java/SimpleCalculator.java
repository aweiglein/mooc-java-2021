
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int x = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int y = Integer.valueOf(scanner.nextLine());
        
        int sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);
        
        int diff = x - y;
        System.out.println(x + " - " + y + " = " + diff);
        
        int prod = x * y;
        System.out.println(x + " * " + y + " = " + prod);
        
        double quo = ((double)x / y);
        System.out.println(x + " / " + y + " = " + quo);
    }
}
