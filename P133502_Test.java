import java.util.*;
import java.util.stream.*;

public class P133502_Test {
	public static void main(String[] args) {
			int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
	        int answer = 0;
	        
	        List<Integer> list = Arrays.stream(ingredient).boxed().collect(Collectors.toList());
	       
	        
	        int start = 0;
	        
	        while(true) {	        	
	        	if(start == list.size()-3) break;
	        	
	        	System.out.println("돌아갑니다 : "+start);
	        	
	        	for(int i=0; i<list.size(); i++) {
        			System.out.print(list.get(i)+" ");
        		}
	        	System.out.println();
	        	if(list.get(start)==1 && list.get(start+1)==2
	        			&& list.get(start+2)==3 && list.get(start+3)==1) {
	        		answer++;
	        		System.out.println("삭제합니다");
	        		list.remove(start+3);
	        		list.remove(start+2);
	        		list.remove(start+1);	        		
	        		list.remove(start);
	        		
	        		if(list.size()<4) break;
	        		
	        		start=0;
	        	} else {
	        		start++;
	        	}
	        }
	        
	        System.out.println("끝났습니다 : "+answer);
	}
}