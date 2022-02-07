import java.util.ArrayList;
import java.util.List;

public class Listgen {

	public static void main(String[] args) 
	{
	//Liste genérale
		List maListe=new ArrayList();
		maListe.add("Jules");
		maListe.add(9);
		maListe.add(false);
		maListe.add("Jens");
		maListe.add("Jil");
		
		//System.out.println(maListe.size());
		maListe.set(3, "Jean");
		for(int i=0;i<maListe.size();i++)
		{
			System.out.println(maListe.get(i));
		}
		
	}

}
