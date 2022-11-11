
public class P120844 {
	class Solution {
	    public int[] solution(int denum1, int num1, int denum2, int num2) {
	    	int mother = num1*num2;
	    	int son = denum1*num2 + denum2*num1;
	    	
	    	int min = mother >= son ? son : mother;
	    	
	    	for(int i=min; i>1; i--) {
	    		if(mother%i==0 && son%i==0) {
	    			mother = mother/i;
	    			son = son/i;
	    			break;
	    		}
	    	}
	    	
	    	
	    	
	        int[] answer = {son, mother};
	        return answer;
	    }
	}
}
