import java.util.*;
public class String4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int a=s1.length();
		int b=s2.length();
		int c=0;
		if(a==b) {
			for(int i=0;i<a;i++) {
		if(s1.charAt(i)!=s2.charAt(i)) {
			c=s1.charAt(i)-s2.charAt(i);
			break;
		}
		else if(c==0)
		{
			c=a-b;
		}
		}
		}
		System.out.print(c);
			
		
		
	}

}
