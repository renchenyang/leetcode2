public class Solution {
	public int trap(int[] height) {
		int[] height2 = new int[height.length];
		int sum = 0, sum2 = 0;
		for (int i = 0; i < height.length; i++) {
			sum += height[i];
			height2[i] = height[i];
		}
		for (int i = 0; i < height.length; i++) {
			for (int j = i+1; j < height.length; j++) {
				if (height2[i] <= height2[j]) {
					for (int k = i+1; k < j; k++) {
						height2[k]=height2[i];
					}
					i = j-1;
					break;
				}
			}
		}
		for (int i = height.length-1; i >=0; i--) {
			for (int j = i-1; j >=0; j--) {
				if (height2[i] <= height2[j]) {
					for (int k = i-1; k > j; k--) {
						height2[k]=height2[i];
					}
					i = j+1;
					break;
				}
			}
		}
		for (int i = 0; i < height.length; i++) {
			sum2 += height2[i];
		}
		return sum2-sum;
	}
}