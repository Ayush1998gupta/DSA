package Questions2;

public class SpecialSumOfArrays {
	
	public static int digSum(int n)
    {
        int sum = 0;
 
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
	
	public static int sum(int arr[]) {
		
		int res=0;
		for (int i : arr) {
			res+=i;
		}
		
		int sum =digSum(res);
		
		return sum;
	}

	public static void main(String[] args) {
		int arr[]= {1,7,5,8,9,6};
		sum(arr);

	}

}
