public class P120956 {
	class Solution {
	    public int solution(String[] babbling) {
	        int answer = 0;
	        
	        String[] can = {"aya", "ye", "woo", "ma"};
	        
	        for(int i=0; i<babbling.length; i++) {
	        	String word = babbling[i];
	        	int now = 0;
	        	while(true) {
	        		word = word.replaceAll(can[now], "");
	        		if(word=="" || word.equals("") || word.isBlank()) {
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