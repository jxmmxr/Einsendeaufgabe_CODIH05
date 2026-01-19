public class BubbleSortExample {
    static void bubbleSort(int[] values) {
        int n = values.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(values[j-1] > values[j]){
                    //swap elements
                    temp = values[j-1];
                    values[j-1] = values[j];
                    values[j] = temp;
                }
            }
        }
    }
}