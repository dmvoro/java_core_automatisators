public class Equation 
{

	public static void calcEquation(double a, double b, double c) 
	{
 		if (a != 0) 
    	{
   			double d = (b*b - 4 * a * c);
   			if (d < 0) 
   			{
   				System.out.println("No solution");
   			} 
   			else 
   			{
   				double x1 = (-b + Math.sqrt(d)) / (2 * a);
   				double x2 = (-b - Math.sqrt(d)) / (2 * a);
			}
   		}
    	else 
    	{
			System.out.println("Not quadro");
    	}
 	}   
   
}
