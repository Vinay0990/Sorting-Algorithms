package com.sorting;

public interface ISorting {
	
	public void sortIt(int[] arr);
	
	default void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}