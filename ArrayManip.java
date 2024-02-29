package poo.tp02.arrays;
public class ArrayManip {
	static int[] tabIn1 = {12, 7, 12, 5, 4, 20, 30, 12};
	static int[] tabInt2 = {12, 11, 10, 9, 21, 22, 23, 33, 12, 13, 14, 15};
	static Complex[] tabComp1 = {new Complex(5.5, 3.3), new Complex(9.1, 6.2), new Complex(10.3, 5.5), new Complex(12.2, 4.7), new Complex(10.3, 5.5)};
	static Complex[] tabComp2 = {new Complex(4.4, 5.5), new Complex(2.1, 4.9), new Complex(4.8, 32.2)};
	static Fraction[] tabFrac1 = {new Fraction(5, 7), new Fraction(5, 7), new Fraction(1, 2), new Fraction(3, 4), new Fraction(6, 10)}; 
	static Fraction[] tabFrac2 = {new Fraction(12, 6), new Fraction(14, 3), new Fraction(2, 9)};
	static int occurrence(int[] int1, int valeur){
		int cmp = 0;
		if(int1 == null)
			return -2;
		if(int1.length == 0)
			return -1;
		for(int a:int1) if(a == valeur) cmp++; 
		return cmp;
	}
	static int occurrence(Complex[] comp, Complex objet){
		int cmp = 0;
		if(comp == null) return -2;
		if(comp.length == 0) return -1;
		for(Complex c:comp) if(c.equals(objet)) cmp++;
		return cmp;
	}
	static int occurrence(Fraction[] frac, Fraction objet){
		int cmp = 0;
		if(frac == null) return -2;
		if(frac.length == 0) return -1;
		for(Fraction f:frac) if(f.equals(objet)) cmp++;
		return cmp;
	}
	public static void main(String[] args){
		int tmp1 = occurrence(tabIn1, 12);
		if(tmp1 == 0)
			System.out.println("Aucune occurrence trouvée de la valeur 12 dans le tableau tabIn1");
		else if(tmp1 == -1)
			System.out.println("le tableau tabIn1 est vide");
		else if(tmp1 == -2)
			System.out.println("tableau manquant");
		else
			System.out.println("Le nombre de fois que la valeur 12 apparait dans le tableau tabIn1 est: "+tmp1);
		tmp1 = occurrence(tabInt2, 7);
		if(tmp1 == 0)
			System.out.println("Aucune occurrence trouvée de la valeur 7 dans le tableau tabInt2");
		else if(tmp1 == -1)
			System.out.println("le tableau tabInt2 est vide");
		else if(tmp1 == -2)
			System.out.println("tableau manquant");
		else
			System.out.println("Le nombre de fois que la valeur 7 apparait dans le tableau tabInt2 est: "+tmp1);
		Complex comp1 = new Complex(10.3, 5.5);
		int tmp2 = occurrence(tabComp1, comp1);
		if(tmp2 == 0)
			System.out.println("Aucune occurrence trouvée du nombre complex " +comp1+ " dans le tableau tabComp1");
		else if(tmp2 == -1)
			System.out.println("le tableau tabComp1 est vide");
		else if(tmp2 == -2)
			System.out.println("tableau manquant");
		else
			System.out.println("Le nombre de fois que le nombre complex " +comp1+ " apparait dans le tableau tabComp1 est: "+tmp2);
		Complex comp2 = new Complex(6.6, 8.8);
		int tmp3 = occurrence(tabComp2, comp2);
		if(tmp3 == 0)
			System.out.println("Aucune occurrence trouvée du nombre complex " +comp2+ " dans le tableau tabComp2");
		else if(tmp3 == -1)
			System.out.println("le tableau tabComp2 est vide");
		else if(tmp3 == -2)
			System.out.println("tableau manquant");
		else
			System.out.println("Le nombre de fois que le nombre complex " +comp2+ " apparait dans le tableau tabComp2 est: "+tmp3);
		Fraction frac1 = new Fraction(5, 7);
		int tmp4 = occurrence(tabFrac1, frac1);
		if(tmp4 == 0)
			System.out.println("Aucune occurrence trouvée de la fraction " +frac1+ " dans le tableau tabFrac1");
		else if(tmp4 == -1)
			System.out.println("le tableau tabFrac1 est vide");
		else if(tmp4 == -2)
			System.out.println("tableau manquant");
		else
			System.out.println("Le nombre de fois que la fraction " +frac1+ " apparait dans le tableau tabFrac1 est: "+tmp4);
		Fraction frac2 = new Fraction(15, 8);
		int tmp5 = occurrence(tabFrac2, frac2);
		if(tmp5 == 0)
			System.out.println("Aucune occurrence trouvée de la fraction " +frac2+ " dans le tableau tabFrac2");
		else if(tmp5 == -1)
			System.out.println("le tableau tabFrac2 est vide");
		else if(tmp5 == -2)
			System.out.println("tableau manquant");
		else
			System.out.println("Le nombre de fois que la fraction " +frac2+ " apparait dans le tableau tabFrac2 est: "+tmp5);
	}
}