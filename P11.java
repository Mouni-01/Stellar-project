import java.util.*;
public class P11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int s=a+b+c;
		if(s==180) {
			if((a==b)&&(b==c)&&(a==c))
				System.out.println("Prize 3");
			else if(a=90||b=90||a=90)
				System.out.println("Prize 2");
			else if((a!=b)&&(b!=c)&&(a!=c))
				System.out.println("Prize 1");
			else
				System.out.println("In valid");
		}
		else
			System.out.println("In valid");

	}

}
