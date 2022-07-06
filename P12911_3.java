public class P12911_3 {
	// Integer.bitCount : 비트로 변환했을 때 1의 갯수 반환
	class Solution {
	    public int solution(int n) {    	
	    	int n_num = Integer.bitCount(n);
	    		    	
	    	int k = n+1; // 이 숫자부터 조건에 맞나 확인
	    	
	    	while(true) {
		    	int k_num = Integer.bitCount(k);		    	
		    	
	    		if(n_num == k_num) {
	    			break;
	    		}
	    		
	    		k++;
	    	}
	        return k;
	    }
	}
}