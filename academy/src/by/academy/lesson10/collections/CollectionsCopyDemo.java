package by.academy.lesson10.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsCopyDemo {
	public static void main(String[] args) {
		List<Integer> src = Arrays.asList(1, 2, 3);
		List<Integer> dest = Arrays.asList(4, 5, 6, 7);
		Collections.copy(dest, src);
		System.out.println(dest);
	}
}