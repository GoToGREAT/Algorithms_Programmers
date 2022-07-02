
public class P12977 {
	class Solution {
	    public int solution(int[] nums) {
	        int count = nums.length;
		     int answer = 0;
		    	for(int i=0; i<count-2; i++) {
		    		for(int k=i+1; k<count-1; k++) {
		    			for(int t=k+1; t<count; t++) {
		    				int sum = nums[i]+nums[k]+nums[t];
		    				int cnt = 0;
		    				for(int w=2; w<sum; w++) {
		    					int cut = sum%w;
		    					if(cut ==0) cnt++;
		    				}
		    				if(cnt == 0) {
		    					answer++;
		    				}	    				
		    			}
		    		}
		    	}
		        return answer;
	    }
	}
}
