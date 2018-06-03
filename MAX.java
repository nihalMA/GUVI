import java.io.*;
import java.util.*;
class MAX
{
    public static void main(String arg[])
    {
        int i,m=0;
        int a[]=new int[30];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<=n;i++)
        {
            if(a[i]>m)
            {
                m=a[i];
            }
        }
        System.out.println("Maximum Number is :"+m);
    }
}
