public class P134240 {
	class Solution {
	    public String solution(int[] food) {
	    	
	    	StringBuilder build = new StringBuilder();
	    	
	    	for(int i=1; i<food.length; i++) {	    		
	    		for(int q=0; q<food[i]/2; q++) {
	    			build.append(i);
	    		}
	    	}
	        String answer = build.toString()+"0"+build.reverse().toString();
	        return answer;
	    }
	}
}