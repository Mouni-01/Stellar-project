import java.util.*;
public class P6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float m=sc.nextFloat();
		float n=sc.nextFloat();
		float a=n-m;
		float b=a*25;
		System.out.printf("Distanced travelled :%.2f",a);
		System.out.println("\nPetrol used :"+Math.round(b));
		
	}
}