public class MaxSubArraySum{
    static int maxSum(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0]=arr[0];
        fpr(int i=1;i<=n-1;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++){
            for(int j=i;j<=n-1;j++){
                if(i==0){
                   int current = prefix[j]; 
                }else{
                    int current = prefix[j]-prefix[i-1];
                }
                if(current>max){
                    max=current;
                } // current = Math.max(current,max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4,-5};
        System.out.println(maxSum(arr));
    }
}