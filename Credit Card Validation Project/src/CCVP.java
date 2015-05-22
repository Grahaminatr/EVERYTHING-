import java.util.Scanner;
public class CCVP {
	static long userNumber;
	public static void run()
	{
		long[] inputNumber=new long[16];
		long[] twodigits =new long[2];
		long nappa;
		long total=0;
		long goku;
		Scanner Check = new Scanner(System.in);
		System.out.println("Enter your sixteen digits to complete order for pizza.");
		userNumber=Check.nextLong();
		goku=userNumber;
		for(int x = 0;x<16;x++)
		{
			inputNumber[x]=userNumber%10;
			userNumber=userNumber/10;
		}
		for (int y = 0; y<16; y++)
		{
			if(y%2==1)
			{
				nappa=inputNumber[y]*2;
				if(nappa>9)
				{
					for(int m = 0; m<2;m++)
					{
						twodigits[m]=nappa%10;
						nappa=nappa/10;
					}
					nappa=twodigits[0]+twodigits[1];
				}
				inputNumber[y]=nappa;
			}
			total=total+inputNumber[y];
		}
		if(total%10==0)
			System.out.println("Your credit card is valid. Processing your order");
		else
			System.out.println("I'm sorry, but your card seems to be invalid.");
	}
	public static void main(String[] args)
	{
		run();
	}
}