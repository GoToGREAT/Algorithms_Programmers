import java.util.Arrays;

public class P42860 {
	class Solution {
	    public int solution(String name) {
	    	int A = 65;
	    	int Z = 90;
	    	
	    	int answer = 0;
	    	
	    	
	    	for(int i=0; i<name.length(); i++) {
	    		int current = name.charAt(i);
	    		
	    		int[] test = new int[2];
	    		test[0] = Math.abs(A-current);
	    		test[1] = Math.abs(Z-current)+1;
	    		Arrays.sort(test);
	    		answer+=test[0];
	    		
	    		if(i!=0 && i!=name.length()-1) answer++;
	    	}
	        return answer;
	    }
	}
}