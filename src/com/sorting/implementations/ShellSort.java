package com.sorting.implementations;

import com.sorting.ISorting;

public class ShellSort implements ISorting {

	@Override
	public void sortIt(int[] arr) {

		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int unsortedIndex = gap; unsortedIndex < arr.length; unsortedIndex++) {
				int element = arr[unsortedIndex];
				int j = unsortedIndex;
				while (j >= gap && arr[j - gap] > element) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				arr[j] = element;
			}

		}

	}

}
