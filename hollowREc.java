public class hollowREc {
    public static void main(String[] args) {
        int row = 7;
        int col = 6;
        hollow(row, col);
    }

    public static void hollow(int x, int y){
        //outer loop
        for(int i=1; i<=x; i++){
            //inner loop
            for(int j=1; j<=y; j++){
                if(i == 1 || j == 1 || i == x || j == y){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
