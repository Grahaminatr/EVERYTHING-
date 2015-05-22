import java.util.ArrayList;
public class Doge
	{
		private String name;
		private String breed;
		private int age;
		private double weight;
		
		public Doge (String n, String b, int a, double w)
			{
			name=n;
			breed=b;
			age=a;
			weight=w;
			}
		
		
		
		
		
	public String getName()
			{
			return name;
			}





		public String getBreed()
			{
			return breed;
			}





		public int getAge()
			{
			return age;
			}





		public double getWeight()
			{
			return weight;
			}





		public static void main(String[] args)
		{
		ArrayList<Doge> kennel= new ArrayList<Doge>();
		double totalAge=0;
		double totalWeight=0;
		
		kennel.add(new Doge ("WOW", "Shina Inu", 24, 67.5));
		kennel.add(new Doge ("TPain", "Great Dane", 6, 397));
		kennel.add(new Doge ("Java", "Black Lab", 2, 98.3));
		kennel.add(new Doge ("Tibetan Mastiff", "Tibetan Mastiff", 4, 7.0));
		kennel.add(new Doge ("Travis", "Cocker Spaniel", 3, 64.7));
		
		for(int x=0; x<kennel.size(); x++)
			{
			System.out.println(kennel.get(x).getName()+" the "+kennel.get(x).getBreed()+" is "+kennel.get(x).getAge()+" and is "+kennel.get(x).getWeight()+" weighes ");
			totalAge=totalAge+kennel.get(x).getWeight();
			totalWeight=totalWeight+kennel.get(x).getWeight();
			
			}
		System.out.println("the average age is "+totalAge/kennel.size());
		System.out.println("the total weight is "+totalWeight);
		
		
		
		}
}
