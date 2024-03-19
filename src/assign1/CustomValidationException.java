package assign1;

//import assignment1.CustomValidationException.NegativeInputException;

public class CustomValidationException
{
   public static void main(String[] args) 
   {
	        try {
	            checkPositive(10);
	            checkPositive(-5);
	             }
	        catch (NegativeInputException e) 
	        {
	            System.out.println(e.getMessage());
	        }
   }
   public static void checkPositive(int number) throws NegativeInputException
   {
	        if (number < 0) 
	        {
	            throw new NegativeInputException("Input is negative: " + number);
	        } 
	        else 
	        {
	            System.out.println("Input is positive: " + number);
	        }
    }
    public static class NegativeInputException extends Exception
    {
	        public NegativeInputException(String message)
	        {
	            super(message);
	        }
	    }
}
