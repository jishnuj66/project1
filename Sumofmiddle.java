import java.util.*;
public class Sumofmiddle
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		String n = sc.next();
		int len = n.length();
		int mid=len/2;
		int a,b;
		if(len%2==0)
		{
		    a=n.charAt(mid-1)-'0';
		    b=n.charAt(mid)-'0';
		}
		else
		{
		    a=n.charAt(mid)-'0';
		    b=n.charAt(mid+1)-'0';
		}
		System.out.println("Result: "+(a+b));
	}
}
