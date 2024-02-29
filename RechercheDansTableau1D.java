package tp_02.tableau1d;
public class RechercheDansTableau1D{
	public static void main(String[] args){
		int[] tabInt = {2, 6, 8, 9, 7, 2, 5, 20, 30, 40};
		int tmp = rechEntier(tabInt, 7);
		if(tmp == -1)
			System.out.println("La valeur 7 n’existe pas dans le tableau");
		else if(tmp == -2)
			System.out.println("le tableaux est vide");
		else if(tmp == -3)
			System.out.println("vérifier les parameter de a foncion");
		else
			System.out.println("La valeur val 7 se trouve dans la case d’indice "+tmp);
	}
	public static int rechEntier(int[] tabInt, int a){
		if(tabInt == null)
			return -3;
		if(tabInt.length == 0)
			return -2;
		for(int i=0; i<tabInt.length; i++){
			if(tabInt[i] == a)
				return i;
		}
		return -1;
	}
}