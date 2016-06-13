//Kaitlin MacNeill
//06/10/2016
//GC- BOOTCAMP

import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words;
		String vowel = "aeiou";

		String answer;

		do {
			System.out.println("Please enter a sentence to be translated:");
			String sentence = sc.nextLine();
			String sentlc = sentence.toLowerCase();
			words = sentlc.split(" ");

			char prefix = '0';
			char prefix2 = '0';
			boolean vowelfirst = false;
			boolean vowelsecond = false;
			
			
			for (int wordl = 0; wordl < words.length; wordl++) { // iterates
																	// operation
				prefix = words[wordl].charAt(0);
				int voweli = vowel.indexOf(prefix); // set up if start with									
				vowelfirst = (voweli >= 0); // convert to boolean for following
											// if else

				prefix2 = words[wordl].charAt(1);
				int voweli2 = vowel.indexOf(prefix2);
				vowelsecond = (voweli2 <= 0);												
			
				// iterates each word based on prior booleans to determine which
				// prints based on vowel first, one letter prefix or two letter
				// prefix
				//for (int x = 0; x < words.length; x++) {
					if (vowelfirst) {
						System.out.print(words[wordl] + "way \n");
					} else if (vowelsecond) {
						String base2 = words[wordl].substring(2);
						System.out.println(base2 + prefix + prefix2 + "ay ");
					} else {
						prefix = words[wordl].charAt(0);
						String base = words[wordl].substring(1);
						System.out.print(base + prefix + "ay ");
						System.out.println("\n");
					}
				//}
			}
			System.out.println("Would you like to continue? (y/n)");
			answer = sc.nextLine();

		} while (answer.equalsIgnoreCase("y"));

		sc.close();
	}
}
