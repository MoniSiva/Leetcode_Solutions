class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                                //HashMap to group by anagrams
       Map<String,List<String>> anagramMap = new HashMap<String,List<String>>();

        for(String word:strs){
            char chArray[] = word.toCharArray();
            Arrays.sort(chArray);
            String sortedWord = new String(chArray);
                          //Grouping anagrams based on Sorted Word as Key
            anagramMap.putIfAbsent(sortedWord,new ArrayList<>());
            anagramMap.get(sortedWord).add(word);
        }

        return new ArrayList(anagramMap.values());

    }
}
