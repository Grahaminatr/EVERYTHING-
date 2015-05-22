
public class Analyzer
	{
	
	public static void main(String[] args)
		{
			String ghostnappa;
			int total=0;
			int counter=0;
			double happens=0;
			double percentHappens;
			Data.addData();
			System.out.println("There are "+Data.data.size()+" records in this database.");
			
			for(Record r: Data.data)
				{
					if(r.getLetterCode().contains("qqq"))
						{
						total=total+1;
						}
				}
			System.out.println("the total occurences of qqq in Data is "+total+".");
			for(Record rc: Data.data)
				{
					if(rc.getLetterCode().indexOf("g")==0)
						{
						happens=happens+1;
						}
					
				}
			System.out.println("There are "+happens+" that begin with g.");
			percentHappens=(happens/Data.data.size())*100;
			System.out.println(" That is "+percentHappens+"% of the records.");
			
			for(Record rec: Data.data)
				{
					ghostnappa=rec.getLetterCode();
					if(ghostnappa.length()==6)
						{
							counter=counter+1;
						}

				}
			System.out.println("there are "+counter+" lettercodes of length six.");
		}

	}
