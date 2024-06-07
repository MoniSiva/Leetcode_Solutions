class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> returnList = new ArrayList<Integer>();
        for(int i = 0;i<words.length;i++){
            if(words[i].contains(""+x))
                returnList.add(i);
        }
        return returnList;
    }
}
