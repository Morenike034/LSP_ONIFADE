package org.howard.edu.lsp.ass4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Morenike Onifade :)
 */
public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set1 = new ArrayList<Integer>();
	
	public IntegerSet() {
	}
	/**
	 * constructor for integer set
	 */

/**
 * clears item from the set
*/
public void clear() {
	set1.clear();
};


/**
 * gets the length of the set
 */
public int length() {
	return set1.size();	
}; // returns the length

/**
 * getter method
 */
public List<Integer> obtainSet(){
	return set1;
}

/*
 * Two sets are equal if they contain all of the same values in ANY order.
*/
/**
 * compares the 2 sets and return true if they're equal but false if they're not equal
 */
public boolean equals(IntegerSet b) {
	boolean equal = false;
	List<Integer> set2 = b.obtainSet();
	for (int i = 0; i < set1.size(); i++) {
		int set1save = set1.get(i);
		for (int j = 0; j < set2.size(); j++) {
			int set2save = set2.get(j);
			if (set1save == set2save) {
				equal = true;
			}
			else {
				equal = false;
			}
		}
}
	return equal;
}

/**
 * checks to see if the set contains the value
 */
public boolean contains(int value) {
	boolean contain = false;
	if(set1.contains(value)) {
		contain = true;
	}
	else {
		contain = false;
	}
	return contain;
}    

/**
 * checks for the largest item in the set and throws an integer set exception if the set happens to be empty
 */
public int largest() throws IntegerSetException {
	int maximum = 0;
	if(set1.size() <= 0) {
		throw new IntegerSetException("The ArrayList has 0 items.");
	}
	else if (set1.size() > 0) {
		maximum = Collections.max(set1);
	}
	return maximum;
}; 

/**
 * checks for the smallest item in the set and throws an integer set exception if the set happens to be empty
 */
public int smallest() throws IntegerSetException {
	int minimum = 0;
	if(set1.size() <= 0) {
		throw new IntegerSetException("The ArrayList has 0 items");
	}
	else if (set1.size() > 0) {
		minimum = Collections.min(set1);
	}
	return minimum;
}

/**
 * adds an item to the set
 */
public void add(int item) {
	if (set1.contains(item) == false) {
		set1.add(item);
	}
}; // adds item to s or does nothing if it is in set

/**
 * removes an item from the set
 */
public void remove(int item) {
	if (set1.contains(item) == true) {
		set1.removeAll(Arrays.asList(item));
	}
};  //Throws a IntegerSetException of the set is empty

/**
 * finds the union of the 2 sets
 */
public void union(IntegerSet intSetb) {
	List<Integer> set2 = intSetb.obtainSet();
	for(int i = 0; i<set2.size(); i++) {
		add(set2.get(i));
	}
}

/**
 * finds the intersection of the 2 sets
 */
public void intersect(IntegerSet intSetb) {
	List<Integer> set2 = intSetb.obtainSet();
	for(int i=0; i < set2.size(); i++){
		set1.retainAll(set2);
	}
}; 

/**
 * finds the difference between the 2 sets
 */
public void diff(IntegerSet intSetb) {
	List<Integer> set2 = intSetb.obtainSet();
	for(int i=0; i<set2.size(); i++){
		set1.removeAll(set2);// set difference, i.e. s1 - s2
	}
}

/**
 * checks to see if the set is empty, if empty, returns true. if not empty, returns false
 */
boolean isEmpty() {
	boolean empty = false;
	int length = set1.size();
	if (length > 0) {
		empty = false;
	}
	if (length == 0) {
		empty = true;
	}
	return empty;
}

/**
 * returns the string representation of the set
 */
public String toString() {
	String setstring = set1.toString();
	return setstring;
};	// return String representation of your set
}

