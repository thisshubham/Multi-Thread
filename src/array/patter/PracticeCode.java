package array.patter;

public class PracticeCode {
    public static void main(String[] args) {
        int[][] grid = {{1,3},{2,2}};

        int[][] grid2 = {{9,1,7},{8,9,2},{3,4,6}};
         int[] missingAndRepeadetNumber = findMissingNumber(grid);
        System.out.println("repeated : " +missingAndRepeadetNumber[0] +","+missingAndRepeadetNumber[1]);

    }
    public static int[] findMissingNumber(int[][] grid){
        int  n = grid.length;
        int size = n*n;

        boolean[] check = new boolean[size+1];

        int repeated = -1;
        int missing = -1;

        for(int i=0; i<n; i++){
            for(int j =0; j <n; j++){
                int num = grid[i][j];
                if(check[num]){
                    repeated = num;
                }else {
                    check[num]=true;
                }
            }
        }
        for (int i = 1; i<=size; i++){
            if(!check[i]){
                missing =i;
                break;
            }
        }
        return new int[]{repeated,missing};

    }
}
