public class P120912 {
	class Solution {
	    public int solution(int[] array) {
	        int answer = 0;
	        
	        for(int i=0; i<array.length; i++) {
	        	String now = Integer.toString(array[i]);
	        	answer += (now.length()-now.replaceAll("7", "").length());        	
	        }
	        
	        
	        return answer;
	    }
	}
}