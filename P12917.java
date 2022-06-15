import java.util.Arrays;
import java.util.HashMap;

public class P12917 {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        HashMap<Integer, String> map = new HashMap<>();
	        
			char[] a = s.toCharArray();
			int[] sortorder = new int[a.length];
			for(int i=0; i<a.length; i++) {
				map.put((int)a[i], String.valueOf(a[i]));
				sortorder[i] = (int)a[i];					
			}
			Arrays.sort(sortorder);
			for(int i=sortorder.length-1; i>-1; i--) {
				answer += map.get(sortorder[i]);
			}
	        return answer;
	    }
	}
}
