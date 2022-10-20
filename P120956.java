public class P120956 {
	class Solution {
	    public int solution(String[] babbling) {
	        int answer = 0;
	        
	        String[] can = {"aya", "ye", "woo", "ma"};
	        
	        for(int i=0; i<babbling.length; i++) {
	        	String word = babbling[i];
	        	int now = 0;
	        	while(true) {
	        		int a = word.indexOf(can[now]);
	        		int b = word.replaceFirst(can[now], "").indexOf(can[now]);
	        		if(a-b == 0 && a != -1) break;
	        		
	        		word = word.replaceAll(can[now], "");
	        		if(word.isBlank()) {
	        			answer++;
	        			break;
	        		}
	        		now++;
	        		if(now>=4) break;
	        	}
	        }
	        
	        return answer;
	    }
	}
}