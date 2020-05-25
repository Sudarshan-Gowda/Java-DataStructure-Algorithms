package com.star.sud.sorting.bubble;

public class BubbleSort {

	int[] sortingWorstCase(int[] arr) {

		for (int i = 0; i <= arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}

			}

		}
		return arr;
	}

	int[] sortingOptimizedSolution(int[] arr) {

		for (int i = 0; i <= arr.length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}

			}

			if (!swapped)
				break;

		}
		return arr;
	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] arr = { 5, 2, 7, 9, 1, 3 };
		int[] sort = bs.sortingOptimizedSolution(arr);
		for (int i : sort)
			System.out.print(i + " ");
	}
}
