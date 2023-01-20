// Unit 3, Module 3, Ex. 3.11


import java.util.*;

public class MySelectionSort2 {

    public static void main (String[] argv)
    {
	int[] testData = makeRandomArray (10);

	System.out.println ("Before: " + Arrays.toString(testData));

	selectionSort (testData);

	System.out.println ("After: " + Arrays.toString(testData));
    }

    static void selectionSort (int[] A)
    {
	for (int i = A.length-1; i > 0; i--) {

	    int pos = i;

	    for (int j = i-1; j >= 0; j--) {
		if (A[j] > A[pos]) {
		    pos = j;
		}
	    }

	    //Swap
	    int temp = A[i];
	    A[i] = A[pos];
	    A[pos] = temp;

	} // end of outer loop
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
