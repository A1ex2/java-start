package net.ukr.jaroshov;

public class Main {

	public static void main(String[] args) {
		int[][] arrays = newArrays();

		outArrays(arrays);
		// поворот 90%
		outArrays(turnArrays(arrays, 1));
		// поворот 180%
		outArrays(turnArrays(arrays, 2));
		// поворот 270%
		outArrays(turnArrays(arrays, 1));
	}

	static int[][] newArrays() {
		int[][] a = new int[6][6];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = j + 1;
			}
		}
		return a;
	}

	static void outArrays(int[][] arrays) {
		for (int[] is : arrays) {
			System.out.print("[");
			for (int i = 0; i < is.length; i++) {
				System.out.print(is[i]);

				if (i < is.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("]");
			System.out.println();
		}
		System.out.println();
	}

	static int[][] turnArrays(int[][] a, int mode) {
		int temp;
		int columm;
		int line = 0;
		if (mode == 1) {
			columm = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = a[i].length - 1; (j >= 0) && (j > columm); j--) {
					temp = a[i][j];
					a[i][j] = a[j][columm];
					a[j][columm] = temp;
				}
				columm++;
			}
		} else if (mode == 2) {
			columm = a.length - 1;
			for (int i = 0; i < a.length; i++) {
				line = a.length-1;
				for (int j = 0; j < (a[i].length) && (line > i); j++) {
					temp = a[line][columm]; 
					a[line][columm] = a[i][j];
					a[i][j] = temp;
					line--;
				}
				columm--;
			}
		}
		return a;
	}
}