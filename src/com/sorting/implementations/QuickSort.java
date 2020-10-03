package com.sorting.implementations;

import com.sorting.ISorting;

public class QuickSort implements ISorting {

	@Override
	public void sortIt(int[] arr) {
		quickSort(arr, 0, arr.length);
	}

	public void quickSort(int[] arr, int start, int end) {
		if (end > start) {
			int pivot = partition(arr, start, end);
			quickSort(arr, start, pivot);
			quickSort(arr, pivot + 1, end);
		}
	}

	private int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i = start, j = end;

		while (i < j) {
			do {
				j--;
			} while (i < j && arr[j] >= pivot);
			
			if (i < j)
				arr[i] = arr[j];

			do {
				i++;
			} while (i < j && arr[i] <= pivot);

			if (i < j)
				arr[j] = arr[i];
		}

		arr[j] = pivot;

		return j;
	}

}
