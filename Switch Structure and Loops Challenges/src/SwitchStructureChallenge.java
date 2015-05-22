
public class SwitchStructureChallenge
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
					{"navy","blue","yellow","white","grey"};
		int makeupMind= (int) (Math.random()*4);
		System.out.println(polo[makeupMind]);

		}

	}
