import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListNomNotes
{

	public static void main(String[] args)
	{
		List <String>myListNom=new ArrayList <>();
		List <Integer>myListNote=new ArrayList <>();
		Scanner sc=new Scanner(System.in);
		int somme=0;
		int n=1;
		char rep;
		do
		{
			System.out.println("Nom de l'eleve " + n);
			myListNom.add(sc.nextLine());
			System.out.println("Note de l'eleve " + n);
			int note=sc.nextInt();
			myListNote.add(Integer.valueOf(note));
			somme+=note;
			sc.nextLine();
			
			System.out.println("Suivant ? (O/N)");
			rep=Character.toLowerCase(sc.nextLine().charAt(0));
			n++;
			
		}while(rep=='o');
		
		for (int i=0;i<myListNom.size();i++)
		{
			System.out.println((i+1) + ". "+myListNom.get(i) + "    " + (myListNote.get(i)+ "%"));
		}
		System.out.println("La moyenne de la classe est " + (double)somme/myListNom.size());
		
       
			

		
		sc.close();	
	}

}
