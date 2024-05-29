class Solution {
    public String mergeAlternately(String word1, String word2) {
        String mergeString ="";
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0, j = 0;      
                              //Iterating parallely through two strings till its length
        while(i < len1  || j<len2 ){
            if(i < len1)
                mergeString += word1.charAt(i++);
            if(j < len2)
                mergeString += word2.charAt(j++);

        }
        return mergeString;
    }
}
