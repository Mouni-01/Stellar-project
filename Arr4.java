import java.util.Scanner;

public class Arr4
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int f=1;
	   for (int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=i+1;j<n;j++)
	    	{
	    		if(arr[i]==arr[j]) {
	    		    	System.out.println("the first repeating element is "+arr[i]);
	    		}
	    		break;
	    	}
	    	
	    
	    	}
	    }
	    
}