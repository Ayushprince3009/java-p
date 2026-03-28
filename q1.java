import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = result(a,b,c);
        System.out.println(res);
    }

//    public static void result(int x, int y, int z){
//        int sum = x+y+z;
//        int avg = sum/3;
//        System.out.println(avg);
//    }

    public static int result(int x, int y, int z){
        int avg = (x+y+z)/3;
        return avg;
    }
}
