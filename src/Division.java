public class Division {
    void divisionCalculator(float firstNumber,float secondNumber){
        try{
            float result = firstNumber /secondNumber;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
