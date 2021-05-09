//class Solution {
//    public boolean isSubsequence(String s, String t) {
//        Integer leftBound = s.length(), rightBound = t.length();
//        Integer left = 0, right = 0;
//        while (left < leftBound && right < rightBound){
//            if (s.charAt(left) == t.charAt(right)){
//                left += 1;
//            }
//            right += 1;
//        }
//        return left == leftBound;
//
//    }
//}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int leftBound = s.length(), rightBound = t.length();
        int i = 0, j = 0;
        while (i < leftBound && j < rightBound) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else j++;
        }
        if (i == leftBound) return true;
        else return false;

    }
}