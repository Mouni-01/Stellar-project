import java.util.*;
public class String2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int a=s.length();
		if(a%2==0)
		{
			System.out.print(s.charAt((a/2)-1));
			System.out.print(s.charAt((a/2)));
		}
		else
			System.out.print(s.charAt((a/2)));
	}

}
