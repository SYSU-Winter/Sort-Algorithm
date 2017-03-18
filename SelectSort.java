public class SelectSort{
	public static void selectSort(int[] numbers) {
		int size = numbers.length;
		int temp = 0;
		for (int i = 0; i < size; i++) {
			int k = i;
			for (int j = size - 1; j > i; j--) {
				if (numbers[j] < numbers[k]) {
					k = j;
				}
			}
			temp = numbers[i];
			numbers[i] = numbers[k];
			numbers[k] = temp;

			// for (int x = 0; x < size; x++) {
			// 	System.out.print(numbers[x] + " ");
			// }
			// System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		int[] numbers = new int[] {25, 24, 10, 2, 5, 66, 18, 3};
		//System.out.println("25 24 10 2 5 66 18 3\n");
		selectSort(numbers);
	}
}
// 我曹