class SolutionUsingStreams {
    public int numJewelsInStones(String jewels, String stones) {
       return (int)stones.chars().filter(c-> jewels.contains((char)c+"")).count();
    }
}
