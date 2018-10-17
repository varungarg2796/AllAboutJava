


public class mergeSort{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
    }

    public static void merge(
        int[] a, int[] l, int[] r) {
         int left = l.length;
         int right = r.length;
          int i = 0, j = 0, k = 0;
          while (i < left && j < right) {
              if (l[i] < r[j]) {
                  a[k] = l[i];
                  i++;
                  k++;
              }
              else {
                  a[k] = r[j];
                  k++;
                  j++;
              }
          }
          while (i < left) {
              a[k] = l[i];
              k++;
              i++;
          }
          while (j < right) {
              a[k] = r[j];
              k++;
              j++;
          }
          System.out.print("MERGING!!");
          printArray(a);
      }

    public static void MergeSort(int[] a) {
        System.out.print("array a: ");
        printArray(a);
        int len = a.length;
        if (len < 2) {
            return;
        }
        int mid = len / 2;
        int[] l = new int[mid];
        int[] r = new int[len - mid];
     
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < len; i++) {
            r[i - mid] = a[i];
        }
        MergeSort(l);
        MergeSort(r);
     
        merge(a, l, r);
    }
    
    public static void main(String[] args){
        int a[] = {10,9,76,73,100};
        int b[] = {2,11,18,30};

        MergeSort(a);
    }
}
