import java.util.Scanner;
public class String7 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s3;
		int a=s1.length();
		for(int i=0;i<=a;i++)
		{
			if(s1.charAt(i)==" ")
			{
			s3=	s1.charAt(i+1);
			s3.toUpperCase();
			}
		}
		System.out.print(s1);
	}
}
		