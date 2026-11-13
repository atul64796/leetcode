class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if( magazine.length() < ransomNote.length())
        {
            return false;
        }

        int [] charCounts = new int[26];

        for(char ch : magazine.toCharArray())
        {
            charCounts[ ch - 'a']++;
        }

        for(char ch : ransomNote.toCharArray())
        {
            if(charCounts[ ch - 'a'] == 0 )
            {
                return false;
            }
             charCounts[ ch - 'a']--;
        }

        return true;
    }
}