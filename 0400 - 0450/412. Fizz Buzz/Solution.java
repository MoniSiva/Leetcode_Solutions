class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> returnStr = new ArrayList<String>();
        for(int i = 1;i<=n;i++){
            if((i%3) == 0 && (i%5) == 0)
                returnStr.add("FizzBuzz");
            else if(i%3 == 0)
                returnStr.add("Fizz");
            else if(i%5 == 0)
                returnStr.add("Buzz");
            else
                returnStr.add(String.valueOf(i));           

        }
        return returnStr;
    }
}
