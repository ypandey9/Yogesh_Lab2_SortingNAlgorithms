package com.solution.statement2.lab2;

public class MergeSort {

	static void display(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void mrgSrt(int arr[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mrgSrt(arr, left, mid);
			mrgSrt(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	void merge(int arr[], int left, int mid, int right) {
		int len1 = mid - left + 1;
		int len2 = right - mid;
		int leftArr[] = new int[len1];
		int rightArr[] = new int[len2];
		for (int i = 0; i < len1; i++) {
			leftArr[i] = arr[left + i];
		}

		for (int i = 0; i < len2; i++) {
			rightArr[i] = arr[mid + 1 + i];
		}
		int i = 0, j = 0, k = left;
		while (i < len1 && j < len2) {
			if (leftArr[i] >= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (i < len1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

	}

}
