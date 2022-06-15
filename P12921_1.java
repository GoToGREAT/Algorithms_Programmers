import java.util.ArrayList;
import java.util.List;

public class P12921_1 {
	class Solution { 
		// 동일한 시간 초과 오류
		public int solution(int n) {
			if(n==2) return 1;
			List<Integer> a = new ArrayList<>();			
	        
	        for(int i=n; i>0; i--){
	           for(int k=2; k<i; k++){
	               if(i%k==0){
	                   a.add(i);
	                   break;
	               }
	           }
	        }         
	        return n-1-a.size();
	    }
	}
}
