
public class Record
	{
		String letterCode;
		int numberCode;
		
		public Record(String lc, int nc)
			{
				letterCode=lc;
				numberCode=nc;
			}
			public String getLetterCode()
				{
				return letterCode;
				}
			public int getNumberCode()
				{
				return numberCode;
				}
			public void setLetterCode(String letterCode)
				{
				this.letterCode = letterCode;
				}
			public void setNumberCode(int numberCode)
				{
				this.numberCode = numberCode;
				}
			
	}
