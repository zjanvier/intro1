import java.util.Scanner;



public class J1 {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int c=sc.nextInt();
	 int score=a*1+b*2+c*3;
	 
	 if(score>=10)
		 System.out.println("happy");
	 else
		 System.out.println("Sad");

	}

}
