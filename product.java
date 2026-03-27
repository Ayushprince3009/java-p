import java.util.*;
public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = product(a,b);
        System.out.println(res);
    }

//    public static void product(int x, int y){
//        System.out.println(x*y);
//    }

    public static int product(int x, int y){
        int pro = x*y;
        return pro;
    }

}
