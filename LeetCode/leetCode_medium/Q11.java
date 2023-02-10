package leetCode_medium;
/*11. Container With Most water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 height = [1,8,6,2,5,4,8,3,7]
 */
public class Q11 
{
	public static void main(String[] args) { 

		
		int[] height = {1,8,6,2,5,4,8,3,7};
		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;

		while (left < right)
		{
			if (height[left] > height[right])
			{
				if (maxArea < height[right]*(right - left))
				{
					maxArea = height[right]*(right - left);
				}
				right--;
			}
			else if (height[left] < height[right])
			{
				if (maxArea < height[left] * (right - left))
				{
					maxArea = height[left] * (right - left);
				}
				left++;
			}
		}
		System.out.println(maxArea);
	 
	// container with most water capacity
//
//	int [] heights = {1,8,6,2,5,4,8,3,7};
//	
//		int maxArea = Integer.MIN_VALUE;
//		int minHeight = 0;
//		int width = 0;
//		for (int i = 0; i < heights.length; i++) {
//			
//			for (int j = i+1; j < heights.length; j++) {
//				
//				width = (i-j)<0 ? (-1)*(i-j) : (i-j);
//				minHeight = heights[i] < heights[j] ? heights[i] : heights[j];
//				
//				if(maxArea < width*minHeight)
//				{
//					maxArea = width*minHeight;
//				}
//			}
//		}
//		System.out.println(maxArea);
}
}
