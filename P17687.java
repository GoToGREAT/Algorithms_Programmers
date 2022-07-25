public class P17687 {
	class Solution {
		// n:진법 t: 필요개수 m: 인원 p는 순서
	    public String solution(int n, int t, int m, int p) {
	        String total = "";
	        
	        int start = 1;
	        
	        while(total.length() <= t*m){
	        	total += Integer.toString(start++, n);
	        }
	        
	    	String answer = "";
	    	
	    	int now = p-1;
	    	while(answer.length()<=t) {
	    		answer += total.charAt(now);
	    		now += m;
	    	}	   	
	        return answer;
	    }
	}
}