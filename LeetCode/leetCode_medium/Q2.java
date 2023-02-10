package leetCode_medium;

import java.util.LinkedList;

public class Q2 
{
	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(2);
		list1.add(4);
		list1.add(3);

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(5);
		list2.add(6);
		list2.add(4);

		LinkedList<Integer> list = new LinkedList<>();

		int i = 0 ;
		int num = 0;
		while(i < list1.size())
		{
			num += (list1.get(i) + list2.get(i)) ;
			list.add(num%10);
			num /= 10 ;
			i++;
		}		
		System.out.println(list);
	}
}
