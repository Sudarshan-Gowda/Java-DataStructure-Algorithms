package com.star.sud.searching.binarysearch;

public class Iterative {

	int binarySearch(int[] arr, int l, int r, int x) {

		while (l <= r) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				r = mid - 1;
			else
				l = mid + 1;
		}

		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int rst = new Iterative().binarySearch(arr, 0, arr.length - 1, 3);
		if (rst == -1)
			System.out.println("Element not found!!");
		else
			System.out.println("Element found at index: " + rst);
	}

}
