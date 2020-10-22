import java.util.Scanner;

/*
* Author :
*Date
*Description
*97 et plus Excellent
*93 et plus very good
*85 et plus Good
*74 et plus Satisfactory
*63 et plus Mediocre
*53 et plus Poor
*50 et plus very poor
*/
public class MesNotesIf
{

		public static void main(String[] args)
			{
				int maNote;
				Scanner sc = new Scanner(System.in);
				System.out.println("Quelle est ta note ?");
				maNote = sc.nextInt();

				if ((maNote > 100) || (maNote < 50))
					System.out.println("Note invalide");
				else if (maNote >= 97)
					System.out.println("Excellent");
				else if (maNote >= 93)
					System.out.println("Very Good");
				else if (maNote >= 85)
					System.out.println("Good");
				else if (maNote >= 74)
					System.out.println("Satisfactory");
				else if (maNote >= 63)
					System.out.println("Mediocre");
				else if (maNote >= 53)
					System.out.println("Poor");
				else
					System.out.println("Very Poor");
sc.close();
			}

	}
