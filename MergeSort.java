public class MergeSort{
	/**
     * 归并排序
     * 简介:将两个（或两个以上）有序表合并成一个新的有序表
     * 即把待排序序列分为若干个子序列，每个子序列是有序的。
     * 然后再把有序子序列合并为整体有序序列
     * 时间复杂度为O(nlogn)
     * 稳定排序方式
     * @param nums 待排序数组
     * @return 输出有序数组
    */
    public static int[] sort(int[] nums, int low, int high) {
    	int mid = (low + high) / 2;
    	if (low < high) {
    		// 左边
    		sort(nums, low, mid);
    		// 右边
    		sort(nums, mid + 1, high);
    		// 左右归并
    		merge(nums, low, mid, high);
    	}
  //   	for (int i = 0; i < nums.length; i++) {
		// 	System.out.print(nums[i] + " ");
		// }
		// System.out.println("");
    	return nums;
    }

    /**
     * 将数组中low到high位置的数进行排序
     * @param nums 待排序数组
     * @param low 待排的开始位置
     * @param mid 待排中间位置
     * @param high 待排结束位置
    */
    public static void merge(int[] nums, int low, int mid, int high) {
    	int[] temp = new int[high - low + 1];
    	int left = low;
    	int right = mid + 1;
    	int k = 0;
    	// 从两个有序数列的第一个数开始比较，将较小的放入新数列
    	while (left <= mid && right <= high) {
    		if (nums[left] < nums[right]) {
    			temp[k++] = nums[left++];
    		} else {
    			temp[k++] = nums[right++];
    		}
    	}
    	// 比较结束后，全部入新数列或者还有一个数列没有全部进去，如果有剩余，将他们移进去
    	// 把左边剩余的数移入数组
    	while (left <= mid) temp[k++] = nums[left++];
    	// 吧右边剩余的数移入数组
    	while (right <= high) temp[k++] = nums[right++];
    	// 把新数组中的数覆盖nums数组
    	for (int x = 0; x < temp.length; x++) nums[x + low] = temp[x];
    }

	public static void main(String[] args) {
		int[] numbers = new int[] {25, 24, 10, 2, 5, 66, 18, 3};
		System.out.println("25 24 10 2 5 66 18 3\n");
		numbers = sort(numbers, 0, numbers.length - 1);
	}
}