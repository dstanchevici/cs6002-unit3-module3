
import java.util.*;

public class LargestAtBack {

    public static void main (String[] argv)
    {
        // Some test data (a subset of Java's reserved words).
	String[] reservedWords = {"if", "else", "while", "do", "return", 
				  "true", "false", "instanceof", "class"};
        
        System.out.println ( "Before: " + Arrays.toString(reservedWords) );

	largestAtBack (reservedWords);

        System.out.println ( "After: " + Arrays.toString(reservedWords) );
    }

    static void largestAtBack (String[] words)
    {
	int lastInd = words.length-1;
	String largest = words[lastInd];
	int pos = lastInd;

	for (int i = lastInd-1; i >= 0; i--) {
	    if ( words[i].compareTo (largest) > 0 ) {
		largest = words[i];
		pos = i;
	    }
	}

	String temp = words[lastInd];
	words[lastInd] = words[pos];
	words[pos] = temp;
    }
    
}
