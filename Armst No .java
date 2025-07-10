import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp;
        int sum=0;
        int r;
        temp=a;
        while(a>0)
        {
            r=a%10;
            sum=sum+(r*r*r);
            a=a/10;
        }
        if(temp==sum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
