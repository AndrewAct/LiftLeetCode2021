package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        Set<Character> set1 = new HashSet();
        Set<Character> set2 = new HashSet();
        for (char i: word1.toCharArray()){
            array1[i -'a']++;
            set1.add(i);
        }
        for (char i: word2.toCharArray()){
            array2[i- 'a']++;
            set2.add(i);
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        return set1.equals(set2) && Arrays.equals(array1, array2);

    }
}