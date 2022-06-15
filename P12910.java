import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class P12910 {
	class Solution {
	    public int[] solution(int[] arr, int divisor) {        
	        List<Integer> flist = new ArrayList<>();
	        
	        for(int i=0; i<arr.length; i++){
	            if(arr[i]%divisor==0) flist.add(arr[i]);                
	        }
	        
	        if(flist.size()==0){
	            int[] a = {-1};
	            return a;
	        }
	        
	        Collections.sort(flist);
	        
	        int[] answer = new int[flist.size()];
	        
	        for(int i=0; i<flist.size(); i++){
	            answer[i] = flist.get(i);
	        }
	        
	        return answer;
	    }
	}
}
