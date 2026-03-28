public class binomial {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int finalresult = binomialcoff(a,b);
        System.out.println(finalresult);
    }

    public static int facto(int x){
        int res = 1;
        for(int i= 1; i<=x; i++){
            res *= i;
        }
        return res;
    }

    public static int binomialcoff(int n, int r) {
        int fact_a = facto(n);
        int fact_b = facto(r);
        int fact_amr = facto(n - r);

        int result = (fact_a) / ((fact_b) * (fact_amr));
        return result;
        //result returned
    }
}
