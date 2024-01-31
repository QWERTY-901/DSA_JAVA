package Practise;

import java.util.*;
import Practise.Search_Algorithms;

public class Main {

	public static void main(String[] args) {
		Search_Algorithms searching = new Search_Algorithms();
		Sort_Algorithms sorting = new Sort_Algorithms();
		int index;
//		Linked_List_Algorithms linking= new Linked_List();
//		Sample_testing test= new Sample_testing();
		int[] arr= {45, 89, 76, 55, 90, 33, 21};
		System.out.println("ORIGINAL ARRAY:");
		for(int i=0;i< arr.length; i++)
			System.out.println(arr[i]);
		System.out.println("THE SORTED ARRAY USING MERGE SORT:\n");
		arr=sorting.integer_merge_sort(arr, 0,6);
		for(index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
			
		}
		

	}

}
