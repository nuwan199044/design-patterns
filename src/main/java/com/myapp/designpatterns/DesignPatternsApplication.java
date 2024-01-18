package com.myapp.designpatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DesignPatternsApplication {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("One");
		stringList.add("Two");
		stringList.add("Three");

		MyList<String> list = new MyList<>(stringList);

		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Size of the list: " + list.size());
		System.out.println("Is the list empty? " + list.isEmpty());
	}

}
