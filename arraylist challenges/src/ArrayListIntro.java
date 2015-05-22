import java.util.ArrayList;
public class ArrayListIntro
	{

	
	public static void main(String[] args)
		{
			ArrayList myArrayList = new ArrayList();
			double sum=0;
			double total=0;
			
			myArrayList.add(2.4);
			myArrayList.add(8.4);
			myArrayList.add(6.9);
			myArrayList.add(2.5);
			myArrayList.add(0.6);
			
			System.out.println(myArrayList);
			
			for(int x=0; x<myArrayList.size(); x++)
				{
				sum=sum+ (double)myArrayList.get(x);
				}
			System.out.println(sum);
			
			myArrayList.remove(2.4);
			myArrayList.add(5.3);
			myArrayList.add(1.7);
			
			for(int i=0; i<myArrayList.size(); i++)
				{
					total=total+(double)myArrayList.get(i); 
				}
			System.out.println(total/myArrayList.size());
			
			
		}

		}
