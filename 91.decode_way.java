public class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) 
            return 0;

        int[] res = new int[n + 1];
        res[n]  = 1;
        if (s.charAt(n - 1) != '0' )
            res[n - 1] = 1;
        else {
            res[n - 1] = 0;
        }

        for (int i = n - 2; i >= 0; i--)
            if (s.charAt(i) == '0') 
                continue;
            else {
                a = Integer.parseInt(s.substring(i, i + 2));
                if ( a <= 26) {
                    res[i] = res[i + 1] + res[i + 2]
                } else {
                    res[i] = res[i + 1];
                }

                return res[0];
            }
    }
}