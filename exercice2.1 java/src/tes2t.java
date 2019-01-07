import java.util.Scanner;

public class tes2t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir votre nom");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str); 
		System.out.println(str.toUpperCase());


		System.out.println("veuillez saisir votre prénom");
		String st = sc.nextLine();
		System.out.println("Vous avez saisi : " + st);

		st=st.substring(0,1).toUpperCase()+ st.substring(1).toLowerCase();
		System.out.println(" "+ st);
	}

}

