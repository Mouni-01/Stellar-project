import java.util.Scanner;
public class String6 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int a=s1.length(),f=0;
		for(int i=0;i<=a-4;i++)
		{
			if((s1.charAt(i))==(s1.charAt(i+2))&&(s1.charAt(i+1))==(s1.charAt(i+3)))
			{
				f=1;
				break;
			
			}
		}
		System.out.print(f==1?"YES":"NO");
		

	}
}