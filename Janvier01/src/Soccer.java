import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Author : jzagabe
Date : Jan. 19, 2022
Description : Programme permettant d'utiliser des listes afin
             d'afficher les noms des joueurs et buts marqués puis de les ranger en fonction de leurs
             performances
*/

public class Soccer {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		List<String> listNoms=new ArrayList<>();
		List<Integer> listButs=new ArrayList<>();
		int n=1;
		char rep;
		do
		{
			System.out.println("Donner le nom du joueur " + n);
			String nom=sc.nextLine();
		    listNoms.add(nom);
			System.out.println("Nombre de buts marqués par " + nom);
			int buts=sc.nextInt();
			listButs.add(Integer.valueOf(buts));
			sc.nextLine();
			
			System.out.println("Suivant ? (O/N)");
			rep=Character.toLowerCase(sc.nextLine().charAt(0));
			n++;
			
		}while(rep=='o');
		
		// Affichage de la liste initiale
		System.out.println("Liste initiale");
		for (int i=0;i<listNoms.size();i++)
		{
			System.out.println(listNoms.get(i) + "    " + (listButs.get(i)));
		}
		//afficher seulement les joueurs retenus
		System.out.println();
		
		System.out.println("Liste des joueurs retenus");
		for (int i=0;i<listNoms.size();i++)
		{
			if(listButs.get(i)>=45)
			{
				System.out.printf("%-20s",listNoms.get(i));
				System.out.print(": ");
				System.out.println(listButs.get(i));
			}
			
		}	
		sc.close();
	}

}
