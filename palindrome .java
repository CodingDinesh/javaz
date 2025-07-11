import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        int sum=0;
        int temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n/=10; 
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
