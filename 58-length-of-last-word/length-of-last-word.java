class Solution {
    public int lengthOfLastWord(String s) {
           String newstr = s.strip();

           int count = 0;
           
           for(int i = newstr.length()-1; i >= 0; i--)
           {

                if(newstr.charAt(i) == ' ' )
                {
                    break;
                }
                else
                {
                    count++;
                }
           }
           return count;
    }
}