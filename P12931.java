public class P12931 {
	public class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        if(n<10) return n;
	        while(n>9){
	            answer += n%10;
	            n = n/10;
	        }
	        answer += n;
	        return answer;
	    }
	}
}
