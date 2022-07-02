import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P60057 {
	class Solution {
	    public int solution(String s) {			
	    	int slength = s.length();
	    	List<Integer> dirtn = new ArrayList<>();	    	
	    	
	    	for(int i=1; i<slength; i++) {
	    		if(slength%i==0) dirtn.add(i);
	    	}
	    	
	    	int[] len = new int[dirtn.size()];
	    	
	    	String[] sarr = s.split("");
	    	
	    	for(int i=0; i<dirtn.size(); i++) {
	    		int b = dirtn.get(i); // 자르는 단위
	    		int c = slength/dirtn.get(i); // 조각 단위
	    		String[] pice = new String[c];
	    		for(int q=0; q<c; q++) { // pice 안에 각 잘라진 조각 넣기
	    			pice[q] = "";
	    			for(int z=0; z<b; z++) {
	    				pice[q] += sarr[z+q*b];
	    				
	    			} 
	    		
	    		}
	    		
	    		
	    		List<Boolean> boo = new ArrayList<>();
	    		boo.add(false);
	    		for(int q=0; q<c-1; q++) { // 반복되는지 확인
	    			boo.add(pice[q].equals(pice[q+1]));
	    		
	    		}
	    		boo.add(false);
	    		for(int q=0; q<boo.size()-1; q++) {
	    			if(boo.get(q)==true && boo.get(q+1)==false) {
	    				len[i] += 1+b;
	    				
	    			} else if(boo.get(q)==false && boo.get(q+1)==false) {
	    				len[i] += b;
	    				
	    			}
	    		}
	    		
	    	}
	    	Arrays.sort(len);
	        return len[0];
	    }
	}
}
