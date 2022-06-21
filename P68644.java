package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P68644 {
//	public static void main(String[] args) {
//		int[] input = {2,1,3,4,1};
//		Solutiona s  = new Solutiona();
//		int[] output = s.solution(input);
//		
//		for(int i=0; i<output.length; i++) {
//			System.out.println(output[i]);
//		}	
//	}
	
}

class Solutiona {
	public int[] solution(int[] numbers) {
		List<Integer> re = new ArrayList<>();        
		
		for(int i=0; i<numbers.length; i++){
			for(int k=i+1; k<numbers.length; k++){
				int a = numbers[i]+numbers[k];
				if(!re.contains(a)) re.add(a);
			}
		}
		
		int[] answer = new int[re.size()];
		for(int i=0; i<re.size(); i++){
			answer[i] = re.get(i);
		}       
		
		Arrays.sort(answer);
		
		return answer;
	}
}