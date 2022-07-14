package Questions2;

public class Sort_0_1_2 {
	public static void sort012(int arr[]){
		int low=0,mid=0,high=arr.length-1,temp=0;

		while(mid<=high) {
			switch (arr[mid]) {
			case 0:
//				If arr  of mid is equal to 0
//				than swap it with low
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			case 1:
//				do nothing
				 mid++;
				break;
			case 2:
//				If arr  of mid is equal to 2
//				than swap it with high
				temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
				break;

			}
		}

	}
	
	public static void main(String[] args) {
		System.out.println(18/10);
	}

}
