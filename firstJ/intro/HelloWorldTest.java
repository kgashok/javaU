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
public class HelloWorldTest {

	@Test
	public final void test() {
		// fail("Not yet implemented");
		Intro m = new Intro();
		assertEquals("Hello World!", m.getWorld());
	}

}
