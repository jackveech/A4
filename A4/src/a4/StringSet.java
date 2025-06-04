package a4;

import java.util.ArrayList;
import java.util.List;

/**
 * Naive list-based implementation of a set of strings.
 *
 */
public class StringSet {

	// USE THIS FIELD TO STORE THE ELEMENTS OF THE SET.
	// DO NOT CHANGE THE NAME OF THE FIELD.
	// DO NOT MAKE THE FIELD PRIVATE.
	List<String> list;

	
	// SOME ALREADY IMPLEMENTED METHODS 

	/**
	 * Returns the number of elements in this set.
	 * 
	 * @return the number of elements in this set
	 */
	public int size() {
		return this.list.size();
	}

	/**
	 * Returns {@code true} if this set contains an element equal to {@code s},
	 * returns {@code false} otherwise.
	 * 
	 * @param s a string to search for in this set
	 * @return {@code true} if the set contains an element equal to {@code s},
	 *         {@code false} otherwise
	 */
	public boolean contains(String s) {
		return this.list.contains(s);
	}

	/**
	 * Removes from this set the element equal to {@code s} if such an element
	 * exists. If the set does not contain {@code s} then no changes are made to the
	 * set. 
	 * 
	 * @param s a string to remove from this set
	 * @return {@code true} if a string was removed from this set, {@code false}
	 *         otherwise
	 */
	public boolean remove(String s) {
		return this.list.remove(s);
	}

	/**
	 * Returns a string representation of this set. The string representation
	 * is similar to the string returned by {@code java.util.List.toString}.
	 * 
	 * @return a string representation of this set
	 */
	@Override
	public String toString() {
		return this.list.toString();
	}

	
	// ADD THE REQUIRED CONSTRUCTORS AND METHODS AFTER THIS POINT
	
	
}
