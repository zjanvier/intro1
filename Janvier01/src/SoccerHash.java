import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
Author : jzagabe
Date : Jan. 30, 2022
Description :

*/

public class SoccerHash {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> monHash=new HashMap<>();
		
		int n=1;
		char rep;
		do
		{
			System.out.println("Donner le nom du joueur " + n);
			String nom=sc.nextLine();
			System.out.println("Nombre de buts marqués par " + nom);
			int buts=sc.nextInt();
			monHash.put(nom, buts);
			sc.nextLine();
			System.out.println("Suivant ? (O/N)");
			rep=Character.toLowerCase(sc.nextLine().charAt(0));
			n++;
			
		}while(rep=='o');
		
		// Affichage de la liste initiale
				System.out.println("Liste initiale");
				for (String string : args) 
				{
					
				}
				
				
					
					
			
		

		sc.close();
	}

}
