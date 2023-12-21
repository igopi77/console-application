import java.util.Scanner;

public class Subtraction {
    void subtractionCalculator(){
        float firstNumber,secondNumber;
        Scanner subtracionScanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNumber = subtracionScanner.nextFloat();
        System.out.print("Enter second number: ");
        secondNumber = subtracionScanner.nextFloat();
        float result = firstNumber - secondNumber;
        System.out.println("Result: "+ result);
    }
}
