import java.util.InputMismatchException;
import java.util.Scanner;
public class Random{
    
    public static String checkOddEven(int n){
        return n%2==0?"Even":"Odd";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
        try {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            System.out.println(checkOddEven(n));
            run=false;
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid integer");
            sc.next();
        }
        }
        sc.close();
    }
    }