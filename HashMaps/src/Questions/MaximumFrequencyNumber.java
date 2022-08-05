package Questions;

import java.util.Collections;
import java.util.HashMap;

public class MaximumFrequencyNumber {
	
	public static int maxFrequencyNumber(int [] arr) {
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		
		for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		
		int maxValueInMap=(Collections.max(map.values()));
		
		
		return maxValueInMap;
	}
	

}
