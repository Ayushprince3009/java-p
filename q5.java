public class q5 {
    public static void main(String[] args) {
        int num = 23456;

        int result = sum(num);
        System.out.println(result);
    }

//    public static void sum(int a){
//        int sum = 0;
//        while(a > 0){
//            int last = a % 10;
//            sum += last;
//            a /= 10;
//        }
//        System.out.println(sum);
//    }

    public static int sum(int a){
        int sum = 0;
        while(a > 0){
            int last = a % 10;
            sum += last;
            a /= 10;
        }
        return sum;
    }

}
