class Solution {
    public int mostWordsFound(String[] sentences) {

       int maxWord  = 0;

       for(String sentence : sentences)
       {
            String words[] = sentence.split(" ");
            maxWord = Math.max(maxWord, words.length);
       }
       return maxWord;
    }
}
