package dk.itu.kf13.hello;
import static org.junit.Assert.*;

import org.junit.Test;


public class HelloWorldTest {

	@Test
	public void test() {
	HelloWorld helloWorld = new HelloWorld();
	String underTest = helloWorld.greet("test");
	
	assertEquals("Hello, test", underTest);
		
	}

}
