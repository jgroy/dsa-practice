// LeetCode #344 - Reverse String
// Solved on Day 2 - Two Pointer Technique

class ReverseString {
    public void reverseString(char[] s) {
        int l = s.length - 1;
        char temp = ' ';
        for(int i = 0; i < l; i++){
            temp = s[i];
            s[i] = s[l];
            s[l] = temp;
            l--;
        }
    }
}