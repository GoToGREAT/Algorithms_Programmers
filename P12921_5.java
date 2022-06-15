import java.util.HashSet;

public class P12921_5 {
	class Solution { 
		// 해결했음 : 최대한 계산하는 것을 줄이기
		public int solution(int n) {
			if(n==2) return 1;
			HashSet<Integer> delnum = new HashSet<>();
			
			for(int i=2; i<Math.sqrt(n)||i==Math.sqrt(n); i++) {
				if(delnum.contains(i)) {
					continue;
				}
				for(int k=2; k<n/i || k==n/i; k++) {
				
				 if(!delnum.contains(i*k)) {
					System.out.println(i*k);
				   delnum.add(i*k);
				   }	
				}
			}				
			return n-1-delnum.size();
	    }
	}
}
