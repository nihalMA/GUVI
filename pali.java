import java.util.*;
class pali
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=0,r=0;
        int p=n;
        if(n>=1000||n>=0)
        {
        while(n>0)
        {
            t=n%10;
            r=r*10+t;
            n=n/10;
        }
        }
        if(p==r)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
        
    }
}
