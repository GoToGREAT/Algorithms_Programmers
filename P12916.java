public class P12916 {
	class Solution {
	    boolean solution(String s) {
	        char[] arrs = s.toCharArray();
	        int ynum = 0;
	        int pnum = 0;        
	        
	        for(int i=0; i<arrs.length; i++){
	            if(arrs[i]==89 || arrs[i]==121) ynum++;
	            else if(arrs[i]==80 || arrs[i]==112) pnum++;
	        }
	        
	        if(ynum==pnum) return true;
	        else return false;        
	    }
	}
}
