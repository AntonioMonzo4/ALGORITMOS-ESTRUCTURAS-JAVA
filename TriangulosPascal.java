public class TriangulosPascal {
    
    public static int[][] pascal(int n){

        int [][]array=new int[n][n];

        for(int i=0; i<n;i++){

            for(int j=0; j<=i;j++){
                if (i==j||i==0) {
                    array[i][j]=1;
                }else{
                    array[i][j]=array[i-1][j-1]+array[i-1][j];
                }
            }
        }
    }

}
