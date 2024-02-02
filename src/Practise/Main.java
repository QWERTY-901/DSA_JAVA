package Practise;

import java.util.*;
import Practise.Search_Algorithms;

public class Main {

	public static void main(String[] args) {
		Search_Algorithms searching = new Search_Algorithms();
		Sort_Algorithms sorting = new Sort_Algorithms();
		Linked_List linked_List = new Linked_List();
		int index;
//		Linked_List_Algorithms linking= new Linked_List();
//		Sample_testing test= new Sample_testing();
//		int[] arr= {45, 89, 76, 55, 90, 33, 21};
//		System.out.println("ORIGINAL ARRAY:");
//		for(int i=0;i< arr.length; i++)
//			System.out.println(arr[i]+ " ");
//		System.out.println("THE SORTED ARRAY USING QUICK SORT:\n");
//		arr=sorting.integer_quick_sort(arr, 0,6);
//		for(index=0;index<arr.length;index++) {
//			System.out.println(arr[index]+ " ");
		
		linked_List.addNode_tail(8);
		linked_List.addNode_tail(9);
		linked_List.addNode_tail(56);
		linked_List.display();
        System.out.println("Size: "+linked_List.length_of_LinkList());
        
        
        System.out.println(linked_List.addNode_head(78));
        linked_List.display();
        
        linked_List.addNode_position(65, 2);
        linked_List.display();
		
		
		
		
			
		}

}
