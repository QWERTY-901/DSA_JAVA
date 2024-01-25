package Practise;
import java.lang.Math;

public class Search_Algorithms {

	protected int integer_linear_search(int arr[], int key) {
		int size = arr.length;
		int index = 0;
		while (index < size) {
			if (arr[index] == key)
				return index;
			index++;
		}
		return -1;

	}

	protected int integer_binary_search(int arr[], int key) {
		int size = arr.length;
		int left = 0;
		int right = size - 1;
		while(left<=right) {
		int middle= (int) Math.floor((left+right)/2);
		if(key==arr[middle])
			return middle;
		else if(key < arr[middle])
			right= middle-1;
		else if(key > arr[middle] )
			left= middle+1;
		}
		return -1;
	}
	
	protected int integer_binary_search_recursive(int arr[], int key, int left, int right) {
		if(left> right)
		return -1;
		else {
			int middle=(int) Math.floor((left+right)/2);
			if(key==arr[middle])
				return middle;
			else if(key < arr[middle])
				return integer_binary_search_recursive(arr, key, left, middle-1);
			else if(key > arr[middle])
				return integer_binary_search_recursive(arr, key, middle+1, right);
		}
		return -1;//executed  when left==right and element is not found.
	}

}
