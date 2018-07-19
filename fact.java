import java.util.*;
class fact
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long t=1;
        if(n>=0&&n<=20)
        {
            for(int i=1;i<=n;i++)
            {
                t=t*i;
            }
            System.out.print(t);
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}
