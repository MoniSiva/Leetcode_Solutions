class Solution {
    public int strStr(String haystack, String needle) {
       for(int i = 0;i<haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(0) && needle.length() <= haystack.length()-i ){
               String sub = haystack.substring(i,i+(needle.length()));
                System.out.println(sub);
                if(sub.equals(needle))
                    return i;
            }
       }
       return -1;
    }
}
