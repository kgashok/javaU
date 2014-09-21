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
		// TODO Auto-generated method stub
		return "hello";
	}

	public static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public static int ftoc(int i) {
		// TODO Auto-generated method stub
		// [°C] = ([°F] - 32) × 5/9

		return (i - 32) * 5 / 9;
	}

	public static String[] makeArray(String string, String string2,
			String string3) {
		// TODO Auto-generated method stub
		String[] array = new String[3];
		array[0] = string; array[1] = string2; array[2] = string3;
		return array;
	}


}
