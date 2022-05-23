import java.util.ArrayList;
import java.util.List;

public class P67256 { // 문제 진행 중
	class Solution {
	    public String solution(int[] numbers, String hand) {
	    	int right = 0;
	    	int left = 0;	
	    	String answer = "";
	    	
	    	List<int[]> coordinate2 = new ArrayList<>();
	    	List<int[]> coordinate5 = new ArrayList<>();
	    	List<int[]> coordinate8 = new ArrayList<>();
	    	int[] coordinate;
	    		    	
	    	for(int i=0; i<numbers.length; i++) {
	    		if(numbers[i]==1 | numbers[i]==4 | numbers[i]==7) {
	    			answer +="L";
	    			left = numbers[i];
	    		} else if(numbers[i]==3 | numbers[i]==6 | numbers[i]==9) {
	    			answer +="R";
	    			right = numbers[i];
	    		} else {
	    			int lefta = numbers[i]-left;
	    			int righta = numbers[i]-right;
	    			if(lefta<0) lefta = -lefta;
	    			if(righta<0) righta = - righta;
	    			
	    			if() 
	    			
	    			if(lefta<righta) {
	    				answer +="L";
		    			left = numbers[i];
	    			} else if (lefta>righta) {
	    				answer +="R";
		    			right = numbers[i];
	    			} else {
	    				if(hand.equals("right")) {
	    					answer +="R";
			    			right = numbers[i];	
	    				} else {
	    					answer +="L";
			    			left = numbers[i];
	    				}	    					
	    			}	    			
	    		}	    		
	    	}	    	
	        return answer;
	    }
	}
}
