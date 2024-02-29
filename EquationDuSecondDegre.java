package equation;
// Dans ce program nous utilisons la class Scanner qui fournit plusieurs facilités pour la levture de données à partir du clavier
//Cette class se trouve dans le package java.util fournit par la distribution java
import java.util.Scanner;
// Dèbut de la dèfinition de la class EquationDuSecondDegre
public class EquationDuSecondDegre {
	// Dèclaration de la variable de class sc pour la lecture à partir du clavier 
	static Scanner sc = new Scanner(System.in); // sc représente le clavier
	///////////////////////////////////////////////////////////////////////
	/// Mèthode de class pour la rèsollution de l'équation du second degré
	///////////////////////////////////////////////////////////////////////
	static Solution resolveur(double a, double b, double c){
		double delta = (b*b) - 4*a*c;
		if (delta < 0) return null;
		double x1 = (-b-Math.sqrt(delta))/(2*a);
		double x2 = (-b+Math.sqrt(delta))/(2*a);
		return new Solution( x1, x2 );
	}
	/////////////////////////////////////////////////////////////////
	/// La Méthode principale main
	/////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		int nbSolutions;
		System.out.println("Programme de résollution d'équations : ax² + bx +c");
		System.out.print("Entrer a:");
		a = sc.nextDouble();
		System.out.print("Entrer b: ");
		b = sc.nextDouble();
		System.out.print("Entrer c: ");
		c = sc.nextDouble();
		Solution s = resolveur(a, b, c);
		if (s == null) System.out.println(" L'équation n'as pas de solution. ");
		else System.out.println(s);
	}
}
///////////////////Fin de la class EquationDuSecondDegre ////////////////////
/////////////////////////////////////////////////////////////////////////////
//// Définition de la class Solution pour représenter les solution     //////
class Solution{
	double x1, x2;
	//// Constucteur
	public Solution(double x1, double x2){
		this.x1 = x1; this.x2 = x2;
	}
	//// Vue chaine caractère d'une solution
	public String toString(){
		if (x1 == x2)
			return "Dolution double: x1 = x2 = "+ x1;
		return "2 Solution : x1 = "+ x1 + ", x2 = "+ x2;
	}
}
//// Fin Définition de la class Solution pour représenter les solution ////
///////////////////////////////////////////////////////////////////////////
//========== Fin du code source du fichier equation\EquationDuSecondDegre.java ////