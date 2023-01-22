// Unit 3, Module 3, Ex. 3.17

import java.util.*;

public class InsertionSortIdea {

    public static void main (String[] argv)
    {
	int[] testData = {51, 24, 63, 73, 42, 85, 71, 41, 87, 32};

	System.out.println ("Before: " + Arrays.toString(testData));

	int[] sortedData = insertionSort (testData);

	System.out.println ("After: " + Arrays.toString(sortedData));
    }

    static int[] insertionSort (int[] A)
    {
	int[] B = new int [A.length];

	for (int i=0; i < A.length; i++) {
	    
	    int posInB = i;
	    for (int j=0; j < i; j++) {
		if (B[j] < A[i]) {
		    
		}
		else {
		    posInB = j;
		    break;
		}
	    }

	    for (int j=i+1; j > posInB; j--) {
		if (j < B.length) {
		    B[j] = B[j-1];
		}
	    }

	    B[posInB] = A[i];

	} // end of out for loop

	return B;

    }
    
}
