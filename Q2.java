public class Q2
{
	double ans;double salary1;String name;
	void init(double salary,String name_of_employee)
	{
	    salary1=salary;
	    name=name_of_employee;
	   }
	   double calc()
	   {
	       ans=salary1+(50.0/100.0*salary1);
	       return ans;
	   }
	   String we()
	   {
	       String namee=name;
	       return namee;
	   }
	   public static void main()
	   {
	       Q2 obj=new Q2();
	       obj.init(10000,"shoumik");
	       double result=obj.calc();
	       String namee=obj.we();
	       System.out.println(result);
	       System.out.println(namee);
	   }
}
