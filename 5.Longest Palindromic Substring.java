public class Solution {
    public String longestPalindrome(String s) {
        int max = 0, n = 0, max2 = -1, n2 = 0;
        
        if (s.length() == 0) {
            return "";
        }
        for (int i = 0; i < s.length(); i++) {
            int j = 1;
            for (; i - j >= 0 && i + j < s.length(); j++) {
                if (s.charAt(i - j) != s.charAt(i + j)) {
                    break;
                }
            }
            if (j > max) {
                n = i;
                max = j;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            boolean flag=false;
            for (; i - j >= 0 && i + 1 + j < s.length(); j++) {
                flag=true;
                if (s.charAt(i - j) != s.charAt(i +1 + j)) {
                    break;
                }
            }
            j--;
            if (j > max2 &&flag==true) {
                n2 = i;
                max2 = j;
            }
        }
        if (2 * max - 1 > max2 * 2 + 2) {
            return s.substring(n - max + 1, n + max);
        } else {
            return s.substring(n2 - max2, n2 + max2 + 2);
        }
    }
}