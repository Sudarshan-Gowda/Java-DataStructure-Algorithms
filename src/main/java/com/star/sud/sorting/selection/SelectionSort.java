package com.star.sud.sorting.selection;

public class SelectionSort {

	int[] selection(int[] arr) {

		for (int i = 0; i <= arr.length - 1; i++) {
			int minIdx = i;

			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[j] < arr[minIdx])
					minIdx = j;
			}

			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;

		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 1, 8 };
		int[] selection = new SelectionSort().selection(arr);
		for (int i : selection)
			System.out.print(i + " ");
	}

}
