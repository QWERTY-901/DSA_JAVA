package Practise;

import java.util.*;
import Practise.Search_Algorithms;

public class Main {

	public static void main(String[] args) {
		Search_Algorithms searching = new Search_Algorithms();
		Sort_Algorithms sorting = new Sort_Algorithms();
		int index=0;
//		Linked_List_Algorithms linking= new Linked_List();
//		Sample_testing test= new Sample_testing();
		int[] arr= {45, 89, 76, 55, 90, 33, 21};
		System.out.println("THE SORTED ARRAY USING SHELL SORT:\n");
		arr=sorting.integer_bubble_sort(arr, arr.length);
		while(arr.length!=0&& index<arr.length) {
			System.out.println(arr[index] +'\t');
			index++;
			
		}
		

	}

}
