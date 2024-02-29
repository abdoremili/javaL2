package poo.tp02.arrays;
public class Fraction {
	int numerateur, denominateur;
	public Fraction(){}
	public Fraction(int n, int d){
		this.numerateur = n;
		this.denominateur = d;
	}
	public boolean equals(Fraction c){
		if ((this.numerateur == c.numerateur) && (this.denominateur == c.denominateur))
			return true;
		return false;
	}
	public String toString(){
		return this.numerateur +"/"+ this.denominateur;
	}
}