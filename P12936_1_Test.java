import java.util.*;

public class P12936_1_Test {
	public static void main(String[] args) {
	    	int n = 3;
	    	long k = 5;
		
	    	int[] answer = new int[n];
	    	
	    	List<Integer> list = new ArrayList<>();
	    	for(int q=1; q<=n; q++) {
	    		list.add(q);
	    	}	    	
	    	
	    	long size = 1;
	    	for(int q=2; q<n; q++) {
	    		size *= q;
	    	}
	    	
	    	int end = n-1;
	    	for(int start=0; start<n; start++) {
	    		if(k<=1) {
	    			answer[start] = list.get(0);
	    			list.remove(0);
	    			continue;
	    		}
	    		int a = (int) (k/size);
	    		System.out.println("k/size : "+k+"/"+size+" = "+a);
	    		answer[start] = list.get(a);
	    		System.out.println("list.get(a) : "+list.get(a));
	    		k = k%size;
	    		System.out.println("k : "+k);
	    		list.remove(a);
	    		System.out.println("size : "+size);
	    		if(end!=0)size/=end;
	    		end--;
	    	}	
	    	
	    	for(int i=0; i<answer.length; i++) {
	    		System.out.println(answer[i]);
	    		}
	    	}
	    }
