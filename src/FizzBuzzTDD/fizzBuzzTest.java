/**
 * 
 */
package FizzBuzzTDD;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author owner1
 *
 */
public class fizzBuzzTest {

//	@Test
	//public void test() {
		//fail("Not yet implemented");
	//}

	@Test
	public void test1(){
		assertEquals("1", fizzBuzzClass.fizzBuzzProcessor(1));
	}
	@Test
	public void test2(){
		assertEquals("2", fizzBuzzClass.fizzBuzzProcessor(2));
	}
	@Test
	public void test3(){
		assertEquals("Fizz", fizzBuzzClass.fizzBuzzProcessor(3));
	}
	
	@Test
	public void test4(){
		assertEquals("4", fizzBuzzClass.fizzBuzzProcessor(4));
	}
	@Test
	public void test5(){
		assertEquals("Buzz", fizzBuzzClass.fizzBuzzProcessor(5));
	}
	@Test
	public void test6(){
		assertEquals("Fizz", fizzBuzzClass.fizzBuzzProcessor(6));
	}
	
	
	@Test
	public void test10(){
		assertEquals("Buzz", fizzBuzzClass.fizzBuzzProcessor(10));
	}
	
	//@Test
	//public void test15(){
	//	assertEquals("FizzBuzz", fizzBuzzClass.fizzBuzzProcessor(15));
	//}
	
}
