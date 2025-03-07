import java.util.Scanner;
public class Arr3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int c=1;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j])
				{
					c++;
					System.out.println(a[i]+" : "+c);
				}
				c=1;
			}
			System.out.println(a[i+1]+" : "+c);
		}
	}
}
