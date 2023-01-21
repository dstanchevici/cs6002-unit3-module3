// Unit 3, Module 3, Ex. 3.14

import java.util.*;

public class MyBubbleSort {

    public static void main (String[] argv)
    {
	int[] testData = {51, 24, 63, 73, 42, 85, 71, 41, 87, 32};

	System.out.println ("Before: " + Arrays.toString(testData));

	bubbleSort (testData);

	System.out.println ("After: " + Arrays.toString(testData));
    }

    static void bubbleSort (int[] A)
    {
	for (int i=0; i < A.length-1; i++) {
	    
	    for (int j=A.length-1; j>i; j--) {

		if (A[j] > A[j-1]) {
		    int temp = A[j];
		    A[j] = A[j-1];
		    A[j-1] = temp;
		}

	    }

	} // end of outer for loop
    } // end of bubbleSort()

}
