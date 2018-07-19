import java.util.*;
class rev
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ss[]=s.toCharArray();
        int i=0;
        for(char v:ss)
        {
            i++;
        }
       int l=i;
       if(l<=100000)
       {
        for(int n=l-1;n>=0;n--)
        {
            System.out.print(ss[n]);
        }
       }
       else
       {
           System.out.print("Invalid Input");
       }
    }
}
