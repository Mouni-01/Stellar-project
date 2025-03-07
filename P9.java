import java.util.*;
public class P9 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=85)
		System.out.println("the grade is A");
		else if(a>=75)
			System.out.println("the grade is B");
		else if(a>=65)
			System.out.println("the grade is C");
		else
			System.out.println("the grade is D");
	}

}