import java.util.*;
class Sales
{
public static void main(String args[])
{
int n,max=0;
String N;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number of Sales");
n=sc.nextInt();
int S[]=new int[n];
String Name[]=new String[n];
for(int i=0;i<n;i++)
 {
   System.out.println("Enter the Sale");
    S[i]=sc.nextInt();
   System.out.println("Enter the Name");
    Name[i]=sc.next();
   
 }
max=S[0];
N=Name[0];
for(int i=1;i<n;i++)
 {
   if(S[i]>max)
	{
	    max=S[i];
	    N=Name[i];
	}
  }
System.out.println(max);
System.out.println(N);
}
}
