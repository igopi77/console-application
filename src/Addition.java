import java.util.Scanner;

public class Addition {
    void additionCalculator(){
        float firstNumber,secondNumber;
        Scanner additionScanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNumber = additionScanner.nextFloat();
        System.out.print("Enter second number: ");
        secondNumber = additionScanner.nextFloat();
        System.out.println("Result: "+ (firstNumber+secondNumber));
    }
}
