import java.util.Scanner;
public class PrimeNumbers
{
            public static void main(String[] args) 
			{

                        int num1,num2,flag=0;

                        Scanner s= new Scanner(System.in);

                        System.out.print("Enter the lower limit");

                        num1=s.nextInt();

                          System.out.print("Enter the upper limit");

                          num2=s.nextInt();

                        System.out.print("prime numbers between"+num1+"and"+num2+"are:");

                        for(int i=num1;i<=num2;i++)

                       {
						for(int j=2;j<i;j++)
							{
							if(i%j==0)


							{
							flag=0;
							break;
							}

							else
							flag=1;
							}
						}
					if (flag==1)
					System.out.println(i);
				
        }
}