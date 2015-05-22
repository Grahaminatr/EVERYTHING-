import java.util.ArrayList;
import java.util.Scanner;

public class Student


	{
	private String name;
	private int score;
	
	static ArrayList<Student> results= new ArrayList <Student>();
	
	public Student (String n, int s)
		{
			name=n;
			score=s;
		}
	public String getName()
		{
			return name;
		}
	public void setName(String name)
		{
			this.name=name;
		}
	public int  getScore()
		{
			return score;
		}
	public void setScore(int score)
		{
			this.score=score;
		}
	
	
		

	}

