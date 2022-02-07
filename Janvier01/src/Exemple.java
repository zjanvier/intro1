
public class Exemple {

	public static void main(String[] args) 
	{
		System.out.println(autre(32,36));

	}
	
	public static int autre(int a, int b)
	{
	    if (a == 0)
	        return b;
	    return autre(b % a, a);
	}

}
