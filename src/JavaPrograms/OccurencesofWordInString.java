package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class OccurencesofWordInString {
	public static void main(String[] args) {
        String inputString = "Java is a widely used programming language. Java is versatile and has a large community.";

        String substring = "n";

        int count = countSubstringOccurrences(inputString.toLowerCase(), substring.toLowerCase());

        System.out.println("Number of occurrences of \"" + substring + "\": " + count);
    }

    private static int countSubstringOccurrences(String inputString, String substring) {
        int count = 0;
        int index = 0;
       
        while ((index = inputString.toLowerCase().indexOf(substring.toLowerCase(), index)) != -1) {
            count++;
            index += substring.length();
        }

        return count;
    }
}
