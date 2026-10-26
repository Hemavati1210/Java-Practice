public class CalculatorStatic {
    static void square(int n) {
        System.out.println("Square of " + n + " is: " + (n * n));
    }

    public static void main(String[] args) {
        CalculatorStatic.square(5);
        CalculatorStatic.square(10);
   }
} 
