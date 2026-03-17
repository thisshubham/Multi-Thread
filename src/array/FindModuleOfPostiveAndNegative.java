package array;

import java.util.Arrays;
import java.util.List;

public class FindModuleOfPostiveAndNegative {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        int couter =0;
        int couter1 =0;
        int couter2 =0;

        for (int i =0; i < arr.size(); i++){
            if(arr.get(i)>0){
                couter++;
            } else if (arr.get(i)<0) {
                couter1++;
            }else {
                couter2++;
            }

        }
        System.out.println((float)couter/arr.size());
        System.out.println((float)couter1/arr.size());
        System.out.println((float)couter2/arr.size());

    }
}
