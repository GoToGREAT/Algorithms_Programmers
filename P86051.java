
public class P86051 {
	class Solution {
	    public int solution(int[] numbers) {
	        int answer = 0;
		        String number = "";
		        
		        for(int i=0; i<numbers.length; i++) {
		        	number += numbers[i];
		        }	        
		        for(int i=0; i<10; i++) {
		        	if(number.contains(Integer.toString(i)) == false) {
		        		answer += i;
		        	}
		        }       
	        return answer;
	    }
	}
}
