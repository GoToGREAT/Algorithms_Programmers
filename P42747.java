import java.util.*;

// 해시셋을 벗어나지 못함.
public class P42747 {
	class Solution {
	    public int solution(int[] citations) {       
	        int number = citations.length;
	        
	        Arrays.sort(citations);
	        
	        Set<Integer> set = new HashSet<Integer>(Arrays.asList(citations));
	        Integer[] arr = set.toArray(new Integer[0]); // 논문 인용 횟수
	        
	        int c = arr.length;
	        
	        int[] count = new int[c]; // 논문 인용 횟수 별 해당 횟수 논문 편수
	        int[] num = new int[c]; // 해당 횟수 이상 논문 수
	        int q = 0;
	        
	        for(int i=0; i<citations.length; i++){
	            if(citations[i]==arr[q]) count[q] = count[q]+1;
	            else {
	                q++;
	                if(citations[i]==arr[q]) count[q] = count[q]+1;
	            }
	        }
	        
	        for(int i=1;  i<c; i++){
	            num[i] = number-num[i-1];
	            if(arr[i]==num[i]) return num[i];
	        }
	        return 0;
	    }
	}
}
