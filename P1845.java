import java.util.*;

public class P1845 {
	class Solution {
	    public int solution(int[] nums) {
	        int answer = nums.length/2;
	        Set<Integer> set = new HashSet<Integer>();
	        for(int i=0; i<nums.length; i++) {
	        	set.add(nums[i]);
	        }
	        if(answer<set.size() || answer==set.size()) {
	        	return answer;
	        }   return set.size();
	    }
	}
}
