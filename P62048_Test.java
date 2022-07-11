public class P62048_Test {	
	public static void main(String[] args) {
		int w = 3;
		int h = 15233730;
				
		int lon = w>=h? w : h;
	 	int shor = w>=h? h : w;
	 
	 	long del = lon;
	 
	 	for(int i=1; i<lon; i++) {
	 		if(Math.ceil((double)shor*i/lon) != Math.ceil((double)shor*(i+1)/lon)
	 				&& Math.ceil((double)shor*(i)/lon) != Math.floor((double)shor*(i)/lon)
	 				) {
	 			del++;
	 			System.out.println("지금 한 칸 더 추가 : "+i);
	 		}
	 	}
	 	System.out.println("삭제 : "+(long)(del));
        System.out.println("남음 : "+(long)(lon*shor-del));
	}	
 }