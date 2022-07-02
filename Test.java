import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		int n = 5;
		ArrayList<Integer>  a = new ArrayList<>();
		ArrayList<Integer>  b = new ArrayList<>();
		for(int i=1; i<n+1;i++) {
			if(i%2==1) a.add(i);
			else b.add(i);
		}
		int cnt = 0;
		
		for(int q=0; q<a.size(); q++) {
			for(int w=0; w<b.size(); w++) {
				if(Math.abs(a.get(q)-b.get(w))>1) cnt++;
			}
		}
		
		int ax = 1;
		for(int i=a.size()-1; i>1; i--) {
			ax = ax*i;
		}
				
		int bx = 1;
		for(int i=b.size()-1; i>1; i--) {
			bx = bx*i;
		}
		System.out.println(cnt);
		System.out.println(ax+" / "+bx);
		System.out.println(cnt*bx*ax*2);
		
		
		
		
	}
}
