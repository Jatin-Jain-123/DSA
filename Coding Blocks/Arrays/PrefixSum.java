public class PrefixSum{
    static int[] createPrefixSumArray(int[] arr){
        int n = arr.length;
        int[] prefixArr = new int[n];
        prefixArr[0]=arr[0];
        for(int i=1;i<=n-1;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }
        return prefixArr;
    }
}