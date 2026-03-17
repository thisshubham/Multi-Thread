package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharacterFrequency {
    public static void main(String[] args) {
        String str = "njjde@jmne";
         char[] charArray = str.toCharArray();
         HashMap<Character,Integer> map = new HashMap<>();
       for(Character character : charArray){
           // Ignore special characters
           if (!Character.isLetterOrDigit(character)) {
               continue;
           }
           map.put(character,map.getOrDefault(character,0)+1);
       }
        List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(map.entrySet());
       entryList.sort((a,b)->b.getValue()-a.getValue());
       for(Map.Entry<Character,Integer> character:entryList){
           System.out.println(character.getKey() + " -> " + character.getValue());
       }
    }

}
