package dk.itu.kf13.hello;
/**
 * 
 */

/**
 * Prints out hello world
 * @author z6ap
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		String greeting = helloWorld.greet("Eskandar");
		System.out.println( greeting );
	}

	String greet( String name){
		return "Hello, "+ name;
	}
}
