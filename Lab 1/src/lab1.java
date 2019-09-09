
public class lab1 {

	public static void main(String[] args) {
		System.out.println(implication());
		System.out.println(equality());
		System.out.println(disjunction());
		System.out.println(NAND());
		System.out.println(NOR());
	}

	public static boolean implication() {
		boolean a = true;
		boolean b = false;
		if (b == false) {
			System.out
					.print("The value a is " + a + " and the value b is " + b + " which is not a logical "
							+ "implication since b is " + b + ": ");
		return false;
		}
		else {
			System.out.print("The value a is " + a + " and the value b is " + b + " which is a logical implication: ");
			return true;
		}
	}

	public static boolean equality() {

		boolean x = false;
		boolean s = false;
		if (x == s) {
			System.out.print("The statement is equal because " + x + " is equal to " + s + ". Logical equality: ");
			return x == s;
		} else {
			System.out.println("The statement is not equal because " + x + " is not equal to " + s);
			return x == s;
		}
	}

	public static boolean disjunction() {

		boolean x = true;
		boolean s = true;
		if (x != s) {
			System.out.print("x is " + x + " and s is " + s + ", so the disjunction is: ");
			return x || s;
		} else {
			System.out.print("x is " + x + " and s is " + s + ", so the disjunction is: ");
			return x || s;
		}
	}

	public static boolean NAND() {
		boolean x = true;
		boolean y = true;

		if (!(x && y)) {
			System.out.print("Since value x and y are not both true, the NAND is: ");
			return (!(x && y));
		} else {
			System.out.print("The x and y values are both true, which makes a NAND: ");
			return (!(x && y));
		}
	}

	public static boolean NOR() {
		boolean x = true;
		boolean y = false;

		if (!(x || y)) {
			System.out.print("Both x and y values are false, which makes the NOR: ");
			return (!(x || y));
		} else {
			System.out.print("Since the x value is " + x + " and the y value is " + y + ", this makes"
					+ "the NOR value: ");
			return (!(x || y));
		}
	}
}
