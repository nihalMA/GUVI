/*package whatever //do not write package name here */
/*don't follow us on twitter*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    sc.nextLine();
	    while(n-->0)
	    {
		char a[]=(sc.next()).toCharArray();
		int r=a.length-1;
		int l=0;
		for(l=0;l<r;l++,r--)
		{
		    char temp=a[l];
		    a[l]=a[r];
		    a[r]=temp;
		}
		for(int i=0;i<a.length;i++)
		    System.out.print(a[i]);
		System.out.println();
	}
}
}
