import java.util.Arrays;

public class P12941 {
	class Solution
	{
	    public int solution(int []A, int []B)
	    {
	        Arrays.sort(A);
	        Arrays.sort(B);
	        
	        int answer = 0;
	        
	        int q = B.length-1;
	        
	        for(int i=0; i<A.length; i++){
	            answer += A[i]*B[q--];
	        }
	        return answer;
	    }
	}
}
