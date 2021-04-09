package com.company;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;

        int[] arr1 = new int[26], arr2 = new int[26];
        for (int i = 0; i < len1; i++) arr1[s1.charAt(i) - 'a']++;

        for (int i = 0; i < len1; i++) arr2[s2.charAt(i) - 'a']++;
        if (Arrays.equals(arr1, arr2)) return true;

        int front = 0;
        int rear = len1;
        while (rear < len2){
            arr2[s2.charAt(front)-'a']--;
            arr2[s2.charAt(rear) - 'a']++;
            if (Arrays.equals(arr1, arr2)) return true;
            front++;
            rear++;
        }

        return false;
    }
}