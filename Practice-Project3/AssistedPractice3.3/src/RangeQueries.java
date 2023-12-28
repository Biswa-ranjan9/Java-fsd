
class RangeQueries{
	static int sumNatural(int n)
	{
		int sum = (n * (n + 1)) / 2;
		return sum;
	}
	static int suminRange(int l, int r)
	{
		return sumNatural(r) - sumNatural(l - 1);
	}

	public static void main(String[] args)
	{
		System.out.println("Sum of Natural numbers from L to R is "+suminRange(2, 5));
		System.out.println("Sum of Natural numbers from L to R is "+suminRange(0, 5));
		System.out.println("Sum of Natural numbers from L to R is "+suminRange(2, 4));
		 
	}
}
