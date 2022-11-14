
public class P120849 {
	class Solution {
	    public String solution(String my_string) {
	        
	        String[] now = {"a", "e", "i", "o", "u"};
	        
	        for(int i=0; i<5; i++){
	            my_string = my_string.replaceAll(now[i], "");
	        }
	        
	        return my_string;
	    }
	}
}
