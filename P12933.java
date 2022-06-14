import java.util.ArrayList;
import java.util.List;

public class P12933 {
	class Solution {
		// 중간에 0이 들어있으면 오류 발생
	    public int[] solution(long n) {
	        List<Integer> ln = new ArrayList<>();
	        while(n>10 || n==10){
	            ln.add((int)n%10);
	            n = n/10;
	        }
	        ln.add((int)n);
	        
	        int[] answer = new int[ln.size()];        
	        for(int i=0; i<ln.size(); i++){
	            answer[i]=ln.get(i);
	        }
	        return answer;
	    }
	}
}
