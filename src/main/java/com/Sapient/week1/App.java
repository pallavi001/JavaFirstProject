package com.Sapient.week1;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
	CheckEven C= new CheckEven();
	int n;
	public Boolean a=C.check(n);
}
class CheckEven
{
	CheckEven()
	{
		
	}
    public Boolean check(int n)
    {
        Boolean result=false;
        if(n%2==0)
        {
            result= true;
        }
        return result;
    }
}
