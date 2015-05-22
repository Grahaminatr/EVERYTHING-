import java.util.Scanner;


public class PseudoRandom
	{

	public static void main(String[] args)
		{
		int dieOne= (int)(Math.random()*6)+1;
		int dieTwo= (int)(Math.random()*6)+1;
		System.out.println(dieOne+dieTwo);
		
		int heads=0;
		int tails=0;
		for (int x=0; x<1000; x++)
			{
			int results= (int) (Math.random() *2)+1;
			if (results==1)
				{
					heads=heads+1;
				
				}
			else
			{
				tails=tails+1;
			}
			}
		System.out.println("There are "+heads+" heads and "+tails+" tails");
		String[]polo=
					{"Navy","Blue","Yellow","White","Gray"};
		int makeupMind= (int) (Math.random()*4);
		System.out.println(polo[makeupMind]);
		switch(makeupMind)
		{
		case 0:System.out.println("happy");break;
		case 1:System.out.println("happy");break;
		case 2:System.out.println("sad");break;
		case 3:System.out.println("sad");break;
		case 4:System.out.println("sad");break;
		}
		Higherthan();
		}
		public static void askContinue()
			{
				Scanner keyboard=new Scanner(System.in);
				String String = "";
				do
					{
					System.out.println("do you want to A.)continue or B.)not continue");
					}
			}
		public static void Higherthan()
		{
		int rannum=0;
		int counter=0;
		while (rannum < 90)
			{
			rannum = (int)(Math.random()*100)+1;
			counter= counter +1;
			}
		if(counter ==1)
			{
			System.out.println("It took "+counter+" try to generate a ninety or above.");
			}
		else
			{
			System.out.println("It took "+counter+" tries to generate a ninety or above.");
			}
		
		}
		
	}
