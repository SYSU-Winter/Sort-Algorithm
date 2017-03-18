public class QSort{
	/**
     * 查找出中轴（默认是最低位low）的在numbers数组排序后所在位置
     * 
     * @param numbers 带查找数组
     * @param low   开始位置
     * @param high  结束位置
     * @return  中轴所在位置
    */
	private static int getMiddle(int[] numbers, int low, int high) {
		int temp = numbers[low]; // 数组第一个元素作为中轴
		while (low < high) {
			// 从右向左找小于temp的数
			while (low < high && numbers[high] > temp) {
				high--;
			}
			numbers[low] = numbers[high]; // 比中轴小的数移到低端
			// 从左向右找比temp大的数
			while (low < high && numbers[low] < temp) {
				low++;
			}
			numbers[high] = numbers[low]; // 比中轴大的数移到高端

			for (int x = 0; x < numbers.length; x++) {
				System.out.print(numbers[x] + " ");
			}
			System.out.println("");
		}
		// 循环结束之后low=high, 将选为中轴的数填入
		numbers[low] = temp;
		return low;
	}

	/**
     * 
     * @param numbers 带排序数组
     * @param low  开始位置
     * @param high 结束位置
    */
    private static void qSort(int[] numbers, int low, int high) {
    	if (low < high) {
    		// 将number数组进行一分为二
    		int middle = getMiddle(numbers, low, high);
    		qSort(numbers, low, middle - 1); // 对低字段进行递归排序
    		qSort(numbers, middle + 1, high); // 对高字段进行递归排序
    	}
    }

    /**
     * 快速排序,直接调用
     * @param numbers 带排序数组
    */
    // private static void quick(int[] numbers) {
    // 	if (numbers.length > 0) {
    // 		quickSort(numbers, 0, numbers.length - 1);
    // 	}
    // }

	public static void main(String[] args) {
		int[] numbers = new int[] {25, 24, 10, 2, 5, 66, 18, 3};
		System.out.println("25 24 10 2 5 66 18 3\n");
		qSort(numbers, 0, numbers.length - 1);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("");
	}
}