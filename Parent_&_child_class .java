import java.util.*;
class Tarent
{
void show()
{
System.out.println("Parent class");
}}
class Child extends Tarent
{
void show1()
{
System.out.println("child class");
}
}
public class Parent
{
	public static void main(String args[])
	{
		Child a= new Child();
		a.show();
		a.show1();
	}
}


