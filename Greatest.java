import java.util.*;
public class Greatest
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] ar=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
		    ar[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    int j;
		    for(j=i+1;j<n;j++)
		    {
		        if(ar[i]<=ar[j])
		        break;
		    }
		 if(j==n)
		    System.out.print(ar[i] +" ");
		}
	}
}
