

public class C10 {

	public static int LinearSearch(int[] A, int n, int q) {
		long startTime = System.currentTimeMillis();
		int index = 0;
		while (index < n && A[index] != q) {
			index = index + 1;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");
		if (index == n) {
			return -1;
		} else {
			return index;
		}
	}

	public static void main(String[] args) {

		double duration = 0;
		for (int k = 1; k <= 10; k++) {
			int size = 1000000 * k;
			int A[] = new int[size];
			for (int i = 0; i < size; i++) {
				A[i] = (int) (Math.random() * 100) + 1;
			}
			long startTime = System.currentTimeMillis();
			LinearSearch(A, A.length, 5);
			long endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("That took " + (duration) + " milliseconds for size of" + size + " million");
		}
	}
}

// 1 = 5.4
// 2 = 
