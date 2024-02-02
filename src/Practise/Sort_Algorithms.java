package Practise;

public class Sort_Algorithms {

	protected int[] integer_selection_sort(int arr[], int size) {
		int position, posi, posj, temp;
		for (posi = 0; posi < size - 1; posi++) {
			position = posi;
			for (posj = posi + 1; posj < size; posj++) {
				if (arr[posj] < arr[position]) {
					position = posj;
				}
				temp = arr[posi];
				arr[posi] = arr[position];
				arr[position] = temp;
			}

		}

		return arr;
	}

	protected int[] integer_insertion_sort(int arr[], int size) {
		int cpos, pos, cvalue;
		for (cpos = 0; cpos < size; cpos++) {
			cvalue = arr[cpos];
			pos = cpos;
			while (pos > 0 && arr[pos - 1] > cvalue) {
				arr[pos] = arr[pos - 1];
				pos = pos - 1;
			}
			arr[pos] = cvalue;
		}

		return arr;

	}
	
	protected int[] integer_bubble_sort(int arr[], int size) {
		int elemt, pass, temp;
		for (pass = 0; pass < size; pass++) {
			for (elemt = 0; elemt < size-1; elemt++) {
				if (arr[elemt] > arr[elemt + 1]) {
					temp = arr[elemt];
					arr[elemt] = arr[elemt + 1];
					arr[elemt + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	protected int[] integer_shell_sort(int arr[], int size) {// time complexity is O(nlog(n))
		int gap, i, j, gvalue;
		for (gap = size / 2; gap > 0; gap = gap / 2) {
			for (i = gap; i < size; i++) {
				gvalue = arr[i];
				j = i - gap;
				while (j >= 0 && arr[j] > gvalue) {
					arr[j + gap] = arr[j];
					j = j - gap;
				}
				arr[j + gap] = gvalue;
			}
		}

		return arr;
	}
	
	
	protected int[] integer_merge_sort(int arr[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			integer_merge_sort(arr, left, mid);
			integer_merge_sort(arr, mid + 1, right);
			arr=integer_merge(arr, left, mid, right);
		}
		return arr;
	}

	protected int[] integer_merge(int arr[], int left, int mid, int right) {
		int i= left;
		int j= mid+1;
		int k= left;
		int brr[]= new int[right +1];
		while(i<= mid && j<= right) {
			if(arr[i]< arr[j]) {
				brr[k]= arr[i];
				i=i+1;
			}
			else {
				brr[k]= arr[j];
				j=j+1;
			}
			k=k+1;
		}
		while(i<= mid) {
			brr[k]= arr[i];
			i=i+1;
			k=k+1;
		}
		while(j<= right) {
			brr[k]= arr[j];
			j=j+1;
			k=k+1;
		}
		for(int m=left;m<=right;m++) {
			arr[m]= brr[m];
		}
		
		return arr;
	}
	
	protected int[] integer_quick_sort(int arr[], int low, int high) {// time complexity is O(nlog(n))
		if (low < high) {
			int pi = integer_partition(arr, low, high);
			integer_quick_sort(arr, low, pi - 1);
			integer_quick_sort(arr, pi + 1, high);
		}
		return arr;
	}

	protected int integer_partition(int arr[], int low, int high) {
		int pivot = arr[low];
		int i = low + 1, j = high;
		do {
			while (i <= j && arr[i] <= pivot)
				i = i + 1;
			while (i <= j && arr[j] > pivot)
				j = j - 1;
			if (i <= j)
				integer_swap(arr, i, j);
		} while (i < j);
		integer_swap(arr, low, j);
		return j;
	}

	protected void integer_swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
		

}
