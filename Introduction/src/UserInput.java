import java.util.Scanner;
//bonjour
/*
* Author : 
*Date : 21-Sep-2020
*/
public class UserInput
	{

		public static void main(String[] args)
			{
				String monNom="";
				int a=0; int b=0;
				Scanner sc=new Scanner(System.in);
				//chaine de caractères
				System.out.println("Quel est ton nom :");
				monNom=sc.nextLine();
				System.out.println("année de naissance :");
				a=sc.nextInt();
				System.out.println("Nombre représentant mois de naissance :");
				b=sc.nextInt();
				
				System.out.println("Bonjour "+monNom);
				System.out.println("Tu es né en "+a+ " au mois " + b);
				
				
				sc.close();

			}

	}
