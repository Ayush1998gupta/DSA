package Assignment2;

import basic.Node;

public class MergeSort {
	
	public static Node<Integer> midPoint(Node<Integer> head){
		if(head.next==null || head ==null) {
			return head;
		}
		Node<Integer> slow=head;
		Node<Integer> fast=head.next;
		
		
		while (fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
		
	}
	
	public static Node<Integer> mergeSort(Node<Integer> head){
		if(head==null  || head.next==null) {
			return head;
		}
		
		Node<Integer> mid=midPoint(head);
		
		Node<Integer> firstHead=head;
		Node<Integer> secondHead=mid.next;
		mid.next=null;
		
		firstHead=mergeSort(firstHead);
		
		secondHead=mergeSort(secondHead);
		
		
		return MregeTwoSortedLL.mergeSortedLL(firstHead, secondHead);
		
	}

}
