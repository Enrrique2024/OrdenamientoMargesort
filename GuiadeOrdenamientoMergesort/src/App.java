public class App{

    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, left + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;

        int [] templeft = new int[sizeLeft];
        int [] tempright = new int [sizeRight];

        for (int i = 0; i < sizeLeft; i++) {
            templeft[i] = arr[left + i];
        }
        for (int j = 0; j < sizeRight; j++) {
            tempright[j] = arr[mid + 1 + j];
        }

        int i = 0;  int j = 0;
        int k = left;
    
    while (i < sizeLeft && j < sizeRight) {
            if (templeft[i] <= tempright[j]) {
                arr[k] = templeft[i];
                i++;
        } else {
                arr[k] = tempright[j];
                j++;
            }
            k++;
        }
        
        while (i < sizeLeft) {
            arr[k] = templeft[i];
            i++;
            k++;
        }
        
        while (j < sizeRight) {
            arr[k] = tempright[j];
            i++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);

    System.out.println("Arreglo ordenado:");
    for (int num : arr) {
        System.out.print(num +" ");
        }
    }
}
    

