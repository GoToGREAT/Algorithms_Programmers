import java.util.*;

public class P42839_Test {
	public static void main(String[] args) {
		    String numbers = "011";
	    	int len = numbers.length();
	    	String[] str = new String[len];
	    	HashSet<Integer> set = new HashSet<>();
	    	boolean[] visited = new boolean[len];
	    	
	    	for(int i=0; i<len; i++) {
	    		str[i] = numbers.substring(i, i+1);	    		
	    	}
	    	
	    	for(int i=0; i<len; i++) {
	    		visited[i]=true;
	    		set.add(Integer.parseInt(str[i]));
	    		make(str[i], str, visited, len, set);
	    		visited[i]=false;
	    	}
	    	
	    	Iterator<Integer> iter = set.iterator();
	    	int count = 0;
	    	
	    	for(int i=0; i<set.size(); i++) {
	    		int now = iter.next();
	    		System.out.println("now : "+now);
	    		boolean check = false;
	    		for(int q=2; q<(now/2)+1; q++) {
	    			if(now%q==0) {
	    				check = true;
	    				break;
	    			}
	    		}
	    		if(now!=0 && now!=1 && !check) {
	    			count++;
	    			System.out.println("소수입니다.");
	    		}
	    	}
	       System.out.println("끝 : "+count);
	    }
	    
	    static void make(String input, String[] str, boolean[] visited, int len, HashSet<Integer> set) {
	    	for(int i=0; i<len; i++) {
	    		if(visited[i]==false) {
	    			String now = input+str[i];
	    			visited[i]=true;
	    			set.add(Integer.parseInt(now));
	    			make(now, str, visited, len, set);
	    			visited[i]=false;
	    		}
	    	}
	    }
}