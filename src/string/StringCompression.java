package string;

import java.util.HashMap;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aabbbccc";
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> frequencyHashMap = new HashMap<>();
//
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequencyHashMap.containsKey(ch)) {
                int count = frequencyHashMap.get(ch);
                count++;
                frequencyHashMap.replace(ch, count);
            } else {
                frequencyHashMap.put(ch, 1);
            }


        }

        // altername logic with defoult method
        for(Character ch : charArray){
            frequencyHashMap.put(ch,frequencyHashMap.getOrDefault(ch,0)+1);
        }
        // altername logic with merge method
        for(Character ch : charArray){
            frequencyHashMap.merge(ch,1,Integer::sum);
        }

        for (Character character : frequencyHashMap.keySet()) {
            System.out.print(character + "" + frequencyHashMap.get(character) + " ");
        }
    }
}
