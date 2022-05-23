
public class P77484 {
	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	    	int count_z = 0;
	    	for(int i=0; i<lottos.length; i++) {
	    		if(lottos[i] == 0) count_z++;	    		
	    	}
	    	
	       if(count_z == 6) {
	        	 int[] answer = {1, 6};
	        	return answer;
	        }
	        
	        int count_s = 0;
	        for(int i=0; i<lottos.length; i++) {
	        	for(int k=0; k<win_nums.length; k++) {
	        		if(lottos[i] == win_nums[k]) count_s++;
	        	}
	        }      
	        
	        int row=7-count_s;
	        if(row==7) row=6;
	        int max = row-count_z;
	        if(max==0) max=1;
	        int[] answer = {max, row};
 	        
	        return answer;
	    }
	}
}
