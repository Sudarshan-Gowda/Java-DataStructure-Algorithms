package com.star.sud.searching.binarysearch;

public class Recursive {

	int binarySearch(int[] arr, int l, int r, int x) {

		if (r >= l) {

			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int rst = new Recursive().binarySearch(arr, 0, arr.length - 1, 4);
		if (rst == -1)
			System.out.println("Element not found!!");
		else
			System.out.println("Element found at index: " + rst);

	}

}
