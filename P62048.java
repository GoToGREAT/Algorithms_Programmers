//정확성: 66.7
//합계: 66.7 / 100.0

public class P62048 {	
	class Solution {
	 public long solution(int w, int h) {
		 	int lon = w>=h? w : h;
		 	int shor = w>=h? h : w;
		 
		 	long del = lon;
		 
		 	for(int i=1; i<lon; i++) {
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