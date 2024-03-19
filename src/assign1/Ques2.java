package assign1;

public class Ques2 {
	public static void main(String[] args) {
	        String input = "Hello, World!";
	        input = input.toLowerCase();
	        int vowels = 0;
	        int consonants = 0;
	        for(int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            // Check if the character is a letter
	            if((ch >= 'a' && ch <= 'z')) {
	                // Check if the character is a vowel
	                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }

	        System.out.println("Input String: " + input);
	        System.out.println("Number of vowels: " + vowels);
	        System.out.println("Number of consonants: " + consonants);
	    }
}
