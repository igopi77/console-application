public class Subtraction {
    void subtractionCalculator(float firstNumber,float secondNumber){
        float result = firstNumber - secondNumber;
        try{
            System.out.println("Result: "+ result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
