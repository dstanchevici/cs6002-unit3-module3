
public class SortTiming {

    public static void main (String[] argv)
    {
        int[] testData = makeRandomArray (100000);

	int[] C = copy (testData);
        long startTime = System.currentTimeMillis ();
	selectionSort (C);
	System.out.println ("Time taken by SelectionSort: " + (System.currentTimeMillis() - startTime));

	C = copy (testData);
        startTime = System.currentTimeMillis ();
	bubbleSort (C);
	System.out.println ("Time taken by BubbleSort: " + (System.currentTimeMillis() - startTime));

	C = copy (testData);
        startTime = System.currentTimeMillis ();
	insertionSort (C);
	System.out.println ("Time taken by InsertionSort: " + (System.currentTimeMillis() - startTime));
    }

    static void selectionSort (int[] A)
    {
	int count = 0;

        // We don't need to find the n-th smallest, so stop at n-1.
	for (int i=0; i<A.length-1; i++) {

	    // Find i-th smallest and swap.
	    int smallest = A[i];
	    int pos = i;

            // Look from i+1 and up.
	    for (int j=i+1; j<A.length; j++) {
		if (A[j] < smallest) {
		    smallest = A[j];
		    pos = j;
		}
	    }

	    // Swap into position i.
	    int temp = A[i];
	    A[i] = A[pos];
	    A[pos] = temp;

	}

	System.out.println ("Selection: count=" + count);
    }


    static void bubbleSort (int[] A)
    {
	int count = 0;

        // Each sweep, i=0...n-1, will put the i-th least element in place.
	for (int i=0; i<A.length-1; i++) {

            // Perform swaps from end-of-array down to i-th position.
	    for (int j=A.length-1; j>i; j--) {

		if (A[j] < A[j-1]) {
                    // Out of order: swap needed.
		    int temp = A[j];
		    A[j] = A[j-1];
		    A[j-1] = temp;
		}

	    }
	}

	System.out.println ("Bubble: count=" + count);
    }


    static void insertionSort (int[] A)
    {
	int count = 0;

	for (int i=0; i<A.length; i++) {

            // Find the right place for A[i].
            int j = i;

            while ( (j > 0) && (A[j] < A[j-1]) ) {
                // Swap until we stop.
                int temp = A[j];
                A[j] = A[j-1];
                A[j-1] = temp;
                j --;
            }
            
	}

	System.out.println ("Insertion: count=" + count);
    }
    

    static int[] makeRandomArray (int length)
    {
        int[] A = new int [length];

	for (int i=0; i<A.length; i++) {
	    A[i] = RandTool.uniform (1, 100);
	}

        return A;
    }

    static int[] copy (int[] A)
    {
	int[] B = new int [A.length];
	for (int i=0; i<A.length; i++) {
	    B[i] = A[i];
	}
	return B;
    }

}
