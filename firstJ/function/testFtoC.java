/**
 * 
 */
package function;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Advik
 *
 */
public class testFtoC {

	@Test
	public void test() {
		// fail("Not yet implemented");
		assertEquals(0, Functions.ftoc(32));
		assertEquals(100, Functions.ftoc(212));
        assertEquals(50, (int)Functions.ftoc(123));
        assertEquals(37, (int)Functions.ftoc(99));
	}

}
