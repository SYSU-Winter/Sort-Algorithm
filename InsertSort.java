public class InsertSort {
	public static void insertSort(int[] numbers) {
		int size = numbers.length;
		int temp = 0;
		int j = 0;

		for (int i = 0; i < size; i++) {
			temp = numbers[i];
			for (j = i; j > 0 && temp < numbers[j - 1]; j--) {
				numbers[j] = numbers[j - 1];
				// for (int x = 0; x < size; x++) {
				// 	System.out.print(numbers[x] + " ");
				// }
				// System.out.println(" *");
			}
			numbers[j] = temp;
			// for (int x = 0; x < size; x++) {
			// 	System.out.print(numbers[x] + " ");
			// }
			// System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		int[] numbers = {25, 24, 10, 2, 5, 66, 18, 3};
		insertSort(numbers);
	}
}