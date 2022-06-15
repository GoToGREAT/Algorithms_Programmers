import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String s = null;
		
		List<Integer> flist = new ArrayList<>();
		flist.toArray();
		
		
		HashMap<Integer, String> map = new HashMap<>();
		char[] a = s.toCharArray();
		int[] sortorder = new int[a.length];
		for(int i=0; i<a.length; i++) {
			map.put((int)a[i], String.valueOf(a[i]));
			sortorder[i] = (int)a[i];					
		}
		Arrays.sort(sortorder);
		for(int i=sortorder.length; i>0; i--) {
			answer += map.get(sortorder[i]);
		}
		
		
		
	}
}
