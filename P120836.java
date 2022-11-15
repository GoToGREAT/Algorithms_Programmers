
public class P120836 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        for(int i=1; i<=Math.sqrt(n); i++) {
	        	if(n%i==0) {
	        		answer += 1;
	        		if(i*i != n) answer += 1;
	        	}
	        }	        
	        return answer;
	    }
	}
}