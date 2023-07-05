package Singleton;


import java.util.*;

public class Singleton {
	
	public static void main(String args[]) {
		
		int[] array = {3,5,9,4,0};
		Arrays.sort(array);
			for(int n : array)
			System.out.println("hi"+n);
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		ll.descendingIterator().forEachRemaining(ll2::add);
		
		Iterator<Integer> it = ll2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		String str ="SHRADHA";
		char[] str2 = str.toCharArray();
		String str3="";
		StringBuilder strbuild  = new StringBuilder(str);
		StringBuilder strbuil  = new StringBuilder();
		//strbuild.reverse();
		//System.out.println(strbuild);
		for(int i= str2.length-1; i>=0; i--) {
			strbuil.append(str2[i]);
		}
		
		System.out.println(strbuil);
	}

}
