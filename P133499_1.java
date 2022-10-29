/*
단어 삭제 과정에서 myea의 경우 ye 삭제, ma 삭제로 옹알이 가능 가능성이 있었음.
 */

public class P133499_1 {
	class Solution {
	    public int solution(String[] babbling) {
	        int answer = 0;
	        
	        for(int i=0; i<babbling.length; i++) {
	        	String now = babbling[i];
	        	
	        	if(now.length() != now.replaceFirst("ayaaya", "").length()) continue;
	        	if(now.length() != now.replaceFirst("yeye", "").length()) continue;
	        	if(now.length() != now.replaceFirst("woowoo", "").length()) continue;
	        	if(now.length() != now.replaceFirst("mama", "").length()) continue;
	        	
	        	now = now.replaceAll("aya", "Q");	        	
	        	now = now.replaceAll("ye", "Q");
	        	now = now.replaceAll("woo", "Q");
	        	now = now.replaceAll("ma", "Q");
	        	
	        	if(now.replaceAll("Q", "").length()==0) answer++;
	        }        
	        
	        return answer;
	    }
	}
}