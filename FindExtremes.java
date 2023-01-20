// Unit 3, Module 3, Ex. 3.1.

import java.util.*;

public class FindExtremes {

    static int smallestInd;
    static int largestInd;

    public static void main (String[] argv)
    {
	int[] testData = makeRandomArray (10);

	int smallest = findSmallest (testData);
	int largest = findLargest (testData);
	System.out.println ("Smallest=" + smallest + " at position=" + smallestInd + ", largest=" + largest + " at position=" + largestInd  + " in array " +Arrays.toString(testData));

    }

    static int findSmallest (int[] A)
    {
	smallestInd =0;
	int smallest = A[0];

	for (int i=1; i < A.length; i++) {
	    if (A[i] < smallest) {
		smallestInd = i;
		smallest = A[i];
	    }
	}
	
	return smallest;
    }

    static int findLargest (int[] A)
    {
	largestInd = 0;
	int largest = A[0];

	for (int i=1; i < A.length; i++) {
	    if (A[i] > largest) {
		largestInd = i;
		largest = A[i];
	    }
	}
	
	return largest;
    }

    static int[] makeRandomArray (int length)
    {
	int[] A = new int [length];

	for (int i=0; i < A.length; i++) {
	    A[i] = RandTool.uniform (1, 100);
	}

	return A;
    }

    
}
