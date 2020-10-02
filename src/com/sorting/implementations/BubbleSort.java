package com.sorting.implementations;

import com.sorting.ISorting;

public class BubbleSort implements ISorting {

	@Override
	public void sortIt(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

}
