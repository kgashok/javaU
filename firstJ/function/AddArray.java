package function;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddArray {

	@Test
	public void test() {
		// fail("Not yet implemented");
		int[] numbers = new int[]{1, 2, 3, 4};
        assertEquals(10, Functions.add(numbers));
	}

}
