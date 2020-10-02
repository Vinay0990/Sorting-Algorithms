package com.sorting.implementations;

import com.sorting.ISorting;

public class MergeSort implements ISorting {

	@Override
	public void sortIt(int[] arr) {

		mergeSort(arr, 0, arr.length);
	}

	public void mergeSort(int[] arr, int start, int end) {
		if (end - start < 2)
			return;

		int mid = (start + end) / 2;

		mergeSort(arr, start, mid);
		mergeSort(arr, mid, end);

		merge(arr, start, mid, end);

	}

	private void merge(int[] arr, int start, int mid, int end) {

		if (arr[mid - 1] <= arr[mid])
			return;

		int i = start, j = mid, tempIndex = 0;

		int[] tempArr = new int[end - start];

		while (i < mid && j < end) {
			tempArr[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
		}

		System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
		System.arraycopy(tempArr, 0, arr, start, tempIndex);

	}

}
