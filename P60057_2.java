import java.util.*;

/*
 중복된 숫자가 10이상이면 숫자가 늘어난다.
 
 채점 결과
정확성: 86.0
합계: 86.0 / 100.0
*/

public class P60057_2 {
	class Solution {
	    public int solution(String s) {	        
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
	        	
	        	boolean[] boo = new boolean[s_len/i-1];
	        	
	        	for(int q=0; q<boo.length; q++) { // 중복 확인
	        		boo[q] = arr[q].equals(arr[q+1]);		
	        	}
	        	
	        	int cnt =0;
	        	
	        	for(int q=0; q<boo.length-1; q++) {
	        		if(boo[q] && boo[q+1]) {
	        			cnt++;
	        		} else {
	        			if(cnt>=8) {
	        				num+=1;
	        			} else if(cnt>=98) {
	        				num+=2;
	        			} else if(cnt>=998) {
	        				num+=3;
	        			} cnt =0;
	        		}
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
	        	queue.add(num);	            	
	        }
	        return queue.peek();
	    }
	}
}
