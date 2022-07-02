public class P12921 {
	class Solution {
		// 시간 초과 오류 발생
		//정확성: 62.5
		//효율성: 0.0
		//합계: 62.5 / 100.0
	    public int solution(int n) {
	        int answer = n-1;
	        if(n==2) return 1;       
	        
	        for(int i=n; i>0; i--){
	           for(int k=2; k<i; k++){
	               if(i%k==0){
	                   answer--;
	                   break;
	               }
	           }
	        }         
	        return answer;
	    }
	}
}
