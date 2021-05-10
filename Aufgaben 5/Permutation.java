import java.util.Scanner;
import java.util.Stack;
public class Permutation {
	public static void main(String[] args) {
		System.out.println("Enter your word.");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		System.out.println("All possible permutations are:");
		permutateWord("",word);
		scanner.close();

	}
	
	public static void permutateWord(String firstLetters, String word) {
		if(word.length() == 0) {
			System.out.println(firstLetters);
		}
		else {
			for(int i = 0; i <= word.length()-1; i++) {
				String restOfWord = word.substring(0,i)+word.substring(i+1);
				permutateWord(firstLetters+word.charAt(i),restOfWord);
			}	
		}
	}
}
