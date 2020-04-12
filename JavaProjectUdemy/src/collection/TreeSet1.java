package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<String> th = new TreeSet<String>();
		th.add("vipin");
		th.add("abhishek");
		th.add("rahul");
		th.add("rahul");

		Iterator<String> set = th.iterator();
		while (set.hasNext()) {
			System.out.println("val:" + set.next()); // data in assending order
														// and withput duplicate
														// value
		}
	}
}