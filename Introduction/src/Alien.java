import java.util.Scanner;


public class Alien
	{

		public static void main(String[] args)
			{
				int antenna;
				int eyecount;
				Scanner sc=new Scanner(System.in);
				System.out.println("How many antennas?");
				antenna=sc.nextInt();
				System.out.println("How many eyes?");
				eyecount=sc.nextInt();
				
			if((antenna<=2)&&(eyecount==3))
			{
				System.out.println("VladSaturnian");
				System.out.println("GraemeMercurian");
			}
				else if((antenna>=3)&&(eyecount<=4))
				{
					System.out.println("TroyMartian");
				}
					else if((antenna<=6)&&(eyecount>=2))
				{
					System.out.println("VladSaturnian");
						}
						else if((antenna<=2)&&(eyecount<=3))
						{
							System.out.println("GraemeMercurian");
							}
				
				sc.close();

			}

	}
