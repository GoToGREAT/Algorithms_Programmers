public class P132267 {
	class Solution {
	    public int solution(int a, int b, int n) {
	        int answer = 0;
	        
	        while(true) {
	        	int plus = (n/a)*b;
	        	answer += plus;
	        	
	        	int now = n%a;
	        	n = now + plus;
	        	
	        	if(n<a) break;	        	
	        }	        
	        return answer;
	    }
	}
}