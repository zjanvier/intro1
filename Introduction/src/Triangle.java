import java.util.Scanner;

/*
* Author : 
*Date : 29-Sep-2020
*/
public class Triangle
{

    public static void main(String[] args)
        {
            int angle1, angle2, angle3;
            Scanner sc=new Scanner(System.in);

            angle1=sc.nextInt();
            angle2=sc.nextInt();
            angle3=sc.nextInt();
            int somme=angle1+angle2+angle3;
            if(somme==180)  // pour verifier que c'est un tirangle 
                if((angle1==angle2)&&(angle2==angle3))
                    System.out.println("Equilateral");
                else
                    if((angle1==angle2)||(angle2==angle3)||(angle3==angle1))
                        System.out.println("Isocele");
                    else
                        System.out.println("Scalene");
            else
                System.out.println("C'est n'est pas un triangle");


            sc.close();

        }

}