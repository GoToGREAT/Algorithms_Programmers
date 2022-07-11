
// lon과 shor을 long 변환 해준 것 뿐인데 통과 됨.
public class P62048_1 {	
	class Solution {
	 public long solution(int w, int h) {
		 	long lon = w>=h? (long)w : (long)h;
		 	long shor = w>=h? (long)h : (long)w;
		 
		 	long del = lon;
		 
		 	for(long i=1; i<lon; i++) {
		 		if(Math.ceil((double)shor*i/lon) != Math.ceil((double)shor*(i+1)/lon)
		 				&& Math.ceil((double)shor*(i)/lon) != Math.floor((double)shor*(i)/lon)
		 				) {
		 			del++;
		 		}
		 	}
	        return (long)(lon*shor-del);
	    }
	}
}