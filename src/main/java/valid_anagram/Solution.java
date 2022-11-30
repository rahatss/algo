package valid_anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(isAnagram(s , t));
    }

    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length())
            return false;

        Map<Character , Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , map.get(s.charAt(i))+1);
                continue;
            }
            map.put(s.charAt(i) , 1);
        }

        for (int i=0;i<t.length();i++){
            if (map.containsKey(t.charAt(i))){
                map.put(t.charAt(i) , map.get(t.charAt(i))-1);
                continue;
            }
            return false;
        }

        for (int i : map.values()){
            if (i != 0) return false;
        }
        return true;
    }
}
