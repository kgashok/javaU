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
public class MakeArray {

	@Test
	public void test() {
		// fail("Not yet implemented");
        String[] array = Functions.makeArray("my", "dog", "spot");
		assertEquals ("my", array[0]);
		assertEquals ("dog", array[1]);
	}

}
