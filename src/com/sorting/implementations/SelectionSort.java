package com.sorting.implementations;

import com.sorting.ISorting;

public class SelectionSort implements ISorting {

	@Override
	public void sortIt(int[] arr) {
	
		for(int i= arr.length-1;i>0;i--) {
			int largest = 0;
			for(int j=1;j<=i;j++) {
				if(arr[j]>arr[largest]) {
					largest = j;
				}
			}
			swap(arr, largest, i);
		}
	}

}
