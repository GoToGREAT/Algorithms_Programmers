
public class P120836_Test {
	public static void main(String[] args) {
			int n = 20;
	        int answer = 0;
	        
	        for(int i=1; i<=Math.sqrt(n); i++) {
	        	if(n%i==0) {
	        		answer += 1;
	        		if(i*i != n) answer += 1;
	        		System.out.println(i+" : "+answer);
	        	}
	        }	        
	        System.out.println("끝 : "+answer);
	}
}
