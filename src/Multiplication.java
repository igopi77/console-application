import java.util.Scanner;

public class Multiplication {
    void multiplicationCalculator(){
        float firstNumber,secondNumber;
        Scanner multiplicationScanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNumber = multiplicationScanner.nextFloat();
        System.out.print("Enter second number: ");
        secondNumber = multiplicationScanner.nextFloat();
        System.out.println("Result: "+ (firstNumber*secondNumber));
    }
}
