package org.howard.edu.lsp.ass7;

/**
 * @author Morenike Onifade
 */


public class Term {
	private int coe;
	private int exp;

	Term(int coe, int exp) {
		this.exp = exp;
		this.coe = coe;
	}

	public int gettheCoefficient() {
		return coe;
	}

	public void settheCoefficient(int coe) {
		this.coe = coe;
	}

	public int gettheExponent() {
		return exp;
	}

	public void settheExponent(int exp) {
		this.exp = exp;
	}	
}