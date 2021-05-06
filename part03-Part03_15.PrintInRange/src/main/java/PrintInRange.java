
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
                
        printNumbersInRange(numbers, 3, 10);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {        
        for (Integer number : numbers) {
            if (number <= lowerLimit && number >= upperLimit) {
                continue;
            }
            
            if (number > upperLimit) {
                continue;
            }
            
            System.out.println(number);
    }    
}
    
}
