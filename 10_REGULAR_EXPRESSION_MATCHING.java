class Solution {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();

        boolean first = (!s.isEmpty() &&
                             (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));

        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) ||
                   (first && isMatch(s.substring(1), p));
        } else {
            return first && isMatch(s.substring(1), p.substring(1));
        }
    }
}
    
