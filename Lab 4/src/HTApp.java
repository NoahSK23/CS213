class HT {
	private final int SIZE = 11;
	private int kCount = 0;
	private int[] hT;

	public HT() {
		hT = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			hT[i] = -1;
		}
	}// end constructor method

	private int hF(int k) {
		return k % (SIZE);
	}// end hF method

	public boolean insert(int k) {
		int temp = hF(k);
		if (hT[temp] == -1) {
			kCount++;
			hT[temp] = k;
			return true;
		} else {
			int counter = 0;
			while (hT[temp] != -1 && counter != SIZE) {
				temp++;
				counter++;
				if (temp == SIZE)
					temp = 0;
			}
			if (counter == SIZE)
				return false;
			kCount++;
			hT[temp] = k;
			return true;
		}
	}// end insert method

	public boolean find(int k) {
		int temp = hF(k);
		if (hT[temp] == -1)
			return false;
		else if (hT[temp] == 0) {
			int counter = 0;
			while (hT[temp] != k && counter != SIZE) {
				temp++;
				if (temp == SIZE)
					temp = 0;
				counter++;
			}
			if (hT[temp] == k)
				return true;
			else
				return false;
		} else if (hT[temp] == k) {
			return true;
		} else {
			int counter = 0;
			while (hT[temp] != k && counter != SIZE) {
				temp++;
				if (temp == SIZE)
					temp = 0;
				counter++;
			}
			if (hT[temp] == k)
				return true;
			else
				return false;
		}
	}// end find method

	public void display() {
		for (int i = 0; i < SIZE; i++) {
			System.out.print("*> " + hT[i] + " <*");
		}
		System.out.println("**END");
	}// end display method
	
	public void delete(int elem) { // "int elem" will be the number/key to be deleted
		for(int i = 0; i < SIZE; i++) {
			if(hT[i] == elem) {
				for(int j = i; j < SIZE - 1; j++) {
                hT[j] = hT[j+1];
                }
                break;
           	}
        }
		System.out.println("Deleted key " + elem);
	}
}// end class

public class HTApp {

	public static void main(String[] args) {
		HT myHT = new HT();
		myHT.display();
		myHT.insert(11);
		myHT.display();
		myHT.insert(22);
		myHT.insert(33);
		myHT.display();
		myHT.insert(34);
		myHT.insert(47);
		myHT.insert(121);
		myHT.insert(98);
		myHT.insert(69);
		myHT.insert(89);
		myHT.insert(141);
		// myHT.insert(57);
		System.out.println("test for overflow: " + !myHT.insert(287));
		myHT.display();
		boolean found = false;
		int key = 11;
		myHT.delete(11); //deletes key n
		found = myHT.find(key);
		if (found) {
			System.out.println(">> key: " + key + " found <<");
		} else {
			System.out.println(">> key: " + key + " not found <<");
		}
	}
}