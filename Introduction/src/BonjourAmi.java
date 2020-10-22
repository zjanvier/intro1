import java.util.Scanner;

public class BonjourAmi {

	public static void main(String[] args) {
		Scanner monScan=new Scanner(System.in);
		String monNom;
		monNom=monScan.next();
		System.out.println("Bonjour" +monNom);
				
		monScan.close();
	}

}
