package prac221110;

public class QuickSort {

	static int[] nums= new int[]{13,1,15,17,6,9,8,7,4,11};
	static void display(int[] nums, int start, int end) {
		for(int i=start; i<=end; i++)
			System.out.printf("%3d", nums[i]);
		System.out.println();
	}

	private static void quickSort(int[] nums, int start, int end) {

		if(start>=end) return;
		

		int key, left, right;
		key = start;
		left = start +1; //1
		right = end;
		while(left <= right) {
			while(left <= end && nums[left] <= nums[key]) left++;
			while(right > start && nums[right] >= nums[key]) right--;
			if(left<=right) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}else {
				int temp = nums[key];
				nums[key] = nums[right];
				nums[right] = temp;
			}
		}
		display(nums, start, right-1);
		System.out.println();
		display(nums, right+1, end);
		quickSort(nums, start, right-1);
		quickSort(nums, right+1, end);
		
		
	}
	public static void main(String[] args) {
		display(nums, 0,9);
//		display(nums, 3,7);
//		display(nums, 6,9);
		
		quickSort(nums, 0, 9);
		display(nums, 0, 9);

	}
	

}
