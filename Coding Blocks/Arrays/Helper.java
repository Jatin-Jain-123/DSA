public class Helper{
    public static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void printArray(int[] arr, int start){
        int n = arr.length;
        for(int i=start;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printArray(int[] arr, int start, int end){
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] createPrefixSumArray(int[] arr){
        int n = arr.length;
        int[] prefixArr = new int[n];
        prefixArr[0]=arr[0];
        for(int i=1;i<=n-1;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }
        return prefixArr;
    }
}