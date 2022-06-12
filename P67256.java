import java.util.List;

public class P67256 { // 문제 진행 중
	class Solution {
	    public String solution(int[] numbers, String hand) {
	    	String answer = "";
	    	int a, b;
	    	String major;
	    	
	    	if(hand.equals("left")) major = "L";
	    	else major = "R";
	    	
	    	
	    	
	    	for(int i=0; i<numbers.length; i++) {
	    		if(numbers[i]== 1 || numbers[i]==5 ||numbers[i]==7) {
	    			answer += "L";
	    			a=numbers[i];
	    		} else if(numbers[i]== 3 || numbers[i]==6 ||numbers[i]==9) {
	    			answer += "R";
	    			b=numbers[i];
	    		} else if(numbers[i]== 2 || numbers[i]==5 ||numbers[i]==8 || numbers[i]==0) {
	    			if(i==0) {
	    				answer += major;
	    				if(major=="L") a=numbers[i];
	    				else b=numbers[i];
	    			} else if(numbers[i]== 5) {
	    			}
	    		}
	    	}	    	
	        return answer;
	    }
	}
}
