// Unit 3, Module 3, Ex. 3.4

import java.util.*;

public class FindStringExtremes {

    static int smallestInd, largestInd;

    public static void main (String[] argv)
    {
	String[] reservedWords = {"if", "else", "while", "do", "return", "true", "false", "instanceof", "class"};

	String smallest = findSmallest (reservedWords);
	String largest = findLargest (reservedWords);

	System.out.print ("Smallest=\"" + smallest + "\" in position=" + smallestInd);
	System.out.print (", largest=\"" + largest + "\" in position=" + largestInd);
	System.out.println (" in array " + Arrays.toString (reservedWords));
    }

    static String findSmallest (String[] words) 
    {
	smallestInd = 0;
	String smallest = words[0];
	for (int i=1; i < words.length; i++) {
	    if ( words[i].compareTo (smallest) < 0 ) {
		smallestInd = i;
		smallest = words[i];
	    }
	}

	return smallest;
    }

    static String findLargest (String[] words)
    {
	largestInd = 0;
	String largest = words[0];
	for (int i=1; i < words.length; i++) {
	    if ( words[i].compareTo (largest) > 0 ) {
		largestInd = i;
		largest = words[i];
	    }
	}

	return largest;
    }
}
