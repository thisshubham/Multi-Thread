package string;

import java.util.HashMap;

public class FindFirstRepeatingChar {
    public static void main(String[] args) {

        String str = "aabbckke";
        int counter=0;
         char[] charArray = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();

         for(char character : charArray){
            map.put(character,map.getOrDefault(character,0)+1);
         }
         for(char ch : charArray){
             if(map.get(ch)==1){
                 System.out.println(ch);
                 return;
             }
         }
    }
}
