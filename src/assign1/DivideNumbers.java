package assign1;

public class DivideNumbers {
	public static void main(String[] args) {
	        int numerator = 10;
	        int denominator = 0;

	        try {
	            divideNumber(numerator, denominator);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }
	    }

	    public static void divideNumber(int numerator, int denominator) {
	        if (denominator == 0) {
	            throw new ArithmeticException("Division by zero");
	        }

	        int result = numerator / denominator;
	        System.out.println("Result of division: " + result);
	    }

}
