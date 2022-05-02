package assignment;

public class ComplexNumber{
	   //for real and imaginary parts of complex numbers
	   double real;
	   double img;
		
	   //constructor to initialize the complex number
	   ComplexNumber(double r, double i){
		this.real = r;
		this.img = i;
	   }
		
	   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
	   {
		//creating a temporary complex number to hold the sum of two numbers
	        ComplexNumber c = new ComplexNumber(0, 0);

	        c.real = c1.real + c2.real;
	        c.img = c1.img + c2.img;
	        
	        //returning the output complex number
	        return c;
	    }
	    public static void main(String args[]) {
		ComplexNumber c1 = new ComplexNumber(2.5, 3);
		ComplexNumber c2 = new ComplexNumber(3.2, 4.5);
	        ComplexNumber temp = sum(c1, c2);
	        System.out.printf(temp.real+" + "+ temp.img +"i");
	    }
	}