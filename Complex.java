package poo.tp02.arrays;
public class Complex {
	double r;
	double i;
	public Complex(){}
	public Complex(double r, double i){
		this.r = r;
		this.i = i;
	}
	public boolean equals(Complex c){
		if (this.r == c.r && this.i == c.i)
			return true;
		return false;
	}
	public String toString(){
		return "("+ this.r +","+ this.i +")";
	}
}