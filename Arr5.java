import java.util.*;
public class Arr5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt(),s=0,sum=0;
		int f;
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==j) {
					s+=a[i][j];
				}
				if(i+j==n-1) {
					sum+=a[i][j];
				}
			}
		}
		f=s+sum;
		System.out.print(f);
			
	}

}
