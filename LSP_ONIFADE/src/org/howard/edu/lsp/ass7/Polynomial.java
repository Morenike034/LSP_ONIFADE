package org.howard.edu.lsp.ass7;

public class Polynomial{
	private double[] coe;
	private exponent;
	
	public Polynomial() {
		exponent = 0;
		coe = new double[1];
		coe[0]= 0;
		
	}
	
	public Polynomial polyProduct(Polynomial p) {
		Polynomial resultPoly = new Polynomial();
		Node temp1 = first;
		Node temp2 = p.first;
	}
	
	public class Term{
		private int coe;
		private int exponent;
		
		public Term(int coe, int exponent) {
			this.coe = coe;
			this.exponent = exponent;
		}
		
		public int getCoefficient() {
			return coe;
		}
		public int getExponent() {
			return exponent;
		}
		
		public String toString() {
			return s;
		}
	}
	
	
	
}

