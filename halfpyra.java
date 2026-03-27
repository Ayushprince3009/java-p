public class halfpyra {
    public static void main(String[] args) {
        //half-pyramid
        int num = 4;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
