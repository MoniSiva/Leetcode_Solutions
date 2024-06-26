class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int total = 0;
        int length = salary.length;
        for(int i = 0 ;i < length; i++){
            if(min > salary[i])
                min = salary[i];
            if(max < salary[i])
                max = salary[i];
            
            total += salary[i];
        }

        double avg = (double)(total-min-max)/(length - 2); 
        return avg;
    }
}
