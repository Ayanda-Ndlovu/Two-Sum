package prac;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
	
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
        int complement;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
        	complement = target - nums[i];
            if(map.containsKey(complement) == true) {
                result[0] = map.get(complement);
            	result[1] = i;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
			
		int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
        System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
	  }

}
