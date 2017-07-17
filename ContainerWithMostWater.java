package LeetCode;

public class ContainerWithMostWater {

	public static int maxArea(int[] height) {

		int len = height.length, diff, max = 0, area = 0, maxHeightLef = 0, maxHeightRight = 0;
		int start = 0, end = len - 1;
		while (start < end) {

			if (height[start] <= height[end])
				max = height[start] * Math.abs(end - start);
			else
				max = height[end] * Math.abs(end - start);

			if (max > area)
				area = max;

			if (height[start] < height[end])
				start++;
			else if (height[start] >= height[end])
				end--;

		}

		return area;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1 };
		int res = maxArea(arr);
		System.out.println(res);
	}
}
