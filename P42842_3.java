
/*
(x-2)(y-2)==yellow
else 때문에 틀림

 */
public class P42842_3 {
	class Solution {
    public int[] solution(int brown, int yellow) {
    	int total = brown+yellow;
    	
    	double total_sqrt = Math.sqrt(total);
    	
    	int l1 = (int)Math.floor(total_sqrt);
    	int l2 = 0;  
    	
    	while(true) {
    		if(total%l1 == 0) {
    			l2 = total/l1;
    			if((l1-2)*(l2-2)==yellow) {
    				if(l1 >= l2) {
    					int[] answer = {l1, l2};
            	        return answer;
    				} else {
    					int[] answer = {l2, l1};
            	        return answer;
    				}    				
    			}  
    			 			
    		} 
    		l1++;
    	}
    	
     }
	}
 }
