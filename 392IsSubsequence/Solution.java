class Solution {
    public boolean isSubsequence(String s, String t) {
        Integer leftBound = s.length(), rightBound = t.length();
        Integer left = 0, right = 0;
        while (left < leftBound && right < rightBound){
            if (s.charAt(left) == t.charAt(right)){
                left += 1;
            }
            right += 1;
        }
        return left == leftBound;

    }
}