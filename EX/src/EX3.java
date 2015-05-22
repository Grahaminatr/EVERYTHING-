
public class EX3
	{

	public static void main(String[] args)
		{
		
	long total=0;
	for(int i = 0; i< 358000000;i++){
	total+=i;
	int sqrt= (int) Math.sqrt(total);
	if(sqrt*sqrt==total)
		{
		System.out.println(total);
		}
	}
		}

	}
