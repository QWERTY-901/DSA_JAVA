package Practise;

public class Sort_Algorithms {

	protected int[] integer_selection_sort(int arr[], int size) {
		int position, pos, sort_elem, temp;
		for (pos = 0; pos < size - 1; pos++) {
			position = pos;
			for (sort_elem = pos + 1; sort_elem < size; sort_elem++) {
				if (arr[sort_elem] < arr[position]) {
					position = sort_elem;
				}
				temp = arr[pos];
				arr[pos] = arr[position];
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
		for (pass = 0; pass < size - 1; pass++) {
			for (elemt = 0; elemt < size - 1; elemt++) {
				if (arr[elemt] > arr[elemt + 1]) {
					temp = arr[elemt];
					arr[elemt] = arr[elemt + 1];
					arr[elemt + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	protected int[] integer_shell_sort(int arr[], int size) {
		return arr;
	}

}
