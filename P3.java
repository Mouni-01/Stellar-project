import java.util.*;
public class P3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int m1=sc.nextInt();
		int n1=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int m2=m+m1;
		int n2=n+n1;
		int ta=m+m2;
		int to=n+n2;
		int ra=ta-x;
		int ro=to-y;
		System.out.println(ra);
		System.out.println(ro);

	}

}
