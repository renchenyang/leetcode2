public class Solution {
	public int strStr(String haystack, String needle) {
		boolean flag=true;
		int diff=haystack.length() - needle.length() + 1;
		for (int i = 0; i < diff; i++) {
			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i+j) != needle.charAt(j)) {
					flag=false;
					break;
				}
			}
			if (flag==true) {
				return i;
			}
			flag=true;
		}
		return -1;
	}
}