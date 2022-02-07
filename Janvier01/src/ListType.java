import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListType {

	public static void main(String[] args) 
	{
		// listes avec types spécifiques
		List<String>maListe=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=1;  // variable pour numéroter les élèves
		char rep;
		
		do
		{
		 System.out.println("Nom de l'élève " + n);	
		 maListe.add(sc.nextLine());
		 System.out.println("Encore ?");
		 rep=Character.toLowerCase(sc.nextLine().charAt(0));
		 n++;
		}while(rep=='o');
		
		
		for(int i=0;i<maListe.size();i++)
		{
			System.out.println(maListe.get(i));
		}
		
	sc.close();

	}

}
