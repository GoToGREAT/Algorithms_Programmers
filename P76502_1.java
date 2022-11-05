/*
채점 결과
정확성: 28.6
합계: 28.6 / 100.0
*/
public class P76502_1 {
	class Solution {
	    public int solution(String s) {
	    	int answer = 0;
	    	
	    	if(s.length()%2 != 0) return 0;
	    	
	    	String now = s.substring(0);
	    	
	    	for(int i=0; i<s.length(); i++) {  			
    			
    			String that = now.substring(0);
    			
    			int n = 0;
    			
    			while(n<3) {	    				
    				that = that.replaceAll("\\(\\)", "");
    				that = that.replaceAll("\\[\\]", "");
    				that = that.replaceAll("\\{\\}", "");
    				n++;
    			}
    			
    			
    			if(that.replaceAll("", "").length()==0) answer++;
    			
    			now = now.substring(1) + now.charAt(0);
    		}    		    	  		    			    	
	        
	        return answer;
	    }
	}
}
