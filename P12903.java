
public class P12903 {
	class Solution {
	    public String solution(String s) {
	        char[] a = s.toCharArray();
	        String answer = "";
	        
	        if(s.length()%2==1) {
	            answer += a[(a.length-1)/2];
	        } else {
	            answer += a[a.length/2-1];
	            answer += a[a.length/2];
	        }
	        return answer;
	    }
	}
}
