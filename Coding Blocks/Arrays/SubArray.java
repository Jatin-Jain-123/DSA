pulbic class SubArray{
    static void printSubArray(int[] arr){
        // type 1

    }
    // brute force - O(n^3)
    static void printSumSubArrayType1(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++){
            for(int j=i;j<=n-1;j++){
                int currentSum = 0;
                for(int k=i;k<=j;k++){
                    currentSum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.println("\t->\t"+currentSum);
                if(currentSum>max){
                    max=currentSum;
                }
            }
        }
        return max;
    }
    // optimized - O(n^2)
    static int printSumSubArrayType2(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++){
            int currentSum = 0;
            for(int j=i;j<=n-1;j++){
                currentSum += arr[j];
                if(currentSum > max){
                    max = currentSum;
                }
            }
            System.out.println(i+" -> "+j+" : "+currentSum);
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int maxSubArraySum = SubArray.printSumSubArrayType2(arr)
    }
}