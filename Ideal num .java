import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(Syste }
}m.in);
int sum=0;
int n=sc.nextInt();
for(int i=1;i<n;i++)
{
if(n%i==0)
{
sum+=i;
}
}
if(sum==n)
{
System.out.println("Perfect Number");
}
else
{
System.out.println("Not Perfect Number");
}
}
}
