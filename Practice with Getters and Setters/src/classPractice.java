import java.util.Scanner;


public class classPractice
	{

	
		public static void main(String[] args)
			{
				Student.results.add(new Student("Travis", 69));
				Student.results.add(new Student("Patrick Star", 24));
				Student.results.add(new Student("Donovan", 2));
				Student.results.add(new Student("Goku", 57));
				Student.results.add(new Student("Keith", 98));

		}

		public static void addStudent()
			{
				Scanner userInput=new Scanner(System.in);
				System.out.println("Type in a new name and score.");
				String newName;
				int newScore;
				newName=userInput.nextLine();
				newScore=userInput.nextInt();
				results.add(new Student(newName, newScore));
			}
		
				
				for(int x=0; x<results.size(); x++)
					{
						System.out.println(results.get(x).getName()+" "+results.get(x).getScore());
					}
				Student.addStudent();
				
				for(int x=0; x<results.size(); x++);
	}
}
