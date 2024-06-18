class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first = "";
        String second = "";

        for(int i = 0 ;i < word1.length;i++)
            first = first + word1[i];
        
        for(int i = 0 ;i < word2.length;i++)
            second = second + word2[i];

        System.out.println(first + second);
        if(first.equals(second))
            return true;
        else
            return false;
    }
}
