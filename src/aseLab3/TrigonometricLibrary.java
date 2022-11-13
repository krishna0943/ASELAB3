package aseLab3;

public class TrigonometricLibrary {
	
	public static double PI = 3.141592; // Value of PI
	
	
	//Method for Converting Degree to Radian
	public static double degreeToRadian (double degree) 
	{
		return (degree * PI)/ 180 ;
	}
	
	//Method for Converting Radian to Degree
	public static double radianToDegree(double radian) 
	{
		return (radian * 180)/ PI;
	}
	
	//Method for normalizing the radian in all four quadrants
	public static double normalizeRadian (double rad)
	{
		return rad % (PI*2);
	}
	
	//Method for Calculating factorial 
	public static long factorial(double n) 
	{
		long j=1;
			
		if(n>=0)
		{
			for(int i=1;i<=n;i++)
			{
				j=j*i;		
			}
		}	
		
		return j;
	}
	
	//Method for Calculating base to the power
	public static double power(double base, double p) throws Exception
	{
		double s=1;
			
		if(p == 0)
			return s;
			
		if(p<0)
			throw new Exception("Invalid power value entered");
			
		while(p!=0)
		{
			s = s * base;
			p--;
		}	
		
		return s;	
	  }
		
	   //Method for calculating sin function based on Taylor Series
		public static double sinFunction(double angle) throws Exception
		{
			double sin=0;
			double normAngle = normalizeRadian(angle);// This will make sure that the value of x is a value between -2*PI and 2*PI
			for(int i=0;i<=10;i++)
			{
				sin = sin + (power(-1, i)* power(normAngle,2*i+1 )/factorial(2*i+1));
			}
			return sin;
		}
		
		//Method for calculating cos function based on Taylor Series
		public static double cosFunction(double angle) throws Exception
		{
			double cos=0;
			double normAngle = normalizeRadian(angle);// This will make sure that the value of x is a value between -2*PI and 2*PI
					
			for(int i=0;i<=10;i++)
			{	
				cos = cos + (power(-1, i)*power(normAngle, 2*i)/factorial(2*i));
			}
			
			return cos;
		}
		
		//Method for calculating tan function based on Taylor Series
		public static double tanFunction(double angle) throws Exception
		{
			double tan=0;
			
			tan = sinFunction(angle) / cosFunction(angle);
			
			return tan;
		}
	
}
