public class InsertionSort {

    public static void insertionSort(int arr[]) {
        int n = arr.length();
        for(int j = 1; j < n; j++) { //for j = 1 to A.length
            int key = arr[j]; //Insert A[j] into the sorted sequence A[1...j-1]
            int i = j - 1; // i = j - 1
            while ((i > -1) && (arr[i] > key)) { //while i > 0 and A[i] > key
                arr[i + 1] = arr[i]; //A[i + 1] = A[i]
                i--; //i = i - 1
            }
            arr[i+1] = key; A//A[i + 1] = key
        }
    }

}
