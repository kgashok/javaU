/**
 * 
 */
package function;

/**
 * @author Advik
 *
 */
public class Functions {

	public static String hello() {
		return "hello";
	}

	public static int add(int i, int j) {
		return i+j;
	}

	public static int ftoc(int i) {
		// [°C] = ([°F] - 32) × 5/9
		return (i - 32) * 5 / 9;
	}

	public static String[] makeArray(String string, String string2,
			String string3) {
		String[] array = new String[3];
		array[0] = string; array[1] = string2; array[2] = string3;
		return array;
	}

	public static int add(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++)
			sum += numbers[i];
		return sum;
	}

}
