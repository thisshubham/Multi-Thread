package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClimbingtheLeaderboard {
    public static void main(String[] args) {
        List<Integer> rank = Arrays.asList(100, 90, 90, 80, 75, 60);
        List<Integer> players = Arrays.asList(50, 65, 77, 90, 102);
        List<Integer> results = new ArrayList<>();
        List<Integer> uniqueArray = rank
                .stream()
                .distinct()
                .collect(Collectors.toList());

        int size = uniqueArray.size()-1;

        for (Integer score  : players){
            while (size>=0 && score >=uniqueArray.get(size) ){
                size--;
            }
            results.add(size+2);
        }
        System.out.println(results);
//return results;
    }
}
