public class Solution {
	public String countAndSay(int n) {
		StringBuffer s = new StringBuffer("1");
		for (int h = 0; h < n-1; h++) {
		    StringBuffer s2 = new StringBuffer();
			for (int i = 0; i < s.length(); ) {
				int j;
				for (j = 0; i + j < s.length(); j++) {
					if (s.charAt(i) != s.charAt(i + j)) {
						break;
					}
				}
				s2.append(j);
				s2.append(s.charAt(i));
				i = i + j;
			}
			s = s2;
		}
		return s.toString();
	}
}