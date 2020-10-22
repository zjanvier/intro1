import java.util.Scanner;

/*
* Author :
*Date : 21-Sep-2020
*/
public class Calcule
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int a,b=0;
				int resultat;
				a=sc.nextInt();
				b=sc.nextInt();
				resultat=a+b;
				System.out.println(resultat);
				sc.close();
			}
	}
