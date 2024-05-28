class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (Stream.of(ransomNote).allMatch(magazine::contains)) 
           return true;
        return false;
 
    }
}
