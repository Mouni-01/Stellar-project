import java.util.*;
public class P12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=3;
		if(n%4==0&&n%400==0&&n%100==0) {
			a=2;		
		}
		if(a==2)
			System.out.println("Tuesday");
		else if(a==3)
				System.out.println("Wednesday");
			
	}

}
