package find_resultant_array_after_removing_anagrams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArr = in.nextInt();
        String[] words = new String[sizeOfArr];
        for (int i=0;i<sizeOfArr;i++){
            words[i] = in.next();
        }
        System.out.println(removeAnagrams(words));
    }

    public static List<String> removeAnagrams(String[] words){
        for (int i=words.length-1;i>0;i--){
            if (checkForAnagram(words[i] , words[i-1])) words[i] = "";
        }
        List<String> result = new ArrayList<>();
        for (String s : words){
            if (!s.isEmpty()) result.add(s);
        }
        return result;
    }

    public static boolean checkForAnagram(String s , String t){
        return valid_anagram.Solution.isAnagram(s , t);
    }
}
