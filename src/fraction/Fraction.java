package fraction;

public class Fraction {
	private int numerator;
	private int denominator;
	public Fraction()
	{
		numerator = 0;
		denominator = 1;
	}
	public Fraction(int n)
	{
		numerator = n;
		denominator = 1;
	}
	public Fraction(int n, int d)
	{
		numerator = n;
		denominator = d;
	}
	public double toDecimal()
	{
		return (double)numerator/denominator;
	}
	public Fraction simplify()
	{
		int newmerator = 0;
		int denewminator = 0;
		int infinite = 3;
		for (int i = 2; i < infinite; i++)
		{
			if (numerator % i == 0 && denominator % i == 0)
			{
				newmerator = numerator / i;
				denewminator = denominator / i;
				infinite = 1;
			}
			else
			{
				infinite++;
			}
		}
			
		Fraction faction = new Fraction(newmerator, denewminator);
		return faction;
	}
	public String toString()
	{
		return (numerator + "/" + denominator);
	}
	public boolean equals(Fraction f)
	{
		Fraction faction = new Fraction(numerator, denominator);
		if (f.toDecimal() == faction.simplify().toDecimal())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
}
