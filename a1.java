import java.util.*;
class a1{
public static void main(String arg[])
{
Scanner o=new Scanner (System.in);
int a[]={10,5,6,15,25,35,45,6,7};
int n=a.length;
int i=0;
while(n!=0)
{
	
	
	if(a[i]%5==0)
		System.out.println("  "+a[i]+"HI");
	i++;
	n--;
}
System.out.print("ENd \n"+i+"\n"+n);
}}