public class BubbleSort{
	public static void bubbleSort(int[] numbers) {
		int temp = 0;
		int size = numbers.length;
		//System.out.println(size);
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
				// for (int x = 0; x < numbers.length; x++) {
				// 	System.out.print(numbers[x] + " ");
				// }
				// System.out.println(" *");
			}
			//System.out.println("");
		}
	}

	public static void main(String[] args) {
		int[] numbers = new int[] {25, 24, 10, 2, 5, 66, 18, 3};
		//System.out.println("25 24 10 2 5 66 18 3\n");
		bubbleSort(numbers);
	}
}