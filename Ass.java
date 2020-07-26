import java.util.Scanner;
public class Ass

{
	public static void main(String args[])
	{
		int M,B;
		Scanner s=new Scanner(System.in);
		int flag=0;
		
		do{
		System.out.println("Michael enter number on chit:");
		M=s.nextInt();
		
		System.out.println("Bruce enter number on chit:");
		B=s.nextInt();
		
		
		if(M<B)
		{
			System.out.println("Michael forget the girl and get out of others way");
			break;
		}
		else if(M==B) 
		{
			System.out.println("Its a tie try again");
			flag=1;
			
		}
	    else
		{
			System.out.println("Bruce forget the girl and get out of others way");
			break;
		}
	
		}while(flag==1);
	}

}
/***********output******************





