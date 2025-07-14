import java.util.*;
class Main
{
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt(); int r;
     int count=0;
     while(n>0)
    {   
         r=n%10;
         if(r%2!=0)
         {
         count++;
         }
         n/=10;
    }
     System.out.println(count);
 }
}
