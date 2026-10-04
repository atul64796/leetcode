class Solution {
    public int mostWordsFound(String[] sentences) {

        int n = sentences.length;
        int maxWords = 0;

        for(String sentence : sentences)
        {
            String[] words = sentence.split(" ");
            maxWords = Math.max(maxWords,words.length);
        }
        return maxWords;
    }
}