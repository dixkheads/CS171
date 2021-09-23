package randomJunk;

public class Test 
{
	//example 1 
	/* Returns the sum of the integers in given array.*/ 
	public static int example1(int[] arr) { 
		int test = 0;
	    int n = arr.length, total = 0; 
	    for (int j = 0; j < n; j++) 
	        //total += arr[j]; 
	    	test++;
	    return test; 
	} 
	 
	//example 2 
	// Returns the sum of the integers with even index in given array. 
	public static int example2(int[] arr) { 
		int test = 0;
	    int n = arr.length, total = 0; 
	    for (int j = 0; j < n; j += 2) 
	        //total += arr[j]; 
	    	test++;
	    return test; 
	} 
	 
	//example 3 
	//Returns the sum of the prefix sums of given array. 
	public static int example3(int[] arr) {
		int test = 0;
	    int n = arr.length, total = 0; 
	    for (int j = 0; j < n; j++) 
	        for (int k = 0; k <= j; k++) 
	            //total += arr[j]; 
	    		test++;
	    return test; 
	} 
	 
	//example 4 
	//Returns the sum of the prefix sums of given array. 
	public static int example4(int[] arr) { 
		int test = 0;
	    int n = arr.length, prefix = 0, total = 0; 
	    for (int j = 0; j < n; j++) { 
	        //prefix += arr[j]; 
	        //total += prefix; 
	        test++;
	    } 
	    return test; 
	 
	} 
	 
	//example 5 
	//Returns the number of times second array stores sum of prefix sums from first. 
	public static int example5(int[] first, int[] second) { // assume equal-length arrays 
		int test = 0;
	    int n = first.length, count = 0; 
	    for (int i = 0; i < n; i++) { 
	        int total = 0; 
	        for (int j = 0; j < n; j++) 
	            for (int k = 0; k <= j; k++) //total += first[k]; 
	        		test++;
	        if (second[i] == total) count++; 
	    } 
	    return test; 
	}
	
	public static void main(String[] args)
	{
		int[] sample = new int[] {1,1,1,1,1,1,1,1,1,1};
		int[] sample2 = new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		
		System.out.println(example1(sample));
		System.out.println(example2(sample));
		System.out.println(example3(sample));
		System.out.println(example4(sample));
		System.out.println(example5(sample, sample2));
	}
}
