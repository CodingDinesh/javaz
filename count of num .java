import java.util.*;
class Main{
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int c=0;
     int n=sc.nextInt();
     while(n>0)
     {
         int r=n%10;
         c++;
         n/=10;
     }
     System.out.println(c);
 }
}
