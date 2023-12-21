import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int stop = 0;
        long firstNumber , secondNumber;
        while (stop != 1) {
            System.out.println("----------------- Simple Calculator Application -----------------");
            System.out.println(
                            "1. Addition\n" +
                            "2. Subtraction\n" +
                            "3. Multiplication\n" +
                            "4. Division\n" +
                            "5. Exit"
            );
            try {
                int choice;
                LoopForContinue loopForContinueObj = new LoopForContinue();
                Scanner calculatorScanner = new Scanner(System.in);
                System.out.print("Enter your choice : ");
                choice = calculatorScanner.nextInt();
                System.out.print("Enter first number: ");
                firstNumber = calculatorScanner.nextLong();
                System.out.print("Enter second number: ");
                secondNumber = calculatorScanner.nextLong();
                switch (choice) {
                    case 1:
                        Addition additionObj = new Addition();
                        additionObj.additionCalculator(firstNumber,secondNumber);
                        stop = loopForContinueObj.loopForContinue();
                        break;
                    case 2:
                        Subtraction subtractionObj = new Subtraction();
                        subtractionObj.subtractionCalculator(firstNumber,secondNumber);
                        stop = loopForContinueObj.loopForContinue();

                        break;
                    case 3:
                        Multiplication multiplicationObj = new Multiplication();
                        multiplicationObj.multiplicationCalculator(firstNumber,secondNumber);
                        stop = loopForContinueObj.loopForContinue();
                        break;
                    case 4:
                        Division divisionObj = new Division();
                        divisionObj.divisionCalculator(firstNumber,secondNumber);
                        stop = loopForContinueObj.loopForContinue();
                        break;
                    case 5:
                        stop = 1;
                        break;
                    default:
                        System.out.println("Please enter a correct choice ");
                        break;
                }

            } catch (Exception e) {
                System.out.println(e);
            }
    }
}
}