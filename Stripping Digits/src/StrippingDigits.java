import java.util.Scanner;

public class StrippingDigits
	{
	private static int nappa=12345678;
	private static int [] ghost= new int[8];
	
	public static void challenge1()
	{
	int digit = 7654321;
	int [] myArray= new int [7];
	
	for(int i=0;i<7;i++)
		{
		myArray[i]=digit%10;
		digit=digit/10;
		}
	for (int fred: myArray)
		{
		System.out.println(fred);
		}
	}
	public static void challenge2()
		{
		int counter=0;

		for(int x=0; x<8; x++)
			{
			ghost[x]=nappa%10;
			nappa=nappa/10;
			counter = counter+1;
			}
		System.out.println("there are "+counter+" digits in 12345678.");
				
		}
	public static void challenge3()
		{
		int total=0;
		for (int y=0;y<8; y++)
			{
			if(ghost[y]%2==1)
				{
				total=total+1;
				}
			}
		System.out.println("There are "+total+" occurences of an odd number.");
		}
	public static void challenge4()
		{
		int total=36;
		for (int y=0;y<8; y++)
			{
			ghost[y] = nappa%10;
			total = total + ghost[y];
			nappa = nappa/10;
			}
		System.out.println("The total of the digits is "+total+".");
		}
	public static void challenge5()
		{
		System.out.println("Input a number over 100.");
		Scanner file = new Scanner (System.in);
		int goku = file.nextInt();
		int vegeta = goku%10;
		int krillin = 10-vegeta;
		if (vegeta==0)
			{
			System.out.println(goku);
			}
		else if (vegeta>4)
			{
			System.out.println(krillin+goku);
			}
		else 
			{
			System.out.println(goku-vegeta);
			}
		
		}

	public static void main(String[] args)
		{
		challenge1();
		challenge2();
		challenge3();
		challenge4();
		challenge5();
		}

	}
