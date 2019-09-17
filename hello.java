
import java.util.Scanner;
class hello
{
 public static void main(String args[])
	{
	int m=153;
int temp=m;
int r,sum=0;

            while(m>0)
            {
                  r=m%10;
m=m/10;
sum=sum+r*r*r;
             }

             if (temp == sum)
	System.out.println("It is an armstrong number");
	else
	System.out.println("Not an armstrong number");
}
}	
	

