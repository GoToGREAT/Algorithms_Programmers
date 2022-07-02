import java.util.ArrayList;
import java.util.List;

public class P12921_2 {
	class Solution { 
		// 이래도 시간 초과가 뜸
		public int solution(int n) {
			if(n==2) return 1;
			List<Integer> delnum = new ArrayList<>();
			
			for(int i=2; i<Math.sqrt(n)||i==Math.sqrt(n); i++) {
				for(int k=2; k<n/2 || k==n/2; k++) {
					if(!delnum.contains(i)) {
						if(i*k>n) {
							break;
						}
						if(!delnum.contains(i*k)) {
							delnum.add(i*k);
						}	
					}
				}
			}
			
			return n-1-delnum.size();
	    }
	}
}
