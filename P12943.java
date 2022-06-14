
public class P12943 {
	class Solution {
		// num의 max값이 들어왔고, 홀수 일 경우 인트의 오버플로우 발생
	    public int solution(int num) {        
	        if(num==1) return 0;
	        int answer = 0;
	        
	        while(num != 1){
	            ++answer;
	            if(num%2==0){
	                num = num/2;
	            } else {
	                num = num*3+1;
	            }
	            if(answer==500 || answer>500) return -1;
	        }       
	        return answer;
	    }
	}
}
