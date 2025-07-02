import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>35 && b>35 && c>35)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
