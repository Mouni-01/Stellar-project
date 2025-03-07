import java.util.*;
public class P8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%10==3||n%10==8)
			System.out.println("Lucky winner");
		else
			System.out.println("looser");

	}

}
