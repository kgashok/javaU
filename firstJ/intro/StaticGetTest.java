/**
 * 
 */
package intro;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Advik
 *
 */

/*
"Finding good names is one of the challenges of crafting software. "
+ "And you need to find them all the time and for everything – "
+ "classes, methods, variables, just to name a few. "
+ "But what makes a name a good name? To quote Oncle Bob: "
+ "‘Three things: Readability, readability, and readability!’ "
+ "Which he defines later one by clarity, simplicity and "
+ "density of expression1." http://buff.ly/1tHFXG0 
*/
	
public class StaticGetTest {

	@Test
	public void test() {
		// fail("Not yet implemented");
		Intro m = new Intro();
		// invocation of static function eliminates need for object
		// Only valid if you at least created one object of type Intro
		assertTrue (Intro.getValue());  
	}

}
