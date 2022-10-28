import java.util.*;


public class P131705 {
	class Solution {
	    public int solution(int[] number) {
	        List<Boolean> list = new LinkedList<>();
	        
	        for(int i=0; i<number.length; i++) {
	        	Check(number, i+1, number[i], 1, list);
	        }
	        
	        
	        return list.size();
	    }
	    
	    void Check(int[] number, int now, int sum, int count, List<Boolean> list) {
	    	if(count==3 && sum == 0) {
	    		list.add(true);
	    	} else if(count==3) {
	    		
	    	} else {
	    		for(int i=now; i<number.length; i++) {
	    			Check(number, i+1, sum+number[i], count+1, list);
	    		}
	    	}
	    }
	}
}