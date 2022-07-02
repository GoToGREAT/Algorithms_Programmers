import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 완전 탐색 방법 : 오류 있음
public class P12952 {
	class Solution {
	    public int solution(int n) {
			ArrayList<Integer>  list = new ArrayList<>();
			for(int i=1; i<n+1;i++) {
				list.add(i);
			}
			
			List<Integer> finish = new ArrayList<>();
			Random random = new Random();
			
			int full = 1;
			
			for(int i=n; n>1; n--) {
				full = full*n;
			}
			
			while(true) {
				ArrayList<Integer> copy = (ArrayList<Integer>) list.clone();
				int input=0;
				
				while(true) {
					int a = random.nextInt(copy.size());
					input = input*10+copy.get(a);
					copy.remove(a);
					if(copy.size()==0) break;
				}
				if(!finish.contains(input)) {
					finish.add(input);
					continue;
				}
				if(finish.size()==full) {
					break;
				}
				if(finish.contains(input)) continue;
			}
			
			for(int i=full-1; i>-1; i--) {
				int out = finish.get(i);
				
				while(true) {
					if(Math.abs(out%10-(out/10%10))<2) {
						finish.remove(i);
						break;
					}
					out = out/10;
					if(out<10) break;
				}
			}
	        return finish.size();
	    }
	}
}
