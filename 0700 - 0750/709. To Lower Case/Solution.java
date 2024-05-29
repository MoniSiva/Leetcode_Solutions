class Solution {
    public String toLowerCase(String s) {
        String lower = "";
        for(int i = 0;i<s.length();i++){
                            //Check For Capital Letter
            if(s.charAt(i) >= 65 && s.charAt(i)<=90 )
                lower = lower + (char)(s.charAt(i) + 32);
            else
                lower +=s.charAt(i);
        }
        return lower;
    }
}
