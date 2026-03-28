import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean val = isEven(num);
        System.out.println(val);
    }

//    public static void isEven(int a){
//        if(a % 2 == 0){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }
//    }

    public static boolean isEven(int a){
        if(a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
