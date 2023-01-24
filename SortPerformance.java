
public class SortPerformance {

    public static void main (String[] argv)
    {
        int size = 10000;

        int[] A = makeRandomArray (size);

        long startTime = System.currentTimeMillis ();
        selectionSort (A);
        long timeTaken = System.currentTimeMillis () - startTime;
        System.out.println ("Selection sort time: " + timeTaken);

        A = makeRandomArray (size);

	// Bubble
        startTime = System.currentTimeMillis ();
	bubbleSort (A);
	System.out.println ("Bubble sort time: " + (System.currentTimeMillis() - startTime));

        A = makeRandomArray (size);

	// Insertion
        startTime = System.currentTimeMillis ();
	insertionSort (A);
	System.out.println ("Insertion sort time: " + (System.currentTimeMillis() - startTime));


        A = makeRandomArray (size);

        // Quicksort
        startTime = System.currentTimeMillis ();
        quickSort (A);
        timeTaken = System.currentTimeMillis () - startTime;
        System.out.println ("Quick sort time: " + timeTaken);
    }
    
    static void selectionSort (int[] A)
    {
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

	// System.out.println ("Bubble: count=" + count);
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

	// System.out.println ("Insertion: count=" + count);
    }


    
    static void quickSort (int[] A)
    {
        quickSortRecursive (A, 0, A.length-1);
    }
    

    static void quickSortRecursive (int[] data, int left, int right)
    {
        if (left < right) {
            // Partition to find the "right place" for the leftmost element.
            int partitionPosition = quickSortPartition (data, left, right);
            // Recurse on the left side:
            quickSortRecursive (data, left, partitionPosition-1);
            // Recurse on the right side:
            quickSortRecursive (data, partitionPosition+1, right);
        }
        // Else: left==right so we're done.
    }


    static int quickSortPartition (int[] data, int left, int right)
    {
        if (left == right)
            return left;
        int partitionElement = data[right];
        int currentSwapPosition = right; 
        for (int i=right-1; i>=left; i--) {
            // Examine everything between left and right-1 inclusive.
            if (data[i] > partitionElement) {
                // Switch with swap position
                currentSwapPosition--;
                swap (data, currentSwapPosition, i);
                // Shift swap position rightwards:
            }
        }
        // Last one:
        swap (data, currentSwapPosition, right);
        return currentSwapPosition;
    }


    static void swap (int[] data, int i, int j)
    {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }


    static int[] makeRandomArray (int length)
    {
        int[] A = new int [length];

	for (int i=0; i<A.length; i++) {
	    A[i] = RandTool.uniform (1, 100);
	}

        return A;
    }

}
