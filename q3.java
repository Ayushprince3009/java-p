import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        boolean res = result(num);
        System.out.println(res);
    }

//    public static void result(int a) {
//        int rev = 0;
//        int original = a;
//        while(a>0){
//            int last = a % 10;
//            rev = (rev * 10) + last;
//            a /= 10;
//        }
//
//        if(rev == original){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }
//    }

    public static boolean result(int a) {
        int rev = 0;
        int original = a;
        while(a>0){
            int last = a % 10;
            rev = (rev * 10) + last;
            a /= 10;
        }

        if(rev == original){
            return true;
        }
        else{
            return false;
        }
    }
}
