public class PrefixSum{
    static void printArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    static int[] createPrefixSumArray(int[] arr){
        int n = arr.length;
        int[] prefixArr = new int[n];
        prefixArr[0]=arr[0];
        for(int i=1;i<=n-1;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }
        return prefixArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] prefixArr= PrefixSum.createPrefixSumArray(arr);
        PrefixSum.printArray(arr);
        System.err.print("\n");
        PrefixSum.printArray(prefixArr);
        // System.out.println(PrefixSum.printArray(arr));
    }
}