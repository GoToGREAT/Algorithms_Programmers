
public class P70129 {
	class Solution {
	    public int[] solution(String s) {
	    	int del = 0;
	    	int cnt = 0;
	    	while(true) {
	    		cnt++;
	    		String s_now = s.replaceAll("0", "");
	    		del += s.length()-s_now.length();
	    		if(s_now.equals("1")) break;
	    		s = Integer.toBinaryString(s_now.length());	    		
	    	}
	    	
	        int[] answer = {cnt, del};
	        return answer;
	    }
	}
}
