public class ShellSort{
	public static void shellSort(int[] numbers) {
		int j = 0;
		int temp = 0;
		// 每次将步长缩短为原来的一半
		// 最后一次increment变成1的时候就是插入排序
		for (int increment = numbers.length / 2; increment > 0; increment /= 2) {
			for (int i = increment; i < numbers.length; i++) {
				temp = numbers[i];
				for (j = i; j >= increment; j -= increment) {
					// 从小到大还是从大到小只需要改这个if语句的判断条件
					if (temp < numbers[j - increment]) {
						numbers[j] = numbers[j - increment];
					} else {
						break;
					}
				}
				numbers[j] = temp;
				// for (int x = 0; x < numbers.length; x++) {
			 // 		System.out.print(numbers[x] + " ");
				// }
				// System.out.println(" *");
			}
			// for (int x = 0; x < numbers.length; x++) {
			//  	System.out.print(numbers[x] + " ");
			// }
			// System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		int[] numbers = new int[] {25, 24, 10, 2, 5, 66, 18, 3};
		// System.out.println("25 24 10 2 5 66 18 3\n");
		shellSort(numbers);
	}
}