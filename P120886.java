
/*채점 결과

*/
public class P120886 {
	class Solution {
	    public int solution(String before, String after) {
	    	for(int i=0; i<before.length(); i++) {
	    		if(after.equals(after.replaceFirst(String.valueOf(before.indexOf(i)), ""))) {
	    			return 0;
	    		} else after = after.replaceFirst(String.valueOf(before.indexOf(i)), "");
	    	}
	        return 1; 
	    }
	}
}