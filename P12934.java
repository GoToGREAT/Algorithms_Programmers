import java.util.ArrayList;
import java.util.List;

public class P12934 {
	class Solution {
	    public long solution(long n) {
	    	if(n<10) return n;
	    	List<Long> a = new ArrayList<>();
	    	while(n<10) {
	    		a.add(n%10);
	    		n = n/10;	    		
	    	}	    	
	        long answer = 0;
	        for(int i=0; i<a.size(); i++) {
	        	answer += answer+a.get(i)*(long)Math.pow(10, i); 
	        }
	        return answer;
	    }
	}
}
