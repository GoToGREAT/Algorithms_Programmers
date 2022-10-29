/*
채점 결과
정확성: 60.0
합계: 60.0 / 100.0
 */

public class P133499 {
	class Solution {
	    public int solution(String[] babbling) {
	        int answer = 0;
	        
	        for(int i=0; i<babbling.length; i++) {
	        	String now = babbling[i];
	        	
	        	if(now.length() != now.replaceFirst("ayaaya", "").length()) continue;
	        	if(now.length() != now.replaceFirst("yeye", "").length()) continue;
	        	if(now.length() != now.replaceFirst("woowoo", "").length()) continue;
	        	if(now.length() != now.replaceFirst("mama", "").length()) continue;
	        	
	        	now = now.replaceAll("aya", "");	        	
	        	now = now.replaceAll("ye", "");
	        	now = now.replaceAll("woo", "");
	        	now = now.replaceAll("ma", "");
	        	
	        	if(now.length()==0) answer++;
	        }        
	        
	        return answer;
	    }
	}
}