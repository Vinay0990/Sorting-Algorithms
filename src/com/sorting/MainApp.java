package com.sorting;

import com.sorting.implementations.*;

public class MainApp {

	public static void main(String[] args) {
		int[] demo = { 55, 20, -1, 33, 12, -22, 45, 15, -9, 7 };

		printArray(demo);

//		ISorting sort1 = new BubbleSort();
//		ISorting sort2 = new SelectionSort();
//		ISorting sort2 = new InsertionSort();
//		ISorting sort2 = new ShellSort();
//		ISorting sort2 = new MergeSort();
		ISorting sort2 = new QuickSort();
		sort2.sortIt(demo);
		printArray(demo);
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
}
