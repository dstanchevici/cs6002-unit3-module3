// Unit 3, Module 3, Ex. 3.21

import java.util.*;

public class MyInsertionSort {

    public static void main (String[] argv)
    {
	int[] testData = {51, 24, 63, 73, 42, 85, 71, 41, 87, 32};

	System.out.println ("Before: " + Arrays.toString(testData));

	insertionSort (testData);

	System.out.println ("After: " + Arrays.toString(testData));
    }

    static void insertionSort (int[] A)
    {
	for (int i=0; i < A.length; i++) {
	    
	    int j = i;

	    while ( (j > 0) && (A[j] < A[j-1]) ) {
		int temp = A[j];
		A[j] = A[j-1];
		A[j-1] = temp;
		j --;
	    }
	} 

    }
    
}
