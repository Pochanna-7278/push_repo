import java.lang.*;
import java.util.*;
class array
{
void largest(int a[])
{
int max=a[0];
int min=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
if(a[i]<min)
{
min=a[i];
}
}
System.out.println(max+"is a maximum element");
System.out.println(min+"is a minimum element");
}
}
class arraytest
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter array elements");
for(int i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
arr obj=new arr();
obj.largest(a);
}
}

