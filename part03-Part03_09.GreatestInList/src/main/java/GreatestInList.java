
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);    
        }
        
        System.out.println("");
        
        int number = list.get(0);
        
        for (Integer integer : list) {
            if (integer > number) {
                number = integer;
            }
        }
        System.out.println("The greatest number: " + number);
        }
    }

