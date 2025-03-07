import java.util.*;
public class Arr6{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int mul=0;
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
				 mul+=(a[i][j])*(a[i][j]);
							
				}
			}
		System.out.print((int)Math.sqrt(mul));
		}
	
	}
