import java.util.*;
class Main
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int dinu=sc.nextInt();
 if(dinu%400==0 && dinu%100!=0 || dinu%4==0)
 {
   System.out.println("yes");
 }
 else
 {
    System.out.println("no");
 }
}
}
