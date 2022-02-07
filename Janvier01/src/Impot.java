
/*
* Author : Nicole Yu
* Date : Jan. 14, 2022
* Description : Programme qui permet de calculer l'impot qu'une
* personne doit payer en fonction de son revenu annuel
*/
import java.util.*;
public class Impot
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//input
		System.out.println("Nom :"); String nom = input.next();
		System.out.println("Salaire annuel brut :");
		int sb = input.nextInt();
		System.out.println("Dons de biendaisance :");
		int don = input.nextInt();
		
		//output 1er partie
		System.out.println("Monsieur/Madame :" + nom);
		System.out.println("Merci d'avoir produit votre declaration de revenus. D'apres les informations fournies, nous avons calcule votre impot de la maniere suivant :");
		
		boolean depasse = false; double impotd = 0.00; double ri = 0.00;
		//si les bons depasse le limite de 20% de salaire brut, puis calculer le revenu imposable
		if(don>(double)sb*0.2) {
			depasse = true; impotd = (sb*0.2); 
			ri = sb-impotd;
		}
		else {
			ri = sb - don;
		}
		
		//2eme partie de output
		System.out.println("Revenu Brut : $" + sb);
		System.out.println("Contributions don de bienfaisance : $" + don);
		if(depasse) System.out.println("Vos contributions don de bienfaisance a depasse le montant autorise. \nOn a pris le montant admissible pour votre impot qui est de : $"  + impotd);
		System.out.println("Revenu imposable : $" + ri);
		
		//calcule l'impot avec le reste de output
		System.out.print("Impot a payer : $");
		if(ri< 49020) {
			System.out.print(ri*0.15);
		} else if(ri < 98040) {
			System.out.print(ri*0.205);
		} else if(ri < 151978) {
			System.out.print(ri*0.26);
		} else if(ri < 216511) {
			System.out.print(ri*0.29);
		} else {
			System.out.print(ri*0.33);
		} 
		
	}

}
