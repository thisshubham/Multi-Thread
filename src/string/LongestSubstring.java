package string;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";

        int left =0;
        int maxlength=0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right=0; right<str.length();right++){
             char c = str.charAt(right);
             if(map.containsKey(c)){
                 left = Math.max(left,map.get(c)+1);
             }
             map.put(c,right);
             maxlength = Math.max(maxlength,right-left+1);
        }
        System.out.println(maxlength);

    }
}
