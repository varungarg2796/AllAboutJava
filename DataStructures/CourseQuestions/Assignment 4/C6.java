public class C6 {

	public static int MinValueIndex(int[] A, int n) {
		int minValue = A[0];
		
		for (int k = 1; k <= n - 1; k++) {
			
			if (minValue > A[k]) {
				minValue = A[k];
			}
			
        }
        
		System.out.println(minValue);
		System.out.println(A.length);
		return minValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]= new int[100000000];
		for(int i = 0; i < 100000000; i++) {
		    A[i] = (int)(Math.random() * 100) + 1;
        }
        double duration = 0;
        long end = 0;
        long start = 0;
        start = System.currentTimeMillis();
        System.out.println(start);
        MinValueIndex(A, 6);
        end = System.currentTimeMillis();
		duration = end-start;
		System.out.println(end);        
		duration = duration / 5;
		System.out.println(duration);
	}
}