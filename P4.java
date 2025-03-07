import java.util.*;
public class P4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int wd=(a-800)/130;
		int we=wd+10;
		System.out.println("Number of  hours in weekends: "+we);
		System.out.println("Number of hour in week days: "+wd);
	}

}
