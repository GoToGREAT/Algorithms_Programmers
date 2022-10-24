import java.util.*;

public class P120868_1 {
	class Solution {
	    public int solution(int[] sides) {
	        int answer = 0;
	        
	        Arrays.sort(sides);
	        
	        for(int i=1; i<=sides[1]; i++) {
	        	if(i+sides[0] > sides[1]) answer++;
	        }
	        
	        int can = sides[1]+1;
	        int sum = sides[0]+sides[1];
	        while(true) {
	        	if(sum > can) answer++;
	        	else break;
	        	can++;
	        }
	        
	        return answer;
	    }
	}
}