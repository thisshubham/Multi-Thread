package string;

import java.util.*;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String string = "programming";
         char[] charArray = string.toCharArray();
         Set<Character> characters = new HashSet<>();
         for(char character: charArray){
             characters.add(character);
         }
         StringBuilder stringBuilder = new StringBuilder();
         for(char ch : characters){
             stringBuilder.append(ch);
         }
        System.out.println(stringBuilder.toString());
    }
}
