import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		int res=5*(temp-400);
		
		if(res<100)
			System.out.println("0");
		else
			if(res>100)
				System.out.println("-1");
			else
				System.out.println("0");
		sc.close();

	}

}
