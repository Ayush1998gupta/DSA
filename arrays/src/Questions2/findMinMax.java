package Questions2;
import java.util.Arrays;


public class findMinMax {
	

    public static double average(int[] salary) {
        
        Arrays.sort(salary);
        int noOfElements=salary.length-2;
        double sum=0.0;
        
        for(int i=1;i<salary.length-1;i++){
            sum+=salary[i];
        }
        return sum/noOfElements;
        
        
        
    }


	public static void main(String[] args) {
		int []arr= {4000,3000,1000,2000};
		System.out.println(average(arr));

	}

}
