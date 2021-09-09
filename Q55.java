import java.util.*;
class Complex{
	double real, img;
	Complex(double real, double img){
		this.real=real;
		this.img=img;
	}
	void add(Complex c1, Complex c2) {
		Complex c3=new Complex(real,img);
		c3.real=c1.real+c2.real;
		c3.img=c1.img+c2.img;
		System.out.println("Addition result: "+c3.real+" + i"+c3.img);
	}
}
public class Q55 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the real and imaginary part of 1st number: ");
		double real1=sc.nextDouble();
		double img1=sc.nextDouble();
		Complex c1=new Complex(real1,img1);
		System.out.print("Enter the real and imaginary part of 2nd number: ");
		double real2=sc.nextDouble();
		double img2=sc.nextDouble();
		sc.close();
		Complex c2=new Complex(real2,img2);
		c1.add(c1, c2);
	}
}
