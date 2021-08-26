package by.academy.lesson16;

import java.io.IOException;

@FunctionalInterface
public interface Searchable {

	boolean test(Car car) throws IOException;

	boolean equals(Object o);

	int hashCode();

	String toString();
}
