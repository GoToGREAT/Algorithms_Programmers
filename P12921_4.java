import java.util.HashSet;

public class P12921_4 {
	class Solution { 
		// 이러면 정확성 테스트 통과 but 효율성은 안됨
		public int solution(int n) {
			if(n==2) return 1;
			HashSet<Integer> delnum = new HashSet<>();
			
			for(int i=2; i<Math.sqrt(n)||i==Math.sqrt(n); i++) {
				if(delnum.contains(i)) {
					continue;
				}
				for(int k=2; k<n/2 || k==n/2; k++) {					
				if(i*k>n) {	break; }						
				delnum.add(i*k);
					
				}
			}
			
			return n-1-delnum.size();
	    }
	}
}
