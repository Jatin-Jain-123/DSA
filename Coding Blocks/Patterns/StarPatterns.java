public class StarPatterns{
    static void HalfPyramid(int n){
        for(int i=1;i<=n;i++){
            int j = 1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }
    static void InvertedHalfPyrmaid(int n){
        for(int i=n;i>=1;i--){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }
    static void MirroredHalfPyramid(int n){
        int i=1;
        while(i<=n){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
    static void MirroredInvertedHalfPyramid(int n){
        int i=n;
        while(i>=1){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
    public static void main(String[] args){
        StarPatterns.HalfPyramid(5);
        System.out.println();
        StarPatterns.InvertedHalfPyrmaid(5);
        System.out.println();
        StarPatterns.MirroredHalfPyramid(5);
        System.out.println();
        StarPatterns.MirroredInvertedHalfPyramid(5);
        System.out.println();
    }
}