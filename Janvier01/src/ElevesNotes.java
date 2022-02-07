import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevesNotes {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		List<String>maListe=new ArrayList<>();// pour les noms
		List<Integer>mesNotes=new ArrayList<>(); // pour les notes
		double moyenne=0;
		
		int n=1;
		char rep;
		do
		{
		 System.out.println("Nom de l'élève " + n + " suivi de sa note");	
		 maListe.add(sc.next());
		 mesNotes.add(sc.nextInt());
		 moyenne+=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Encore ?");
		 rep=Character.toLowerCase(sc.nextLine().charAt(0));
		 n++;
		}while(rep=='o');
		
		
		for(int i=0;i<maListe.size();i++)
		{
			System.out.print(maListe.get(i)+ "\t");
			System.out.println(mesNotes.get(i));
		}
		
		
	sc.close();
	
	}

}
