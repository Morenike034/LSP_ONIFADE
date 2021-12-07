package org.howard.edu.lsp.ass7;

/**
 * @author Morenike Onifade
 */


import java.util.ArrayList;
import java.util.Iterator;



public class Polynomial{
	private ArrayList<Term> t; /**  new private instance variable **/
	
	public Polynomial() { /** new polynomial that doesn't have terms **/
		t = new ArrayList<Term>();	
	}
	
	public void insert(int coe,exp) {
		Term term = new Term(coe, exp);
		ArrayList<Term> temp = new ArrayList<Term>();
		
		int insert = -1;
		int j;
		
		if(term.size() == 0) {
			term.add(term);
		}
		else {
			for (j = 0; j < term.size(); j++) {
				if(t.get(i).getExp() > exp) {
					temp.add(term);
					insert = j;
					
					for(int i = j; i < term.size(); i++) {
						temp.add(t.get(i));
					}
				}
				else {
					temp.add(term.get(j));
				}
			}
			if(insert == -1) {
				temp.add(term);
				t = temp;
		}
			System.out.println("put in the method \n Coefficient: " + coe + "\n Exponent: " + exp);
	}
}
	
		/**
		 * This deletes the first occurrence of a specified term from a Polynomial, or
		 * prints an appropriate message if the term does not appear in the
		 * Polynomial
		 */
		public void delete(int coefficient, int exponent) {
			boolean find = false;
			Iterator<Term> it = t.iterator();
			while (it.hasNext()) {
				Term t = it.next();
				if (t.gettheCoefficient() == coefficient && t.gettheExponent() == exponent) {
					it.remove();
					find = true;
					break;
				}
			}
			if (!find) {
				System.out.println("This term does not exist");
			} else
				System.out.println("this deletes the method: " + coefficient + " " + exponent);
		}

		/**
		 * Returns the product of all the terms of a Polynomial
		 */
		public String product() {

			int product = 1, sum = 0;
			for (Term t : t) {
				product *= t.gettheCoefficient();
				
				sum += t.gettheExponent();

			}
			return "the product is: " + String.valueOf(product) + "x^" + String.valueOf(sum);
		}

		/**
		 * Returns a polynomial as a String in this form: 3x^2 + 7x^3 + 2x^5
		 */
		public String toString() {
			String text = "";

			for (int j = 0; j < t.size(); j++) {
				text += t.get(j).toString();
				if (j != t.size() - 1) {
					text += "+";
				}
			}
			return text;
		}

		/**
		 * Reverses the order of the terms of a Polynomial.
		 */
		public void reverse() {
			
			ArrayList<Term> temp = new ArrayList<Term>();

			for (int i = t.size() - 1; i >= 0; i--) {
				temp.add(t.get(i));
			}
			t = temp;
		}
	}