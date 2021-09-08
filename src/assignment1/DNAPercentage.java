/*THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Harry He*/
package assignment1;

import java.util.Random;

public class DNAPercentage 
{
	static String genMers(double Apos, double Cpos, double Gpos, double Tpos)
	{
		Random rd = new Random();
		String oup = new String();
		for(int i = 0; i < 3; i++)
		{
			double poss = rd.nextDouble();
			if(poss < Apos)
			{
				oup += 'A';
			}
			else if (poss < Cpos + Apos)
			{
				oup += 'C';
			}
			else if (poss < Gpos + Cpos + Apos)
			{
				oup += 'G';
			}
			else
			{
				oup += 'T';
			}
		}
		return oup;
	}
	
	public static void main(String[] args)
	{
		int count1 = 0;
		for(int i = 0; i < 1000; i++)
		{
			if(genMers(0.25, 0.25, 0.25, 0.25).equals("AAA"))
			{
				count1++;
			}
		}
		//Expected 0.25^3*1000
		System.out.println("The possibility for PartI: " + count1);
		int count2 = 0;
		for(int i = 0; i < 1000; i++)
		{
			if(genMers(0.12, 0.38, 0.39, 0.11).equals("AAA"))
			{
				count2++;
			}
		}
		//Expected 0.12^3*1000
		System.out.println("The possibility for PartII: " + count2);
	}
}
