import java.util.*;
public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println(result);
    }

//    public static void factorial(int a){
//        int res = 1;
//        if(a == 0){
//            System.out.println(res);
//        }
//        else if(a<0){
//            System.out.println("Invalid Number");
//        }
//        else{
//            while(a>0){
//                res = res *a;
//                a--;
//            }
//            System.out.println(res);
//        }
//    }
    public static int factorial(int x){
        int res =1;
        for(int i=1; i<=x; i++){
            res *= i;
        }
        return res;
    }
  }
