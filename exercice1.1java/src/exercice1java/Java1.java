package exercice1java;

import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un entier");

		try { // permet d'afficher une erreur (if)

			int i = sc.nextInt();
			System.out.println("veuillez saisir un second entier : ");
			int d = sc.nextInt();
			System.out.println("votre résultat est : " +(i + d));
		}

		catch(Exception e) { // permet d'afficher une erreur (eslse)
			System.out.println("Erreur !");
		}
	}
}




