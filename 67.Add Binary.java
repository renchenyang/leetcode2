public class Solution {
	public String addBinary(String a, String b) {
		int c = 0, sum = 0, a1, b1;
		if (b.length() > a.length()) {
			return addBinary(b, a);
		}
		StringBuffer result=new StringBuffer();
		for (int i = 1; i <= b.length(); i++) {
			char a2 = a.charAt(a.length() - i);
			char b2 = b.charAt(b.length() - i);
			a1= (a2 == '1') ? 1: 0;
			b1= (b2 == '1') ? 1: 0;
			sum = (a1 + b1 +c)%2;
			c = (a1 + b1 +c)/2;
			String bit = (sum % 2 == 0) ? "0" : "1";
			result.append(bit);
		}
		
		for (int i = b.length()+1; i <= a.length(); i++) {
			char a2 = a.charAt(a.length() - i);
			a1= (a2 == '1') ? 1: 0;
			sum = (a1 +c)%2;
			c = (a1 + c)/2;
			String bit = (sum % 2 == 0) ? "0" : "1";
			result.append(bit);
		}
		if(c!=0)
		{
			result.append("1");
		}
		return result.reverse().toString();
	}
}