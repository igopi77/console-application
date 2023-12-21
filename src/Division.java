import java.util.Scanner;

public class Division {
    void divisionCalculator(long firstNumber,long secondNumber){
        try {
            long result = firstNumber / secondNumber;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
