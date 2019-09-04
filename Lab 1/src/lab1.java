
public class lab1 {

	public static void main(String[] args) {
		//System.out.println(implication());
		//System.out.println(equality());
		//System.out.println(disjunction());
		//System.out.println(NAND());
		System.out.println(NOR());
	}

	public static boolean implication() {
		int a = 5;
		int b = 5;
		int c = 10;
		if (a + b == c) {
			System.out.print("The implication is ");
		}
		return a + b == c;
	}

	public static boolean equality() {

		int x = 7;
		int s = 7;
		if (x == s) {
			System.out.println("The statement is equal because " + x + " is equal to " + s);
			return x == s;
		} else {
			System.out.println("The statement is not equal because " + x + " is not equal to " + s);
			return x == s;
		}
	}

	public static boolean disjunction() {

		int x = 7;
		int s = 8;
		if (x == s) {
			System.out.println("The statement is equal, which is not a disjunction");
			return x == s;
		} else {
			System.out.println("The statement is not equal, also known as an Exclusive disjunction");
			return x == s;
		}
	}
	public static boolean NAND() {
		boolean x = true;
		boolean y = true;
		
		if (!(x && y)) {
			System.out.print("The NAND is ");
			return (!(x&&y));
		}
		else {
			System.out.print("The NAND is ");
		return (!(x&&y));
		}
	}
		public static boolean NOR() {
			boolean x = false;
			boolean y = false;
			
			if (!(x || y)) {
				System.out.print("The NOR is ");
				return (!(x || y));
			}
			else {
				System.out.print("The NOR is ");
			return (!(x || y));
			}
	}
}
