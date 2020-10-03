package com.sorting;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class MainApp {

	public static void main(String[] args) {

		String[] implementations = { "BubbleSort", "SelectionSort", "InsertionSort", "ShellSort", "MergeSort",
				"QuickSort" };
		int[] sizes = { 10, 100, 1000, 10000, 100000, 1000000 };
		
		for (int j = 0; j < sizes.length; j++) {

			long[] results = new long[implementations.length];
			for (int i = 0; i < implementations.length; i++) {
				int[] demo = generateArray(sizes[j]);
				ISorting sort = getNewClss(implementations[i]);
				long start = System.nanoTime();
				sort.sortIt(demo);
				long end = System.nanoTime();

				long diff = end - start;

				results[i] = diff/1000;
			}

			System.out.println(sizes[j] + " | " + results[0] + " | " + results[1] + " | " + results[2] + " | "
					+ results[3] + " | " + results[4] + " | " + results[5]);

//			System.out.println("=================");
		}
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	public static ISorting getNewClss(String name) {
		try {
			Class<?> clss = Class.forName("com.sorting.implementations." + name);
			Constructor<?> cons = clss.getConstructor();
			ISorting sort = (ISorting) cons.newInstance();
			return sort;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException
				| SecurityException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static int[] generateArray(int n) {
		int[] result = new int[n];
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			result[i] = random.nextInt(2 * n);
		}

		return result;
	}
}
