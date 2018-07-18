import java.util.*;
class primelimits
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0,n;
        if(a>0&&b>0)
        {
        for( n=a+1;n<=b;n++)
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.print(n+" ");
            }
            c=0;
        }
        }
        else
        {
            System.out.print("Invalid Input");
        }
        
    }
}
