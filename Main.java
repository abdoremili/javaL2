package poo.tp02.arrays;
public class Main {
	static Complex[][] tabComp1 = {
		{new Complex(1.2, 1.5), new Complex(2.1, 2.3), new Complex(3.8, 3.9)}, 
		{new Complex(0.2, 0.5), new Complex(1.1, 1.3)}, 
		{new Complex(1.2, 1.5), new Complex(2.1, 2.3), new Complex(3.8, 3.9), new Complex(8.8, 9.9)}, 
		{new Complex(1.2, 1.5)},
		{new Complex(1.2, 1.5), new Complex(2.1, 2.3)}
	};
	static Complex[][] tabComp2 = {
		{new Complex(1.2, 1.5)},
		null,
		{new Complex(1.2, 1.5), new Complex(2.1, 2.3), new Complex(3.8, 3.9), new Complex(8.8, 9.9)}, 
		{},
	};
	static void display2DComplexArray (Complex[][] array){
		System.out.println("Nombre de ligne est: " +(array.length));
		int cmp = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Ligne " +(i+1)+ ":");
			if (array[i] == null) System.out.println("N existe paq");
			else if (array[i].length == 0) System.out.println("La ligne ne contien aucun element. La taille est 0.");
			else {
				System.out.println("elements: ");
				for (Complex complex:array[i]) {
					
					System.out.print(complex+"\t");
					cmp++;
				}
			}
		}
		if (cmp != 0) System.out.println("Nombre total est: " +cmp);
	}
	public static void main(String[] args) {
		display2DComplexArray(tabComp1);
		display2DComplexArray(tabComp2);
	}
}
