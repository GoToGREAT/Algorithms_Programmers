import java.util.*;

public class P60057_1_Test {
	public static void main(String[] args) {
	        String s = "aabbaccc";
 	        int s_len = s.length();
	        
	        String[] s_arr = s.split("");
	        
	        PriorityQueue<Integer> queue = new PriorityQueue<>();
	        
	        for(int i=1; i<=s_len/2; i++) { // 자르는 단위
	        	int num=s_len;
	        	String[] arr = new String[s_len/i];
	        	for(int q=0; q<s_len/i; q++) { // 잘라진 갯수
	        		arr[q]="";	        		
	        	}
	        	for(int q=0; q<s_len/i*i; q++) { // 단위로 끊은 것
	        		arr[q/i] += s_arr[q];	        		
	        	}
	        	
	        	for(int q=0; q<arr.length; q++) {
	        		System.out.println(arr[q]);
	        	}
	        	
	        	
	        	boolean[] boo = new boolean[s_len/i-1];
	        	
	        	for(int q=0; q<boo.length; q++) { // 중복 확인
	        		boo[q] = arr[q].equals(arr[q+1]);		
	        	}
	        	
	        	
	        	for(int q=0; q<boo.length; q++) { // 글자 수 세기
	        		if(boo[q]) {
	        			if(q>0 && boo[q-1]) {
	        				num -= i;
	        			} else {
	        				num = num - i + 1;
	        			}
	        		}
	        	}	
	        	System.out.println(num);
	        	queue.add(num);	            	
	        }
	        System.out.println(queue.peek());
	    
	}
}
