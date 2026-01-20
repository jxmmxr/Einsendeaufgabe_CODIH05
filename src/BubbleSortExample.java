public class BubbleSortExample {
    static void bubbleSortInteger(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean changed;
        for(int i=0; i < n; i++){
            changed = false;
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    changed = true;
                }
            }
            if (!changed) break;
        }
    }
}