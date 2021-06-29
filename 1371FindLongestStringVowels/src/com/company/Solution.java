package com.company;

class Solution {
    HashMap<Character, Integer> vowBitIndex = new HashMap<Character, Integer>() {
        {put('a', 1);
            put('e', 2);
            put('i', 4);
            put('o', 8);
            put('u', 16);
        }
    };

    public int findTheLongestSubstring(String s) {
        HashMap<Integer, Integer> stateIndex = new HashMap();
        stateIndex.put(0, -1);
        int state = 0, maxLen = 0;
        for (int i = 0; i < s.length(); ++i){
            char cur = s.charAt(i);
            if (vowBitIndex.containsKey(cur)){
                int bitFlip = vowBitIndex.get(cur);
                state ^= bitFlip;
            }

            stateIndex.putIfAbsent(state, i);
            maxLen = Math.max(maxLen, i - stateIndex.get(state));
        }

        return maxLen;
    }
}