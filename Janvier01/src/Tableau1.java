import java.util.Arrays;
import java.util.Iterator;

/*
Author : jzagabe
Date : Feb. 4, 2022
Description :

*/

public class Tableau1 {

	public static void main(String[] args) 
	{
		//int []monTab= {9,3,6,5};
		//System.out.println("monTab a la grandeur de "+monTab.length);
		//System.out.println("Le dernier élément a comme valeur "+ monTab[3]);
		
		int []monTab=new int[4];
		//System.out.println(Arrays.toString(monTab));
		int k=9;
		for(int i=0;i<monTab.length;i++)
		{
			monTab[i]=k+5;
			k++;
		}
	
		for(int i=0;i<=monTab.length;i++)
		{
			System.out.println(monTab[i]);
		}
		
		
		/*for(int i=monTab.length-1;i>=0;i--)
		{
			System.out.println(monTab[i]);
		}*/

	}

}
