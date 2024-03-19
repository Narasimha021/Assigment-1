package assign1;

public class Assign1 {
	public static void main(String[] args) {
		String originalString = "Hello, World!";
        int index = 7; 
        char replacementChar = 'T';
        if(index >= 0 && index < originalString.length()) {
            String modifiedString = originalString.substring(0, index) + replacementChar + originalString.substring(index + 1);
            System.out.println("Original String: " + originalString);
            System.out.println("Modified String: " + modifiedString);
        } 
        else {
            System.out.println("Index is out of  range");
        }
    }
}
