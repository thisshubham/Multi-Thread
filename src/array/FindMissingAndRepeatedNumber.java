package array;

public class FindMissingAndRepeatedNumber {
    public static void main(String[] args) {
        int[][] grid1 = {{1,3},{2,2}};
        int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};

        int repeat =-1;
        int missing =-1;
        int n = grid.length;
        int size = n*n;

        boolean[] check = new boolean[size+1];
        for(int i=0;i<n;i++){
            for(int j = 0 ; j<n;j++){
                int num = grid[i][j];
                if (check[num]){
                    repeat =num;
                }else {
                    check[num]=true;
                }

            }

        }
        for (int i=1; i<=size;i++){
            if(!check[i]){
                missing=i;
                break;

            }
        }

        System.out.println(repeat +","+ missing);

    }
}
