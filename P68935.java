
public class P68935 {
	class Solution {
	    public int solution(int n) {
	       String three = Integer.toString(n, 3);
	       String[] threearr = three.split("");
	       String threee = "";
	        for(int i=threearr.length-1; i>-1; i--) {
	        	threee += threearr[i];
	        }
	        return Integer.parseInt(threee,3);
	    }
	}
}
