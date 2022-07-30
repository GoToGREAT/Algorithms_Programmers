public class P81302_Test {
	public static void main(String[] args) {
			String[][] places = {{"OOPOO", "OPOOO", "OOOOO", "OOOOO", "OOOOO"},
								{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
								{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
								{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
								{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
	    	int[] answer = new int[5];	    	
	    	for(int i=0; i<5; i++) {	    		
	    		String[] now_arr = places[i];
	    		boolean rigth = false;
	    		for(int q=0; q<5; q++) {
	    			for(int w=0; w<5; w++) {
	    				if(now_arr[q].charAt(w)==80) {
	    					if(w+1<5 && now_arr[q].charAt(w+1)==80) {
	    						rigth = true;
	    						System.out.println("1번 오류 : q : "+q+" / w : "+w);
	    						break;
	    					} else if(w+2<5 && now_arr[q].charAt(w+1)!=88 && now_arr[q].charAt(w+2)==80) {
	    						rigth = true;
	    						System.out.println("2번 오류 : q : "+q+" / w : "+w);
	    						break;
	    					} else if(q+1<5 && now_arr[q+1].charAt(w)==80) {
	    						rigth = true;
	    						System.out.println("3번 오류 : q : "+q+" / w : "+w);
	    						break;
	    					} else if(q+2<5 && now_arr[q+1].charAt(w)!=88 && now_arr[q+2].charAt(w)==80) {
	    						rigth = true;
	    						System.out.println("4번 오류 : q : "+q+" / w : "+w);
	    						break;
	    					} else if(w+1<5 && now_arr[q].charAt(w+1)!=88
	    							&& q+1<5 && now_arr[q+1].charAt(w)!=88
	    							&& now_arr[q+1].charAt(w+1)==80) {
	    						rigth = true;
	    						System.out.println("5번 오류 : q : "+q+" / w : "+w);
	    						break;
	    					}
	    				}
	    			}
	    			if(rigth) break;
	    		}
	    		if(rigth) answer[i]= 0;
	    		else answer[i]=1;
	    		System.out.println("answer[i] : "+answer[i]);
	    	}	
	    
	
	}
}