
public class P12943_1 {
	class Solution {
	    public int solution(int num) {        
	        if(num==1) return 0;
	        long nnum = (long) num;
	        int answer = 0;
	        
	        while(nnum != 1){
	            ++answer;
	            if(nnum%2==0){
	                nnum = nnum/2;
	            } else {
	                nnum = nnum*3+1;
	            }
	            if(answer==500 || answer>500) return -1;
	        }       
	        return answer;
	    }
	}
}
