package leetCode_easy;

import java.util.LinkedList;

/*
 You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
 */
class ListNode 
{
	int val;
	ListNode next;
	ListNode() 
	{

	}
	ListNode(int val) 
	{ 
		this.val = val; 
	}
	ListNode(int val, ListNode next) 
	{ 	
		this.val = val; this.next = next; 
	}
}

public class Q21 {
	public static void main(String[] args) {
//		 ListNode tempNode = new ListNode(0);
//         ListNode currNode = tempNode;
//
//         while(list1 != null && list2 != null)
//         {
//             if(list1.val < list2.val)
//             {
//                 currNode.next = list1;
//                 list1 = list1.next;
//             }
//             else
//             {
//                 currNode.next = list2;
//                 list2 = list2.next ;
//             }
//
//             currNode = currNode.next ;
//         }
//
//         if(list1 != null)
//         {
//             currNode.next = list1 ;
//             list1 = list1.next ;
//         }
//         if(list2 != null)
//         {
//             currNode.next = list2 ;
//             list2 = list2.next ;
//         }
//         
//         return tempNode.next;
		
	}	
}
