import java.lang.*;
class ArmstrongRange 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
		int n=i,count=0,copy=n,sum=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		n=copy;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+(int)Math.pow(rem,count);
			n/=10;
		}
		n=copy;
		if(sum==n)
			System.out.println(n);
		}


	}
}
