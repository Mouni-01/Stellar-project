import java.util.*;
public class P10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int d=sc.nextInt();
		if(m>0&&m<=12) {
			if((m==3&&d>=21)||(m==4&&d<=19))
				System.out.println("Aquarius");
			else if((m==4&&d>=21)||(m==5&&d<=19))
				System.out.println("cancer");
			else if((m==5&&d>=21)||(m==6&&d<=19))
				System.out.println("Libra");
			else if((m==6&&d>=21)||(m==7&&d<=19))
				System.out.println("leo");
			else if((m==7&&d>=21)||(m==8&&d<=19))
				System.out.println("kadagam");
			else if((m==8&&d>=21)||(m==9&&d<=19))
				System.out.println("thulam");
			else if((m==9&&d>=21)||(m==10&&d<=19))
				System.out.println("rishabam");
			else
				System.out.println("not valid");		
		}
		
		else
			System.out.println("not valid");

	}

}
