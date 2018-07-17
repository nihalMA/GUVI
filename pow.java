import java.util.*;
class pow
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t=0;
        if(a>0&&b>0)
        {
        t=(int)Math.pow(a,b);
        System.out.print(t);
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}
