package com.company;

class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hp = new HashMap<>();
        for (char c: t.toCharArray()){
            hp.put(c, hp.getOrDefault(c,0)+1);
        }

        int num = t.length();
        String res = "";
        int len = Integer.MAX_VALUE;
        int j = 0;
        for (int i =0; i< s.length(); i++) {
            char c = s.charAt(i);
            if (hp.containsKey(c)) {
                int numChar = hp.get(c)- 1;
                hp.put(c, numChar);

                if (numChar >= 0) num--;
            }

            while (num == 0) {
                if (i - j+ 1 < len) {
                    res = s.substring(j, i+1);
                    len = i-j+1;
                }
                char jChar = s.charAt(j);

                if (hp.containsKey(jChar)){
                    int numJ = hp.get(jChar)+1;
                    hp.put(jChar, numJ);

                    if (numJ > 0) num++;
                }
                j++;
            }
        }
        return res;

    }
}