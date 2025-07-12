import java.util.*;
class Main{
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     while(n>0){
         int r=n%10;
         if(r%2!=0){    
             int a=r*r;
             
         System.out.print(a);
     }n=n/10;
     }
 }
}
