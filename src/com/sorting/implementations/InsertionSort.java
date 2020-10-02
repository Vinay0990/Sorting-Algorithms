package com.sorting.implementations;

import com.sorting.ISorting;

public class InsertionSort implements ISorting {

	@Override
	public void sortIt(int[] arr) {

		for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
			int element = arr[unsortedIndex];

			int j;
			for (j = unsortedIndex; j > 0 && arr[j - 1] > element; j--)
				arr[j] = arr[j - 1];

			arr[j] = element;
		}

	}

}
