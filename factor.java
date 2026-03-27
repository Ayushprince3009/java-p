import java.util.*;
public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        factorial(num);
    }

    public static void factorial(int a){
        int res = 1;
        if(a == 0){
            System.out.println(res);
        }
        else if(a<0){
            System.out.println("Invalid Number");
        }
        else{
            while(a>0){
                res = res *a;
                a--;
            }
            System.out.println(res);
        }

    }

}
