import java.util.*;

public class SubArray{
    static void printSubArray(int[] arr){
        int n = arr.length;
        // Type 1: O(n^3)
        /*
        for(int i=0;i<=n-1;i++){
            for(int j =i;j<=n-1;j++){
                printArray(arr,i,j);
            }
        }
        */

       // Type 2: O(n^2)
        for(int i=0;i<=n-1;i++){
            List<Integer> currentSubArray = new ArrayList<>();
            for(int j=i;j<=n-1;j++){
                currentSubArray.add(arr[j]);
                System.out.println(currentSubArray);
            }
        }
    }

    static int maxSum(int[] arr){
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        // O(n^3)
        /*
        for(int i=0;i<=n-1;i++){
            for(int j=i;j<=n-1;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                max=Math.max(max,sum);
            }
        }
        */

       // O(n^2)
       /*
       for(int i=0;i<=n-1;i++){
        int sum = 0;
        for(int j=i;j<=n-1;j++){
            sum+=arr[j];
            max = Math.max(max,sum);
        }
       }
        */


       // O(n^2)
        int[] prefix = Helper.createPrefixSumArray(arr);
        for(int i=0;i<=n-1;i++){
            for(int j=i;j<=n-1;j++){
                int sum=0;
                if(i==0){
                    sum+= prefix[j];
                }else{
                sum+= prefix[j]-prefix[i-1];
                }
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}