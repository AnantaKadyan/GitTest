class Driver 
{
	public static void main(String[] args)
	{
		Method o = new Method();
		try
		{
			o.f();
		}
		catch (ExceptionInF e)
		{
			System.out.println("Exception thrown by f() caught in Main");
		}
	}
}