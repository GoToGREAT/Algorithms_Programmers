import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P12932_1 {
	class Solution {
	    public int[] solution(long n) {
	        List<Long> ln = new ArrayList<>();
	        while(n>10 || n==10){
	            ln.add(n%10);
	            n = n/10;
	        }
	        ln.add(n);
	        
	        int[] answer = new int[ln.size()];        
	        for(int i=0; i<ln.size(); i++){
	            answer[i]= Integer.parseInt(ln.get(i).toString());
	        }
	        return answer;
	    }
	}
}
