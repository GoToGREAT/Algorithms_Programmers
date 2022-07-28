public class P12924_Test {
	public static void main(String[] args) {
	        int n = 15;
	        int answer = 0;
	        
	        int start = 0;
	        int end = 0;
	        int sum = 0;
	        
	        while(true) {
	        	System.out.println("start : "+start+ " / end : "+end + " / sum : "+sum);
	        	if(sum<n) {
	        		start++;
	        		sum += start;
	        		System.out.println();
	        	} else if(sum == n) {
	        		answer ++;
	        		start++;
	        		sum += start;
	        	} else if(sum>n) {
	        		end++;
	        		sum-=end;
	        	}
	        	if(start>n) break;
	        }	
	       System.out.println("결과 : "+answer);
	
	}
}