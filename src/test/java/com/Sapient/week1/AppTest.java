package com.Sapient.week1;

/* import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite; */
 import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*; 

public class AppTest
{
	private App ap;
	
	 @Before
    public void setup() {
        ap = new App();
    }
	
	@Test
    public void testCheckEven() 
	{
		int n=4;
        Boolean ch=ap.C.check(n);
        assertTrue(ch == true);
    }
	@Test
	@Ignore
    public void testCheckodd() 
	{
		int n=5;
        Boolean ch=ap.C.check(n);
        assertTrue(ch == true);
    }
	@Test
    public void testChecknull() 
	{
		int n=0;
        Boolean ch=ap.C.check(n);
        assertTrue(ch == true);
    }
	
}

