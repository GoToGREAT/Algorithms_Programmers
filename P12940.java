
public class P12940 {
	class Solution {
		// 이번 건 좀 잘 푼 듯
		public int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        answer[0] = 1;
	        int max = n>m? n : m;
	        
	        for(int i=max; i>0; i--){
	            if(n%i==0 && m%i==0){
	                answer[0] = i;
	                break;
	            }
	        } 
	        
	        if(answer[0]==1){
	            answer[1]=n*m;
	        } else {
	            answer[1]=n*m/answer[0];
	        }     
	        
	        return answer;
	    }
	}
}
