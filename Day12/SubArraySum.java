package Day12;

public class SubArraySum {
    public static void main(String[] args) {
        int[][] input={
            {3,0,1,4,2},
            {5,6,3,2,1},
            {1,2,0,1,5},
            {4,1,0,1,7},
            {1,0,3,0,5}
        };
        int[][] query={{2,1},
        {4,3}
        };
        int startRow=query[0][0];
            int startColunm=query[0][1];
            int stopRow=query[1][0];
            int stopColunm=query[1][1];
            int sum=0;
            for(int j=startRow;j<=stopRow;j++){
                for(int k=startColunm;k<=stopColunm;k++){
                     sum=sum+input[j][k];
                }
            }
            System.out.print(sum);
    }
}
