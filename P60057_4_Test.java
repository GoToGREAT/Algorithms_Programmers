import java.util.*;

/*
if(s_len == 1) return 1;
 
채점 결과
정확성: 94.0
합계: 94.0 / 100.0
*/

public class P60057_4_Test {
	public static void main(String[] args) {
			String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
	        int s_len = s.length();
	        if(s_len == 1) System.out.println(1);
	        else if(s_len == 2) System.out.println(2);
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
	        	
	        	boolean[] boo = new boolean[s_len/i-1];
	        	
	        	for(int q=0; q<boo.length; q++) { // 중복 확인
	        		boo[q] = arr[q].equals(arr[q+1]);		
	        	}
	        	
	        	int cnt =0;
	        		        	
	        	for(int q=0; q<boo.length; q++) { // 글자 수 세기
	        		if(boo[q]) {
	        			cnt++;
	        			if(q>0 && boo[q-1]) {
	        				num -= i;
	        			} else {
	        				num = num - i + 1;
	        			}
	        		}
	        		 else {
		        			if(cnt>=9) {
		        				System.out.println(cnt);
		        				num+=1;
		        			} else if(cnt>=99) {
		        				System.out.println(cnt);
		        				num+=2;
		        			} else if(cnt>=999) {
		        				System.out.println(cnt);
		        				num+=3;
		        			} cnt =0;
		        		}
	        	}
	        	if(cnt>=999) {
    				System.out.println("cnt : "+cnt);
    				num+=3;
    			} else if(cnt>=99) {
    				System.out.println("cnt : "+cnt);
    				num+=2;
    			} else if(cnt>=9) {
    				System.out.println("cnt : "+cnt);
    				num+=1;
    			}
	        	queue.add(num);	            	
	        }
	      
	        System.out.println(queue.peek());
	}
}
