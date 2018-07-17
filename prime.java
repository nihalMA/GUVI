import java.util.*;
class prime
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        if(n>0)
        {
            for(int i=2;i<n-1;i++)
            {
                if(n%i==0)
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.print("yes");
            }
            else
            {
                System.out.print("no");
            }
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}
