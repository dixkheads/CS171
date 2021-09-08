package assignment1;

public class GoodNumbers 
{
	public static int countGoodNumbers(long n)
	{
		int count = 4;
		for(int i = 0; i < n - 1; i++)
		{
			if(i % 2 == 0)
			{
				count *= 4;
			}
			else
			{
				count *= 5;
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		System.out.print(countGoodNumbers(10));
	}
}
