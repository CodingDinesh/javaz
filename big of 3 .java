import java.util.*;
class Main
{
    public static void main(String ars[])
{
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>b && a>c)
    {
        System.out.println("a is big");
    }
    else if(b>a && b>c)
    {
        System.out.println("b is big");
    }
    else if(c>a && c>b)
    {
        System.out.println("c is big");
    }
}
    
}
