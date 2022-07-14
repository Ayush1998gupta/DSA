package Questions2;


public class SecondLargest {
	
	public static int secondLargest(int arr[]) {
		int firstLargest, secondLargest;
		  
        /* There should be atleast two elements */
        if (arr.length ==0) {
            return Integer.MIN_VALUE;
        }
  
        firstLargest = secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            /* If current element is greater than 
            first then update both first and second */
            if (arr[i] > firstLargest) {
            	secondLargest = firstLargest;
                firstLargest = arr[i];
            }
  
            /* If arr[i] is in between first and 
               second then update second  */
            else if (arr[i] > secondLargest && arr[i] != firstLargest)
            	secondLargest = arr[i];
        }

           return secondLargest;
	}

	public static void main(String[] args) {
		int []arr= {2,6,3,1,5,9,8};
		
		System.out.println(secondLargest(arr));
		
	}

}
