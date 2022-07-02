import java.util.*;

public class P12945 {
	class Solution {
	    public int solution(int n) {        
			List<Integer> pibo = new ArrayList<>();
			pibo.add(0);
			pibo.add(1);
			
			for(int i=2; i<n+1; i++) {
				int sum = pibo.get(i-2)+pibo.get(i-1);
				pibo.add(sum%1234567);
			}
			return pibo.get(n);
			
	    }
	}
}
