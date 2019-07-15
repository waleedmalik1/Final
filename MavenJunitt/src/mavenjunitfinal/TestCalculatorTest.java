package mavenjunitfinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculatorTest {

	@Test
	void test() 
	{
	Calculator c=new Calculator();
	int result=c.findMax(1, 2, 3);
	assertEquals(3,result);

		
	}
	@Test
	void test2() 
	{
		Calculator c=new Calculator();
		int result=c.square(2);
		assertEquals(4,result);
	}

}
