package net.ukr.jaroshov;

public class Main {

	public static void main(String[] args) {
//		int[] a = { 1, 2, 3, 4, 5 };
		int[] a = { 1, 2};
		int[] c = {};
		
		outCombination(a, a[0], c);
	}

	static void outCombination(int[] a, int b, int [] c) {
		if (findNumber(c, b) != -1){
			return;
		}
		
		System.out.println(b);
		String temp = "" + b;
		//
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				continue;
			}
			temp = temp + a[i]; 
			System.out.println("" + b + a[i]);
			if (i != 1) {
		//		System.out.println(temp);
			}		
			c[c.length] = a[i];
			outCombination(a, a[i], c);
		}
	}
	
	static int findNumber(int[] a, int number) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == number) {
				index = i;
				break;
			}
		}
		return index;
	}	
}
