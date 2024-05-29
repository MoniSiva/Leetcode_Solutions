class Solution {
    public int lengthOfLastWord(String s) {
        String[] arrStr = s.split(" ");
        return (arrStr[arrStr.length-1].length());
    }
}
