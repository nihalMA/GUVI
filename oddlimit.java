import java.util.*;
class oddlimit
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>0&&b>0)
        {
        for(int i=a+1;i<=b;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}
