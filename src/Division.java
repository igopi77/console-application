import java.util.Scanner;

public class Division {
    void divisionCalculator(){
        long firstNumber ,secondNumber;
        Scanner divisionScanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNumber = divisionScanner.nextLong();
        System.out.print("Enter second number: ");
        secondNumber = divisionScanner.nextLong();
        try {
            long result = firstNumber / secondNumber;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
