class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(int i = 0;i<operations.length;i++){
            if(operations[i].contains("+"))
                value++;
            if(operations[i].contains("-"))
                value--;
        }
        return value;
    }
}
