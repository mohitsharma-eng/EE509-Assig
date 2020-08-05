
public class ExpRandGenerator //used for generating random numbers
{
	public double genRandom(double d)	//takes in lamdu or mu
	{
		double x = Math.round((-1000000000/d)*Math.log(Math.random()));	//outputs changed to nanoseconds	
		
		return x;
	}
}
