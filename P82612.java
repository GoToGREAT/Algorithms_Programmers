public class P82612 {
	class Solution {
	    public long solution(int price, int money, int count) {
	        long Amount = 0;
	        long p = Long.valueOf(price);
	        
	        for(int i=0; i<count; i++){
	            Amount += p+p*i;
	        }
	        long answer = Long.valueOf(money)-Amount;
	        if(answer<0){
	             return answer*(-1);
	        } else {
	             return 0;
	        }
	    }
	}
}
