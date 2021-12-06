package org.howard.edu.lsp.ass7;

public class PolynomialTester
{
   public static void main(String[] args)
   {
      Polynomial p1 = new Polynomial();
      Polynomial p2 = new Polynomial();
      Polynomial p0 = new Polynomial();
      p1.insert(3, 2);
      p1.insert(4, 4);
      p1.insert(1, 6);
      p2.insert(2, 0);
      p2.insert(5, 2);
      p2.insert(6, 3);
      p2.insert(2, 7);
      p3.insert(4, 10);
    
     
      Polynomial p4 = p1.polyProduct(p2);
      System.out.println("p1 is " + p1 + "\np2 is " + p2 + "\np1*p2 is " + p4);
    
      Polynomial p5 = p2.polyProduct(p2);
      System.out.println("p2 is " + p2 + "\np2*p2 is " + p5);
    
      Polynomial p6 = p0.polyProduct(p2);
      System.out.println("p0 is " + p0 + "\n" + "p2 is " + p2 + "\np0*p2 is "
                         + p6);
    
      p2 = p2.polyProduct(p2);
      System.out.println("After p2 = p2*p2 p2 is " + p2);
      System.out.println("p1 is " + p1 );
   }
}