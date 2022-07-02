import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P12932 {
	class Solution {
	    public int[] solution(long n) {
	    	// test는 통과하나 롱형을 인트형으로 변환하는 과정에서 ln에
	    	// 비정상 숫자가 들어가는 경우가 생김
	        List<Integer> ln = new ArrayList<>();
	        while(n>10 || n==10){
	            ln.add((int)n%10);
	            n = n/10;
	        }
	        ln.add((int)n);
	        
	        int[] answer = new int[ln.size()];        
	        for(int i=0; i<ln.size(); i++){
	            answer[i]= ln.get(i);
	        }
	        return answer;
	    }
	}
}
