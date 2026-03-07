public class Sorting{
    static int[] selectionSort(int[] arr){
        int[] arr_copy = arr.clone();
        int n = arr_copy.length;
        for(int i=0;i<=n-2;i++){
            int min = arr_copy[i];
            int idx = i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<min){
                    min=arr[j];
                    idx = j;
                }
            }
            arr_copy[idx]=arr_copy[i];
            arr_copy[i]=min;
        }
        return arr_copy;
    }
    static int[] bubbleSort(int[] arr){
        int[] arr_copy = arr.clone();
        int n = arr_copy.length;
        for(int i=)
    }
    public static void main(String[] args) {
        
    }
}